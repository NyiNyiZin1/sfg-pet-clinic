package twonyizin.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twonyizin.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
