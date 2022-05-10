package me.eduardo.sfgpetclinic.services;

import me.eduardo.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
