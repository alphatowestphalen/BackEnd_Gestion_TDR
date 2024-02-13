package com.table.rova.stock.service;

import com.table.rova.stock.entity.Approvisonnement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ApprovisonnementServiceTest {
    @Autowired
    private ApprovisonnementService approvisonnementService;
    @Test
    void getListCrud() {
        List<Approvisonnement> approvisonnement = this.approvisonnementService.getListCrud();
        System.out.println("approvisonnement = " + approvisonnement);
    }
    @Test
    public  void creatCrud() {
        Approvisonnement approvisonnement = new Approvisonnement();
        approvisonnement.setIdProduct(2L);
        approvisonnement.setIdProvider(2L);
        approvisonnement.setQteEntree(10);
        approvisonnementService.creatCrud(approvisonnement);
    }
}