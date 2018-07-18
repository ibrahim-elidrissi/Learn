package com.projet_back.projet.controller;

import com.projet_back.projet.entity.Compte;
import com.projet_back.projet.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CompteController {

    @Autowired
    private CompteService compteService;

    @GetMapping("/compte/test")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/compte/get",method = RequestMethod.GET)
    public List<Compte> add(){
        return compteService.getAll();
    }

    @RequestMapping(value = "/compte/get/{solde}",method = RequestMethod.GET)
    public List<Compte> getSupOf(@PathVariable double solde){
        return compteService.getCompteSupOf(solde);
    }
}
