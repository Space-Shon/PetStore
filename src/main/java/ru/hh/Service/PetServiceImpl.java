package ru.hh.Service;

import org.springframework.stereotype.Service;
import ru.hh.Pets.Pet;
import ru.hh.request.PetRequest;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetServiceImpl implements PetsService {

    private final List<Pet> petList = new ArrayList<>();

    private Integer count = 1;

    @Override
    public Pet createPet(PetRequest petRequest){
        Pet pet = new Pet();
        pet.create(petRequest, count);
        petList.add(pet);
        count++;
        return pet;
    }
}
