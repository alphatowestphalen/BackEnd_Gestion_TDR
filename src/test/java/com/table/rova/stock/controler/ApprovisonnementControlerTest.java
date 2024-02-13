package com.table.rova.stock.controler;

import com.table.rova.stock.DAO.AprovisonnementDTO;
import com.table.rova.stock.entity.Approvisonnement;
import com.table.rova.stock.service.ApprovisonnementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApprovisonnementControlerTest {

    @Autowired
    private AprovisonnementDTO aprovisonnementDTO;

    @Test
    void getAllApprovisonnement() {

        List<Approvisonnement> approvisonnements = this.aprovisonnementDTO.findAll();
        System.out.println("approvisonnementsssssss = " + approvisonnements);
    }

    @Test
    void deleteApprovisonnement() {
    }

    @Test
    void getProviderById() {
    }

    @Test
    void update() {
    }

    @Test
    void create() {


    }
}