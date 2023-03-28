package baykov.daniel.springpetclinic.services;

import baykov.daniel.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
