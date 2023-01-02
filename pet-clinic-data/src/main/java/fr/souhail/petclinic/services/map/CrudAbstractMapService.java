package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.BaseEntity;
import fr.souhail.petclinic.services.CrudService;

import java.util.*;

public abstract class CrudAbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T object) {
        if (object == null) {
            throw new RuntimeException("Object cannot be null");
        }

        if (object.getId() == null) {
            object.setId(this.getId());
        }

        this.map.put(object.getId(), object);

        return object;


    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(ID id) {
        this.map.remove(id);

    }

    private Long getId() {
        try {
            return Collections.max(this.map.keySet()) + 1;
        } catch (Exception ex) {
            return 1L;
        }
    }


}
