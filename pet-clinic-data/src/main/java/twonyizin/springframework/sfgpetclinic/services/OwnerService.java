package twonyizin.springframework.sfgpetclinic.services;

import twonyizin.springframework.sfgpetclinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
    List<Owner> findByLastNameLike(String lastName);
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
