package twonyizin.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import twonyizin.springframework.sfgpetclinic.model.*;
import twonyizin.springframework.sfgpetclinic.services.OwnerService;
import twonyizin.springframework.sfgpetclinic.services.PetTypeService;
import twonyizin.springframework.sfgpetclinic.services.VetService;
import twonyizin.springframework.sfgpetclinic.services.VisitService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
private final OwnerService ownerService;
private final VetService vetService;
private final PetTypeService petTypeService;
private final VisitService visitService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

     Owner owner1 = new Owner();
   //  owner1.setId(1L);
     owner1.setFirstName("Michael");
     owner1.setLastName("Weston");
     owner1.setAddress("123 Brickerel");
     owner1.setCity("Miami");
     owner1.setTelephone("123456");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner((owner1));
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName(("Rosco"));
        owner1.getPets().add(mikesPet);
     ownerService.save(owner1);

        Owner owner2 = new Owner();
      //  owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("123456");
        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(fionasCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneeze Kitty");
        visitService.save(catVisit);

        System.err.println("Loaded Owners....");

        Vet vet1 = new Vet();
       // vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
      //  vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.err.println("Loaded Vets....");
    }
}
