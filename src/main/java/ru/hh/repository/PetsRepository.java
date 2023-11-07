package ru.hh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hh.Pets.Pet;

@Repository
public interface PetsRepository extends JpaRepository<Pet, Integer> {

}
