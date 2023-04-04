package com.talkhours.userservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Utilisateur {

    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String numero;
    private String profile;
}
