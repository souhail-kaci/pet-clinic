package fr.souhail.petclinic.model;

import java.util.Set;

public class Vet extends Personne {

    private Set<Speciality> specialities;


    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
