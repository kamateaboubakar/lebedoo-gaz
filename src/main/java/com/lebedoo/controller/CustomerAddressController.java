package com.lebedoo.controller;

import com.lebedoo.entity.CustomerAddress;
import com.lebedoo.repository.CustomerAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/customerAddresses")
public class CustomerAddressController {
    @Autowired
    CustomerAddressRepository repository;
    @GetMapping("/")
    public List<CustomerAddress> index(@RequestParam("customer_session_id") String customerSessionId){
        return repository.findByCustomerSession(customerSessionId);
    }
    @PostMapping("/")
    public CustomerAddress create(@RequestBody CustomerAddress customerAddress){
        CustomerAddress result = repository.save(customerAddress);
        return result ;
    }

    @GetMapping("/{id}")
    public CustomerAddress get(@PathVariable("id") int id){
        CustomerAddress result = repository.findById(id).get();
        return result ;
    }

    @PostMapping("/{id}")
    public CustomerAddress update(@PathVariable("id") int id, @RequestBody CustomerAddress requestRow){
        CustomerAddress customerAddress = repository.findById(id).get();
        customerAddress.setCustomerSessionId(requestRow.getCustomerSessionId());
        customerAddress.setLatitude(requestRow.getLatitude());
        customerAddress.setLongitude(requestRow.getLongitude());
        customerAddress.setTargetId(requestRow.getTargetId());
        CustomerAddress result = repository.save(customerAddress);
        return result ;
    }

    @DeleteMapping("/{id}")
    public CustomerAddress delete(@PathVariable("id") int id) {
        CustomerAddress customerAddress = repository.findById(id).get();
        repository.delete(customerAddress);
        return customerAddress;
    }

}
