package com.lebedoo.repository;

import com.lebedoo.entity.CustomerAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer> {
    @Query(value="select * from customer_addresses where customer_session_id=?", nativeQuery = true)
    List<CustomerAddress> findByCustomerSession(String customerSessionId);
}
