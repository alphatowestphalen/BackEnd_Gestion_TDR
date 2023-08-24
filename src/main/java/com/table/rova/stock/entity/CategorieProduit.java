package com.table.rova.stock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CategorieProduit {
    @Id

    private  Long id;
    @Column(name = "CategorieProductCodes")
    private String CategorieProductCode;
    private String Categorie;
}
