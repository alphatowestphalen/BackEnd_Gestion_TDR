package com.table.rova.stock.controler;

import com.table.rova.stock.entity.Product;
import com.table.rova.stock.entity.Provider;
import com.table.rova.stock.service.ProductService;
import com.table.rova.stock.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProviderControler {
    @Autowired
    private ProviderService providerService;

    @RequestMapping(method = RequestMethod.GET, value = "/providers")
    public List<Provider> getAllProvider(){
        return this.providerService.getListCrud();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/provider/{id}")
    public void delete(@PathVariable Long id){
        this.providerService.deleteCrud(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/provider/{id}")
    public Provider getProviderById(@PathVariable Long id){
        return this.providerService.findByIdCrud(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/provider/{id}")
    public void update(@PathVariable Long id, @RequestBody Provider provider){
        providerService.updateCrud(id, provider);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/provider")
    public void create(@RequestBody Provider provider){
        providerService.creatCrud(provider);
    }
}
