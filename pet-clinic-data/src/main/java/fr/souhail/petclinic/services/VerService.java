package fr.souhail.petclinic.services;

import fr.souhail.petclinic.model.Vet;

import java.util.Set;

public interface VerService {
    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
