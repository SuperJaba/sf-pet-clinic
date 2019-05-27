package pl.superjaba.sfpetclinic.services;

import pl.superjaba.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
