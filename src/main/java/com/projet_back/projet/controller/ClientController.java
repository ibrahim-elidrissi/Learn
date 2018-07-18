package com.projet_back.projet.controller;

import com.projet_back.projet.entity.Client;
import com.projet_back.projet.entity.Compte;
import com.projet_back.projet.service.ClientService;
import com.projet_back.projet.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CompteService compteService;

    @GetMapping("/client/test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/Client/get", method = RequestMethod.GET)
    public List<Client> get() {
        return clientService.getAll();
    }

    @RequestMapping(value = "/Client/set/{id}/{name}/{compteId}")
    public int add(@PathVariable int id,@PathVariable String name,@PathVariable int compteId){
        Compte compte = compteService.findOne(compteId);
        Client client = new Client(name);
        clientService.save(client);
        return 1;
    }

    @RequestMapping(value = "/Client/{id}")
    public Client getById(@PathVariable int id){
        return clientService.find(id);
    }
}
