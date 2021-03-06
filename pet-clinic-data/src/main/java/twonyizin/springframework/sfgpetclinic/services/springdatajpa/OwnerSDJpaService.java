package twonyizin.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import twonyizin.springframework.sfgpetclinic.model.Owner;
import twonyizin.springframework.sfgpetclinic.repositories.OwnerRepository;
import twonyizin.springframework.sfgpetclinic.repositories.PetRepository;
import twonyizin.springframework.sfgpetclinic.repositories.PetTypeRepository;
import twonyizin.springframework.sfgpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")//conflit OnwerMapService.java becauser the same implements OwnerService
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Owner findByLastName(String lastName) {

        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        System.err.println("##########################");
        System.err.println("##########################");
        System.err.println("##########################");
        System.err.println("##########################");
        System.err.println("##########################");
        System.err.println("##########################");


        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner object) {
ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
ownerRepository.deleteById(aLong);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }
}
