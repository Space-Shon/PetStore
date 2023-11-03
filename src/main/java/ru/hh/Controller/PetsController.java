package ru.hh.Controller;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hh.Pets.Pet;
import ru.hh.Service.PetsService;
import ru.hh.request.PetRequest;


@RestController
@Getter
@Setter
@RequestMapping(value = "/petsStore", produces = MediaType.APPLICATION_JSON_VALUE)
public class PetsController {



    private final PetsService petsService;
    public PetsController(PetsService petsService){
        this.petsService = petsService;
    }
    @PostMapping
    public ResponseEntity<Pet> createPet(@RequestBody @Valid PetRequest request){
        Pet pet = petsService.createPet(request);
        return ResponseEntity.ok(pet);
    }



}
