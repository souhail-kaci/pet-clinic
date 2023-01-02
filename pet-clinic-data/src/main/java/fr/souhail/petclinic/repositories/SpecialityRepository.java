package fr.souhail.petclinic.repositories;

import fr.souhail.petclinic.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality,Long> {
}
