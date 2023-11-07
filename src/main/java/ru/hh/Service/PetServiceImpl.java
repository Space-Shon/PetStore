package ru.hh.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hh.Pets.Pet;
import ru.hh.repository.PetsRepository;
import ru.hh.request.PetRequest;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetsService {

    @Autowired
    private final PetsRepository petsRepository;
    //PUT
    @Override
    public Pet createPet(PetRequest petRequest){
        return petsRepository.save(Pet.builder()
                .name(petRequest.getName())
                .type(petRequest.getType())
                .age(petRequest.getCost())
                .cost(petRequest.getCost())
                .build()
        );
    }
    //PUT
    @Override
    public Pet putPet(Pet pet){
        return petsRepository.save(pet);
    }

    //GET
    @Override
    public List<Pet> getPets(){
        return petsRepository.findAll();
    }

    //GET BY ID
    @Override
    public Optional<Pet> getPet(Integer id){
        return petsRepository.findById(id);
    }

    //DELETE BY ID
    @Override
    public void delete(Integer id){
        petsRepository.deleteById(id);
    }
}
