package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Vet;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends CrudAbstractMapService<Vet,Long> {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
