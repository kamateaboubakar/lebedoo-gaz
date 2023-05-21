package com.lebedoo.repository;

import com.lebedoo.entity.BrandInShop;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface BrandInShopRepository extends JpaRepository<BrandInShop, Integer> {
    @Query(value="select t2.*, t1.address shop_address, t1.description shop_description,\n" +
            "t1.latitude shop_latitude, t1.longitude shop_longitude, t1.name shop_name,\n" +
            "t3.description brand_description, t3.name brand_name, t3.picture_name brand_picture_name\n" +
            "from shops t1\n" +
            "inner join brands_in_shop t2 on t1.id=t2.shop_id\n" +
            "inner join brands t3 on t3.id=t2.brand_id\n" +
            "where t2.id=?", nativeQuery = true)
    List<Map<String, Object>> getAllById(int id);
    @Query(value="select t1.*\n" +
            "from gas_sizes t1\n" +
            "inner join brands_in_shop t2 on t1.id=t2.gas_size_id\n" +
            "where t2.shop_id=? and t2.brand_id=?", nativeQuery = true)
    List<Map<String, Object>> findGasSizes(int shopId, int brandId);
}
