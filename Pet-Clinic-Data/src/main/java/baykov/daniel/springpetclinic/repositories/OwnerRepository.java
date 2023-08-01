package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameIgnoreCaseLike(String lastName);
}
