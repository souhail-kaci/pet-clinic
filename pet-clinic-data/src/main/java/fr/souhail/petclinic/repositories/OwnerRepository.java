package fr.souhail.petclinic.repositories;

import fr.souhail.petclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner,Long> {

    Optional<Owner> findOwnerByLastname(String lastName);

}
