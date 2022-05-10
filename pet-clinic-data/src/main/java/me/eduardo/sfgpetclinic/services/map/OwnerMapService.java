package me.eduardo.sfgpetclinic.services.map;

import me.eduardo.sfgpetclinic.model.Owner;
import me.eduardo.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll(Long id) {
        return super.findAll(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
