package twonyizin.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twonyizin.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
