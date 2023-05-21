package com.lebedoo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lebedoo.entity.Shop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ShopRepository extends JpaRepository<Shop, Integer> {
    @Query(value = "SELECT t.* FROM shops t", nativeQuery = true)
    Page<Shop> findPage(Pageable pageable);
    @Query(value = "SELECT \n" +
            "\tt.*,\n" +
            "\tcase\n" +
            "\twhen ?3 < '6' and (available_work_days is not null and (available_work_days = '*' or POSITION(?3 in available_work_days) > 0)) and (available_work_begin_time is not null and ?4 >= available_work_begin_time) and (available_work_end_time is not null and ?4 <= available_work_end_time) then 1\n" +
            "\twhen ?3 >= '6' and (available_week_days is not null and (available_week_days = '*' or POSITION(?3 in available_week_days) > 0)) and (available_week_begin_time is not null and ?4 >= available_week_begin_time) and (available_week_end_time is not null and ?4 <= available_week_end_time) then 1\n" +
            "\telse 0 end open\n" +
            "\tFROM shops t order by sqrt((?1 - latitude)^2 + (?2 - longitude)^2) desc limit 16 offset 0", nativeQuery = true)
    List<Map<String, Object>> findClosests(double latitude, double longitude, String day, String hour);
}