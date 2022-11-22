package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CrudMapService<T, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

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
        return null;
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(ID id) {
        this.map.remove(id);

    }

    protected T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

}
