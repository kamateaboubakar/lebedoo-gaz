package com.lebedoo.dto;

import com.lebedoo.entity.Brand;
import com.lebedoo.entity.Shop;
import jakarta.persistence.Column;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopBrandsDto {
    private long id;
    private String name;
    private String address;
    private String description;
    private String latitude ;
    private String longitude ;
    public List<Map<String, Object>> brands;

    public ShopBrandsDto() {
    }
    public ShopBrandsDto(Shop shop) {
        this.id = shop.getId();
        this.name = shop.getName();
        this.address = shop.getAddress();
        this.description = shop.getDescription();
        this.latitude = shop.getLatitude();
        this.longitude = shop.getLongitude();
    }

    public ShopBrandsDto(long id, String name, String address, String description, String latitude, String longitude) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
