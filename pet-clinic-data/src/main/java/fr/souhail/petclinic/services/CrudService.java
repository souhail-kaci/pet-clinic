package fr.souhail.petclinic.services;

import fr.souhail.petclinic.model.BaseEntity;

import java.util.Set;

public interface CrudService<T extends BaseEntity, ID extends Long> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
