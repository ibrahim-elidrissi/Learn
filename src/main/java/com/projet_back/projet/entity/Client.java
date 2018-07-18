package com.projet_back.projet.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE")
    @SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQUENCE")
    private Integer id_client;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    private List<Compte> comptes;

    public Client(){}

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, List<Compte> comptes) {
        this.name = name;
        this.comptes = comptes;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
