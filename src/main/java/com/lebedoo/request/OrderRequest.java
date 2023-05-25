package com.lebedoo.request;

public class OrderRequest {
    private int brandInShopId ;
    private double latitude ;
    private double longitude ;
    private int targetId ;
    private String customerSessionId ;
    private int customerAddressId ;
    private int price ;

    public OrderRequest() {
    }

    public int getBrandInShopId() {
        return brandInShopId;
    }

    public void setBrandInShopId(int brandInShopId) {
        this.brandInShopId = brandInShopId;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
