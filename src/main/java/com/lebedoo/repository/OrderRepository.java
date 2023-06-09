package com.lebedoo.repository;

import com.lebedoo.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
