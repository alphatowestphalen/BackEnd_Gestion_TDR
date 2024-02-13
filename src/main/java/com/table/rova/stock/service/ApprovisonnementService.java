package com.table.rova.stock.service;

import com.table.rova.stock.DAO.AprovisonnementDTO;
import com.table.rova.stock.Interface.CRUD;
import com.table.rova.stock.entity.Approvisonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovisonnementService implements CRUD<Approvisonnement> {

    @Autowired
    private AprovisonnementDTO aprovisonnementDTO;

    @Override
    public List<Approvisonnement> getListCrud() {
        return this.aprovisonnementDTO.findAll();
    }

    @Override
    public String creatCrud(Approvisonnement approvisonnement) {
        this.aprovisonnementDTO.save(approvisonnement);
        return "add success";
    }

    @Override
    public String deleteCrud(Long id) {
        this.aprovisonnementDTO.deleteById(id);
        return "delete success";
    }

    @Override
    public Approvisonnement findByIdCrud(Long id) {
        return aprovisonnementDTO.findById(id).orElse(null);
    }

    @Override
    public String updateCrud(Long id, Approvisonnement approvisonnement) {
        this.aprovisonnementDTO.save(approvisonnement);
        return "update success";
    }
}
