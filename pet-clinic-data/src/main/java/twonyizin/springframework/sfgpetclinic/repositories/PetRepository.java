package twonyizin.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twonyizin.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
