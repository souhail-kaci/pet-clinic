package fr.souhail.petclinic.services.springdatajpa;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jpa")
public class OwnerJpaService{
//        extends CrudAbstractJpaService<Owner, Long, OwnerRepository>
//        implements OwnerService {
//
//
//    @Autowired
//    public OwnerJpaService(OwnerRepository ownerRepository) {
//        super(ownerRepository);
//    }
//
//    @Override
//    public Owner findByLastName(String lastName) {
//        return repository.findOwnerByLastname(lastName).orElse(null);
//    }
}
