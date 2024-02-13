package com.table.rova.stock.service;

import com.table.rova.stock.DAO.ProviderDTO;
import com.table.rova.stock.Interface.CRUD;
import com.table.rova.stock.entity.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService implements CRUD<Provider> {
    @Autowired
    private ProviderDTO providerDTO;

    @Override
    public List<Provider> getListCrud() {
        return this.providerDTO.findAll();
    }
    @Override
    public String creatCrud(Provider provider) {
        this.providerDTO.save(provider);
        return "vous ajouter est avec succes";
    }

    @Override
    public String deleteCrud(Long id) {
        this.providerDTO.deleteById(id);
        return "vous avez supprimer element";
    }

    @Override
    public Provider findByIdCrud(Long id) {
        return this.providerDTO.findById(id).orElse(null);
    }

    @Override
    public String updateCrud(Long id, Provider provider) {
        this.providerDTO.save(provider);
        return "modification avec success";
    }
}
