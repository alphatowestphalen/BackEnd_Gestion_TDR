package com.table.rova.stock.service;

import com.table.rova.stock.DAO.ProductDTO;
import com.table.rova.stock.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDTO productDTO;

    public List<Product> getProductList() {
        return productDTO.findAll();
    }
    public void deleteProduct(Long id) {
        this.productDTO.deleteById(id);
    }

    public void updateProduct(Product product, Long id) {
            this.productDTO.save(product);
    }

    public String createProduct(Product product) {
        productDTO.save(product);
        return "votre ajout est avec succée";
    }

    public Product findByIdProduct(Long id) {
        return productDTO.findById(id).orElse(null);
    }

}
