package twonyizin.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import twonyizin.springframework.sfgpetclinic.model.Pet;
import twonyizin.springframework.sfgpetclinic.repositories.PetRepository;
import twonyizin.springframework.sfgpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")//conflit PetMapService.java becauser the same implements PetService
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet object) {
petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
petRepository.deleteById(aLong);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }
}
