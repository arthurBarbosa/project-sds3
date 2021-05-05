package com.abcode.absales.controllers;

import com.abcode.absales.dto.SaleDTO;
import com.abcode.absales.dto.SaleSuccessDTO;
import com.abcode.absales.dto.SaleSumDTO;
import com.abcode.absales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> dtos = saleService.findAll(pageable);
        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
        List<SaleSumDTO> saleSumDTOS = saleService.amountGroupBySeller();
        return ResponseEntity.ok().body(saleSumDTOS);
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller() {
        List<SaleSuccessDTO> saleSumDTOS = saleService.successGroupBySeller();
        return ResponseEntity.ok().body(saleSumDTOS);
    }


}
