package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Pet;

public class PetServiceMap extends CrudMapService<Pet, Long> {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
