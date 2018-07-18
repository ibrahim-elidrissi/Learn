package com.projet_back.projet.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Compte {

    @Id
    @Column(name = "id_compte")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE")
    @SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQUENCE")
    private Integer id_compte;

    @Column(name = "rib")
    private String rib;

    @Column(name = "solde")
    private double solde;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Compte(){}

    public Compte(String rib, double solde) {
        this.rib = rib;
        this.solde = solde;
    }

    public Integer getId_compte() {
        return id_compte;
    }

    public void setId_compte(Integer id_compte) {
        this.id_compte = id_compte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
