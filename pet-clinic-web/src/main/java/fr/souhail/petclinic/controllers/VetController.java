package fr.souhail.petclinic.controllers;


import fr.souhail.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets.html","/vets"})
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping
    public String listVets(Model model) {

        model.addAttribute("vets", this.vetService.findAll());

        return "vets/index";
    }

}
