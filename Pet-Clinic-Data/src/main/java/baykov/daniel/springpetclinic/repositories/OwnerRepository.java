package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
