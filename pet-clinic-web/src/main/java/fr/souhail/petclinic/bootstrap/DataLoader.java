package fr.souhail.petclinic.bootstrap;

import fr.souhail.petclinic.model.Owner;
import fr.souhail.petclinic.model.Pet;
import fr.souhail.petclinic.model.PetType;
import fr.souhail.petclinic.model.Vet;
import fr.souhail.petclinic.services.OwnerService;
import fr.souhail.petclinic.services.PetTypeService;
import fr.souhail.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = this.petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = this.petTypeService.save(cat);

        System.out.println("Loaded PetType....");


        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Michael");
        owner1.setLastname("Weston");
        owner1.setAddress("13 Bay Loli");
        owner1.setCity("City 1");
        owner1.setTelephone("123365478");

        Pet mikesPets = new Pet();
        mikesPets.setName("dolf");
        mikesPets.setPetType(savedDogPetType);
        mikesPets.setOwner(owner1);
        mikesPets.setBirthDate(LocalDate.of(2007, 1, 11));

        owner1.getPets().add(mikesPets);


        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Fiona");
        owner2.setLastname("Glenanne");
        owner2.setAddress("16 Bay Loli");
        owner2.setCity("City 2");
        owner2.setTelephone("123365478");

        Pet fionaCat = new Pet();
        fionaCat.setBirthDate(LocalDate.now());
        fionaCat.setOwner(owner2);
        fionaCat.setPetType(savedCatPetType);
        fionaCat.setName("Just cat");

        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Sam");
        vet1.setLastname("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Jessie");
        vet2.setLastname("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }

}
