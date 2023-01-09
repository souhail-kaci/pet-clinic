package fr.souhail.petclinic.services.map;

import fr.souhail.petclinic.model.Owner;
import fr.souhail.petclinic.model.Pet;
import fr.souhail.petclinic.services.OwnerService;
import fr.souhail.petclinic.services.PetService;
import fr.souhail.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;


@Service
public class OwnerServiceMap extends CrudAbstractMapService<Owner, Long> implements OwnerService {


    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner save(Owner object) {

        if (object == null) {
            return null;
        }

        if (object.getPets() != null) {
            object.getPets()
                    .forEach(pet -> {
                        if (pet.getPetType() == null) {
                            throw new RuntimeException("PetType canot be null");
                        }

                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(this.petTypeService.save(pet.getPetType()));
                        }
                        if (pet.getId() == null) {
                            Pet savedPet = this.petService.save(pet);
                            pet.setId(savedPet.getId());
                        }
                    });
        }

        return super.save(object);


    }

    @Override
    public Owner findByLastName(String lastName) {
        return super.map.values()
                .stream()
                .filter(owner -> owner.getLastname().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);

    }
}
