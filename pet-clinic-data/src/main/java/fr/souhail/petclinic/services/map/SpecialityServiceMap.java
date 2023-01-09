package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Speciality;
import fr.souhail.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceMap extends CrudAbstractMapService<Speciality, Long>
        implements SpecialityService {

}
