package fr.souhail.petclinic.model;

import java.util.Set;

public class Owner extends Personne {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
