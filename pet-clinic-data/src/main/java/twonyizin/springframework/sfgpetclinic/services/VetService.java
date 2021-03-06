package twonyizin.springframework.sfgpetclinic.services;

import twonyizin.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
