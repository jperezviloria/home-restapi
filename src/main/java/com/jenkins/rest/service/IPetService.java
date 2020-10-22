package com.jenkins.rest.service;

import com.jenkins.rest.model.Pet;

import java.util.List;
import java.util.Optional;

public interface IPetService {

    List<Pet> getAllPets();

    Optional<Pet> getPetById(String idPet);

    String savePet(Pet pet);

}
