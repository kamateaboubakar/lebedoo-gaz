package com.lebedoo.repository;

import com.lebedoo.entity.GasSize;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface GasSizeRepository extends JpaRepository<GasSize, Integer> {
    @Query(value="select t2.id brand_in_shop_id, t1.*\n" +
            "from gas_sizes t1\n" +
            "inner join brands_in_shop t2 on t1.id=t2.gas_size_id\n" +
            "where t2.id=?", nativeQuery = true)
    List<Map<String, Object>> findByBrandInShop(int id) ;
}
