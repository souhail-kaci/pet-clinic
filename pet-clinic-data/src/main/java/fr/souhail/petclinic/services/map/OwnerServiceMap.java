package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Owner;
import org.springframework.stereotype.Service;


@Service
public class OwnerServiceMap extends CrudAbstractMapService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
