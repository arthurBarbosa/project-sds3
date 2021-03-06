package com.abcode.absales.services;

import com.abcode.absales.dto.SaleDTO;
import com.abcode.absales.dto.SaleSuccessDTO;
import com.abcode.absales.dto.SaleSumDTO;
import com.abcode.absales.entities.Sale;
import com.abcode.absales.repositories.SaleRepository;
import com.abcode.absales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> sales = repository.findAll(pageable);
        return sales.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupBySeller() {
        return repository.amountGroupBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupBySeller() {
        return repository.successGroupBySeller();
    }


}
