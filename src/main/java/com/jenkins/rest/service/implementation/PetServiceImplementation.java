package com.jenkins.rest.service.implementation;

import com.jenkins.rest.model.Pet;
import com.jenkins.rest.repository.PetRepository;
import com.jenkins.rest.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImplementation implements IPetService  {

    @Autowired
    PetRepository petRepository;

    @Override
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    @Override
    public Optional<Pet> getPetById(String idPet) {
        return petRepository.findById(idPet);
    }

    @Override
    public String savePet(Pet pet) {
        petRepository.save(pet);
        return "Saved pet";
    }
}
