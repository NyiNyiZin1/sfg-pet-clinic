package twonyizin.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;
import twonyizin.springframework.sfgpetclinic.model.PetType;
import twonyizin.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface PetTypeService extends CrudService<PetType,Long> {

    PetType findById(Long id);

    PetType save(PetType petType);

    Set<PetType> findAll();
}
