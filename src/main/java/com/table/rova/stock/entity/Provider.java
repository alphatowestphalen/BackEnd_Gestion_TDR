package com.table.rova.stock.entity;

import jakarta.persistence.*;

@Entity
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nom")
    private String nomProvider;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProvider() {
        return nomProvider;
    }

    public void setNomProvider(String nomProvider) {
        this.nomProvider = nomProvider;
    }
}
