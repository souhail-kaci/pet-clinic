package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Owner;


public class OwnerServiceMap extends CrudMapService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
