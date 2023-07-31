package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
