package com.lebedoo.controller;

import com.lebedoo.entity.Order;
import com.lebedoo.repository.OrderRepository;
import com.lebedoo.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Date;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderRepository repository;
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public Order create(
            @RequestBody OrderRequest orderRequest
            ) throws URISyntaxException {
        Order order = new Order(orderRequest.getBrandInShopId(), orderRequest.getCustomerSessionId(), orderRequest.getCustomerAddressId(),
                orderRequest.getLatitude(), orderRequest.getLongitude(), orderRequest.getTargetId(), orderRequest.getPrice()) ;
        Order result = repository.save(order);
        return result ;
    }
    @PostMapping("/create")
    public Order create2(
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
