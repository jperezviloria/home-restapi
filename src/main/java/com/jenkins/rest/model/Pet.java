package com.jenkins.rest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "pet")
public class Pet {

    @Id
    private String idPet;
    private String namePet;
    private String breedPet;

}
