package com.lebedoo.controller;

import com.lebedoo.dto.ShopBrandsDto;
import com.lebedoo.entity.Shop;
import com.lebedoo.repository.BrandRepository;
import com.lebedoo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shops")
public class ShopController {
    @Autowired
    ShopRepository repository;
    @Autowired
    BrandRepository brandRepository;
    @GetMapping("/closests")
    public List<Shop> closests(String latitude, String longitude) {
        return repository.findClosests(longitude, latitude);
    }
    @GetMapping("/{id}")
    public ShopBrandsDto get(@PathVariable("id") int id){
        Shop row = repository.findById(id).get() ;
        ShopBrandsDto result = new ShopBrandsDto(row);
        result.brands = brandRepository.findBrandsInShop(id);
        return result ;
    }
}
