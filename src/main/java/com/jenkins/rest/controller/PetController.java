package com.jenkins.rest.controller;

import com.jenkins.rest.model.Pet;
import com.jenkins.rest.service.implementation.PetServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetServiceImplementation petServiceImplementation;

    @GetMapping
    public List<Pet> getAllPets(){
        return petServiceImplementation.getAllPets();
    }

    @PostMapping
    public String savePet(@RequestBody Pet pet){
        return petServiceImplementation.savePet(pet);
    }

}
