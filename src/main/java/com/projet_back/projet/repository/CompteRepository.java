package com.projet_back.projet.repository;

import com.projet_back.projet.entity.Compte;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepository extends CrudRepository<Compte,Integer> {
    @Query("SELECT c FROM Compte c WHERE c.solde < solde")
    List<Compte> getCompteSup(@Param("solde") double solde);
}
