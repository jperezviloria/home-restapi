package com.jenkins.rest.repository;

import com.jenkins.rest.model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {
}
