package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
