package com.abcode.absales.services;

import com.abcode.absales.dto.SellerDTO;
import com.abcode.absales.entities.Seller;
import com.abcode.absales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = repository.findAll();
        return sellers.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
