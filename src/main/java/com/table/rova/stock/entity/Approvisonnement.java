package com.table.rova.stock.entity;

import jakarta.persistence.*;

@Entity
public class Approvisonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApprovisonnement;

    @Column(name = "product_id")
    private Long idProduct;

    @Column(name = "provider_id")
    private Long idProvider;

    @Column(name = "qte_Entree")
    private int QteEntree;

    public Long getIdApprovisonnement() {
        return idApprovisonnement;
    }

    public void setIdApprovisonnement(Long idApprovisonnement) {
        this.idApprovisonnement = idApprovisonnement;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Long idProvider) {
        this.idProvider = idProvider;
    }

    public int getQteEntree() {
        return QteEntree;
    }

    public void setQteEntree(int qteEntree) {
        QteEntree = qteEntree;
    }
}
