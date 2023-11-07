package ru.hh.Controller;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hh.Pets.Pet;
import ru.hh.Service.PetsService;
import ru.hh.request.PetRequest;

import java.util.List;
import java.util.Optional;


@RestController
@Getter
@Setter
@RequestMapping(value = "/petsStore", produces = MediaType.APPLICATION_JSON_VALUE)
public class PetsController {
    @Autowired
    private final PetsService petsService;

    public PetsController(PetsService petsService){
        this.petsService = petsService;
    }
    //POST
    @PostMapping
    public ResponseEntity<Pet> createPet(@RequestBody @Valid PetRequest request) {
        Pet pet = petsService.createPet(request);
        return ResponseEntity.ok(pet);
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Pet> putPet(@RequestBody @Valid Pet put){
        Pet pet = petsService.putPet(put);
        return ResponseEntity.ok(pet);
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Pet>> getPet(){
        return new ResponseEntity<>(petsService.getPets(), HttpStatus.OK);
    }

    //GET BY ID
    @GetMapping("/{id}")
    public Optional<Pet> getPetId(@PathVariable Integer id){
        return petsService.getPet(id);
    }

    //DELETE BY ID
    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Integer id){
        petsService.delete(id);
    }

}
