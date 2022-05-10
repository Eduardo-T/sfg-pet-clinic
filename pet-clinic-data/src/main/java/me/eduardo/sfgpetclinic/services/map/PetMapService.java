package me.eduardo.sfgpetclinic.services.map;

import me.eduardo.sfgpetclinic.model.Pet;
import me.eduardo.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll(Long id) {
        return super.findAll(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
