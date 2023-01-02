package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Pet;
import fr.souhail.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends CrudAbstractMapService<Pet, Long> implements PetService {

}
