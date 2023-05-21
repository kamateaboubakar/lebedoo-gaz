package com.lebedoo.controller;

import com.lebedoo.entity.Order;
import com.lebedoo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderRepository repository;
    @PostMapping("/")
    public Order create(
            @RequestParam int brandInShopId,
            @RequestParam double latitude,
            @RequestParam double longitude,
            @RequestParam int targetId,
            @RequestParam String customerSessionId,
            @RequestParam int customerAddressId,
            @RequestParam int price
    ) {
        Order order = new Order(brandInShopId, customerSessionId, customerAddressId,
                latitude, longitude, targetId, price) ;
        Order result = repository.save(order);
        return result ;
    }
    @PostMapping("/{id}/pay")
    public Order pay(
            @PathVariable int id,
            @RequestParam String transactionId
    ) {
        Order order = repository.findById(id).get();
        order.setPaid(true);
        order.setPaidAt(new Date());
        order.setTransactionId(transactionId);
        Order result = repository.save(order);
        return result ;
    }
}
