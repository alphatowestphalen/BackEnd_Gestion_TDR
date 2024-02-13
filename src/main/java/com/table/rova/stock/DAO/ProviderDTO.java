package com.table.rova.stock.DAO;

import com.table.rova.stock.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderDTO extends JpaRepository<Provider, Long> {
}
