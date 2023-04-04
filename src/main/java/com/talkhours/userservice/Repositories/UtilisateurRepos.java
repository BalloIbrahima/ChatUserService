package com.talkhours.userservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talkhours.userservice.Entities.Utilisateur;

@RepositoryRestResource
public interface UtilisateurRepos extends JpaRepository<Utilisateur,Long>{
    Utilisateur findByEmail(String email);
}
