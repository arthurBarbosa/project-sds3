package com.abcode.absales.repositories;

import com.abcode.absales.entities.Sale;
import com.abcode.absales.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
