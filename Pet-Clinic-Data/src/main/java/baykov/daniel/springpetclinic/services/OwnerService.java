package baykov.daniel.springpetclinic.services;

import baykov.daniel.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameIgnoreCaseLike(String lastName);
}
