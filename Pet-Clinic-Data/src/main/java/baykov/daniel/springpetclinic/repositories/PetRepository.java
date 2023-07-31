package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
