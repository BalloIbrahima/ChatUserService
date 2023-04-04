package com.bugbooks.userservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bugbooks.userservice.Entites.Utilisateur;
@RepositoryRestResource
public interface UtilisateurRepos extends JpaRepository<Utilisateur,Long>{
    Utilisateur findByEmail(String email);
}
