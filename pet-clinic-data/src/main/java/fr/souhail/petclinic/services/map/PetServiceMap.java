package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends CrudAbstractMapService<Pet, Long> {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
