package com.talkhours.userservice.Entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Utilisateur {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String numero;
    private String profile;
}
