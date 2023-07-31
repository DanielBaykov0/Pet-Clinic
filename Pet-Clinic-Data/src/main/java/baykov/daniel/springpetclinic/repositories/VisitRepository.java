package baykov.daniel.springpetclinic.repositories;

import baykov.daniel.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
