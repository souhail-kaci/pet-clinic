package fr.souhail.petclinic.services.springdatajpa;

import fr.souhail.petclinic.model.Owner;
import fr.souhail.petclinic.repositories.OwnerRepository;
import fr.souhail.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jpa")
public class OwnerJpaService
        extends CrudAbstractJpaService<Owner, Long, OwnerRepository>
        implements OwnerService {


    @Autowired
    public OwnerJpaService(OwnerRepository ownerRepository) {
        super(ownerRepository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findOwnerByLastname(lastName).orElse(null);
    }
}
