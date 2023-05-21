package com.lebedoo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "customer_addresses")
public class CustomerAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "customer_session_id")
    private String customerSessionId;
    @Column(name = "target_id")
    private int targetId ;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "longitude")
    private String longitude;
                                   
    public CustomerAddress() {
    }

    public CustomerAddress(String customerSessionId, int targetId, String latitude, String longitude) {
        this.customerSessionId = customerSessionId;
        this.targetId = targetId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}