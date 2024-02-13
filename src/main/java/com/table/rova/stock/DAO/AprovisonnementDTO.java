package com.table.rova.stock.DAO;

import com.table.rova.stock.entity.Approvisonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AprovisonnementDTO extends JpaRepository<Approvisonnement, Long> {
}
