package twonyizin.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twonyizin.springframework.sfgpetclinic.model.Pet;
import twonyizin.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
