package com.abcode.absales.controllers;

import com.abcode.absales.dto.SellerDTO;
import com.abcode.absales.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    private ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> dtos = sellerService.findAll();
        return ResponseEntity.ok().body(dtos);
    }
}
