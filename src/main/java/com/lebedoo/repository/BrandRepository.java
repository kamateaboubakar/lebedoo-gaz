package com.lebedoo.repository;

import com.lebedoo.entity.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    // @Query(value = "SELECT distinct t2.*, t1.id brand_in_shop_id FROM brands_in_shop t1 inner join brands t2 on t1.brand_id=t2.id where shop_id=?", nativeQuery = true)
    // List<Brand> findBrandsInShop(int id);
    @Query(value = "SELECT distinct t2.* FROM brands_in_shop t1 inner join brands t2 on t1.brand_id=t2.id where shop_id=?", nativeQuery = true)
    List<Map<String, Object>> findBrandsInShop(int id);
}
