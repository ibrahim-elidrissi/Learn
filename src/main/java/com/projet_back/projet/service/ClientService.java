package com.projet_back.projet.service;

import com.projet_back.projet.entity.Client;
import com.projet_back.projet.entity.Compte;
import com.projet_back.projet.repository.ClientRepository;
import com.projet_back.projet.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return (List<Client>) clientRepository.findAll();
    }

    public void save(Client client){
        clientRepository.save(client);
    }

    public Client find(int id){
        return clientRepository.findById(id).get();
    }
}
