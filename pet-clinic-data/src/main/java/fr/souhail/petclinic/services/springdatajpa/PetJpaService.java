package fr.souhail.petclinic.services.springdatajpa;

import fr.souhail.petclinic.model.Pet;
import fr.souhail.petclinic.repositories.PetRepository;
import fr.souhail.petclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jpa")
public class PetJpaService
        extends CrudAbstractJpaService<Pet, Long, PetRepository>
        implements PetService {

    @Autowired
    public PetJpaService(PetRepository repository) {
        super(repository);
    }
}
