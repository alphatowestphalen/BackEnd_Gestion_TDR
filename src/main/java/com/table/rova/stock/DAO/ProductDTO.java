package com.table.rova.stock.DAO;

import com.table.rova.stock.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDTO extends JpaRepository<Product, Long> {
}
