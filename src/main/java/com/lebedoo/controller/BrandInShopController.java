package com.lebedoo.controller;

import com.lebedoo.repository.BrandInShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brandsInShop")
public class BrandInShopController {

    @Autowired
    DataSource dataSource;
    @Autowired
    BrandInShopRepository repository;
    @GetMapping("/{id}")
    public Map<String, Object> get(@PathVariable("id") int id)
    {
        return repository.getAllById(id).get(0);
    }
    @GetMapping("/gasSizes")
    public List<Map<String, Object>> getGasSizes(@RequestParam("shop_id") int shopId, @RequestParam("brand_id") int brandId)
    {
        return repository.findGasSizes(shopId, brandId);
    }
}
