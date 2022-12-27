package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Owner;
import fr.souhail.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class OwnerServiceMap extends CrudAbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner object) {
        return super.map.put(object.getId(),object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return super.map.values()
                .stream()
                .filter(owner -> owner.getLastname().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);

    }
}
