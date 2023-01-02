package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Vet;
import fr.souhail.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends CrudAbstractMapService<Vet, Long> implements VetService {

}
