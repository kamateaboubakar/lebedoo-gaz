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
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
                                   
    public CustomerAddress() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public CustomerAddress(String customerSessionId, int targetId, double latitude, double longitude) {
        this.customerSessionId = customerSessionId;
        this.targetId = targetId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}