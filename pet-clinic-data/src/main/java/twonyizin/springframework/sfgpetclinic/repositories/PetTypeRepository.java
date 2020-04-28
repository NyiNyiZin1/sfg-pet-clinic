package twonyizin.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twonyizin.springframework.sfgpetclinic.model.Pet;

public interface PetTypeRepository extends CrudRepository<Pet,Long> {
}
