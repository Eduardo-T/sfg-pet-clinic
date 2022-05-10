package me.eduardo.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll(ID id) {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(ID id, T t) {
        map.put(id, t);
        return t;
    }

    public void delete(T t) {
        map.entrySet().removeIf(o -> o.getValue().equals(t));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

}
