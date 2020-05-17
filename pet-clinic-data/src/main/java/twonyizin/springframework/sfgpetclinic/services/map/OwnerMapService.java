package twonyizin.springframework.sfgpetclinic.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import twonyizin.springframework.sfgpetclinic.model.Owner;
import twonyizin.springframework.sfgpetclinic.model.Pet;
import twonyizin.springframework.sfgpetclinic.services.OwnerService;
import twonyizin.springframework.sfgpetclinic.services.PetService;
import twonyizin.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile({"default","map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
private final PetTypeService petTypeService;
private final PetService petService;

	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findByLastName(String lastName) {

		return this.findAll()
				.stream()
				.filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<Owner> findByLastNameLike(String lastName) {
		return null;
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		if (object !=null){
			if (object.getPets()!=null){
				object.getPets().forEach(pet -> {
					if (pet.getPetType()!=null){
						if (pet.getPetType().getId()==null){
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet Type is required");
					}
					if (pet.getId()==null){
						Pet savePet = petService.save(pet);
						pet.setId(savePet.getId());
					}
				});
			}
			return super.save(object);
		}
		else {
			return null;
		}
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
