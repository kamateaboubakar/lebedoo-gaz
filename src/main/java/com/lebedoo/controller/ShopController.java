package com.lebedoo.controller;

import com.lebedoo.dto.ShopBrandsDto;
import com.lebedoo.entity.Shop;
import com.lebedoo.repository.BrandRepository;
import com.lebedoo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/shops")
public class ShopController {
    @Autowired
    ShopRepository repository;
    @Autowired
    BrandRepository brandRepository;
    @GetMapping("/closests")
    public List<Map<String, Object>> closests(@RequestParam(name="latitude") double latitude, @RequestParam(name="longitude") double longitude) {
        Date dt = new Date();
        String dayOfWeek = new SimpleDateFormat("u").format(dt);
        String hour = new SimpleDateFormat("HH:mm").format(dt);
        // System.out.println(dayOfWeek);
        // System.out.println(hour);
        return repository.findClosests(longitude, latitude, dayOfWeek, hour);
    }
    @GetMapping("/{id}")
    public ShopBrandsDto get(@PathVariable("id") int id){
        Shop row = repository.findById(id).get() ;
        ShopBrandsDto result = new ShopBrandsDto(row);
        result.brands = brandRepository.findBrandsInShop(id);
        return result ;
    }
}
