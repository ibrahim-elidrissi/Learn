package com.projet_back.projet.service;

import com.projet_back.projet.entity.Compte;
import com.projet_back.projet.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository;

    public List<Compte> getAll(){
        return (List<Compte>) compteRepository.findAll();
    }

    public int add(String rib,double solde){
        Compte c = new Compte(rib,solde);
        compteRepository.save(c);
        return 1;
    }

    public Compte findOne(int id){
        return compteRepository.findById(id).get();
    }

    public List<Compte> getCompteSupOf(double solde){
        return compteRepository.getCompteSup(solde);
    }
}
