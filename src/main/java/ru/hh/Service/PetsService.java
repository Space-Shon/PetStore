package ru.hh.Service;

import ru.hh.Pets.Pet;
import ru.hh.request.PetRequest;

public interface PetsService {
    Pet createPet(PetRequest petRequest);
}
