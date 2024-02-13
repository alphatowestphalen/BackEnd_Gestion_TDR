package com.table.rova.stock.controler;

import com.table.rova.stock.entity.Approvisonnement;
import com.table.rova.stock.entity.Provider;
import com.table.rova.stock.service.ApprovisonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ApprovisonnementControler {
    @Autowired
    private ApprovisonnementService approvisonnementService;

    @RequestMapping(method = RequestMethod.GET, value = "/approvisonnements")
    public List<Approvisonnement> getAllApprovisonnement(){
        return approvisonnementService.getListCrud();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/approvisonnement/{id}")
    public void deleteApprovisonnement(@PathVariable Long id){
        this.approvisonnementService.deleteCrud(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/approvisonnement/{id}")
    public Approvisonnement getProviderById(@PathVariable Long id){
        return this.approvisonnementService.findByIdCrud(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/approvisonnement/{id}")
    public void update(@PathVariable Long id, @RequestBody Approvisonnement approvisonnement){
        approvisonnementService.updateCrud(id, approvisonnement);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/approvisonnement")
    public void create(@RequestBody Approvisonnement approvisonnement){
        approvisonnementService.creatCrud(approvisonnement);
    }
}
