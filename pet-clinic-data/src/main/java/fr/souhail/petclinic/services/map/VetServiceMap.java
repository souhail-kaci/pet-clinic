package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Vet;

public class VetServiceMap extends CrudMapService<Vet,Long>{

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
