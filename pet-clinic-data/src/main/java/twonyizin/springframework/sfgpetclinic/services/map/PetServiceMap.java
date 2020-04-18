package twonyizin.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;
import twonyizin.springframework.sfgpetclinic.model.Pet;
import twonyizin.springframework.sfgpetclinic.services.CrudService;
import twonyizin.springframework.sfgpetclinic.services.PetService;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
