package fr.souhail.petclinic.services.springdatajpa;

import fr.souhail.petclinic.model.Vet;
import fr.souhail.petclinic.repositories.VetRepository;
import fr.souhail.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jpa")
public class VetJpaService
        extends CrudAbstractJpaService<Vet, Long, VetRepository>
        implements VetService {

    @Autowired
    public VetJpaService(VetRepository repository) {
        super(repository);
    }
}
