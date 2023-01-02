package fr.souhail.petclinic.services.springdatajpa;

import fr.souhail.petclinic.model.BaseEntity;
import fr.souhail.petclinic.services.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;
import java.util.Set;

public class CrudAbstractJpaService<T extends BaseEntity,
        ID extends Long,
        R extends JpaRepository<T, ID>>
        implements CrudService<T, ID> {

    protected final R repository;

    public CrudAbstractJpaService(R repository) {
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(this.repository.findAll());
    }

    @Override
    public T findById(ID id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public T save(T object) {
        return this.repository.save(object);
    }

    @Override
    public void delete(T object) {
        this.repository.delete(object);
    }

    @Override
    public void deleteById(ID id) {
        this.repository.deleteById(id);
    }



}
