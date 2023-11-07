package ru.hh.Service;

import ru.hh.Pets.Pet;
import ru.hh.request.PetRequest;

import java.util.List;
import java.util.Optional;

public interface PetsService {
    Pet createPet(PetRequest petRequest);
    Pet putPet(Pet pet);
    List<Pet> getPets();
    Optional<Pet> getPet(Integer id);
    void delete(Integer id);
}
