package com.lebedoo.entity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "brand_in_shop_id")
    private long brandInShopId;
    @Column(name = "customer_session_id")
    private String customerSessionId ;
    @Column(name = "customer_address_id")
    private int customerAddressId ;
    @Column(name = "latitude")
    private double latitude ;
    @Column(name = "longitude")
    private double longitude ;
    @Column(name = "target_id")
    private int targetId ;
    @Column(name = "price")
    private double price ;
    @Column(name = "created_at")
    private Date createdAt ;
    @Column(name = "updated_at")
    private Date updatedAt ;
    @Column(name = "paid")
    private boolean paid ;
    @Column(name = "paid_at")
    private Date paidAt ;
    @Column(name = "delivered")
    private boolean delivered ;
    @Column(name = "delivered_at")
    private Date deliveredAt ;
    @Column(name = "transaction_id")
    private String transactionId ;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBrandInShopId() {
        return brandInShopId;
    }

    public void setBrandInShopId(long brandInShopId) {
        this.brandInShopId = brandInShopId;
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public int getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(int customerAddressId) {
        this.customerAddressId = customerAddressId;
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

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public Date getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(Date deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public Order(long brandInShopId, String customerSessionId, int customerAddressId, double latitude, double longitude, int targetId, double price) {
        this.brandInShopId = brandInShopId;
        this.customerSessionId = customerSessionId;
        this.customerAddressId = customerAddressId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.targetId = targetId;
        this.price = price;
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.paid=false;
        this.delivered=false;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}