package me.eduardo.sfgpetclinic.services.map;

import me.eduardo.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T t) {
        if (t != null) {
            if (t.getId() == null)
                t.setId(getNextId());

                map.put(t.getId(), t);

        } else
            throw new RuntimeException("Object cannot be null");
        return t;
    }

    public void delete(T t) {
        map.entrySet().removeIf(o -> o.getValue().equals(t));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException ex) {
            nextId = 1L;
        }

        return nextId;
    }

}
