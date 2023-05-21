package com.lebedoo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lebedoo.entity.Shop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopRepository extends JpaRepository<Shop, Integer> {
    @Query(value = "SELECT t.* FROM shops t", nativeQuery = true)
    Page<Shop> findPage(Pageable pageable);
    @Query(value = "SELECT t.* FROM shops t order by latitude, longitude limit 16 offset 0", nativeQuery = true)
    List<Shop> findClosests(String latitude, String longitude);
}