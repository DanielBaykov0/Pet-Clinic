package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
