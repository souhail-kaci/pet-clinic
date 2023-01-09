package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.PetType;
import fr.souhail.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends CrudAbstractMapService<PetType, Long> implements PetTypeService{
}
