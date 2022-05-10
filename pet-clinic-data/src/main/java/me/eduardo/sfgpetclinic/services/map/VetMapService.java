package me.eduardo.sfgpetclinic.services.map;

import me.eduardo.sfgpetclinic.model.Vet;
import me.eduardo.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll(Long id) {
        return super.findAll(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
