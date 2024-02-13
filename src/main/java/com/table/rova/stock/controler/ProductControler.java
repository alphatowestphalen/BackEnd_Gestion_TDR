package com.table.rova.stock.controler;

import com.table.rova.stock.entity.Product;
import com.table.rova.stock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControler {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public List<Product> getProduct(){
        return productService.getProductList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.findByIdProduct(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/product/{id}")
    public void delete(@PathVariable Long id){
        this.productService.deleteProduct(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/product")
    public void create(@RequestBody Product product){
        this.productService.createProduct(product);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/product/{id}")
    public void update(@RequestBody Product product, @PathVariable Long id){
        this.productService.updateProduct(product, id);
    }


}
