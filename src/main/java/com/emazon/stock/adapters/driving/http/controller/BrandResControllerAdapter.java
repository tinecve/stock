package com.emazon.stock.adapters.driving.http.controller;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.BrandEntity;
import com.emazon.stock.adapters.driving.http.dto.request.AddBrandRequest;
import com.emazon.stock.adapters.driving.http.dto.response.BrandResponse;
import com.emazon.stock.adapters.driving.http.mapper.IBrandRequestMapper;
import com.emazon.stock.adapters.driving.http.mapper.IBrandResponseMapper;
import com.emazon.stock.domain.api.IBrandServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandResControllerAdapter {

    private final IBrandServicePort brandServicePort;
    private final IBrandRequestMapper brandRequestMapper;
    private final IBrandResponseMapper brandResponseMapper;


    @PostMapping("/")
    public ResponseEntity<Void> addBrand(@Valid @RequestBody AddBrandRequest request){
        brandServicePort.saveBrand(brandRequestMapper.addRequestToBrand(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<BrandResponse>> getAllBrands(@RequestParam Integer page, @RequestParam Integer size, @RequestParam(required = false) String order){
        return ResponseEntity.ok(brandResponseMapper.toBrandResponseList(brandServicePort.getAllBrands(page, size, order)));
    }



}
