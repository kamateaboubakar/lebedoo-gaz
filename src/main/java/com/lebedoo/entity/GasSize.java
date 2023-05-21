package com.lebedoo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "gas_sizes")
public class GasSize {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "picture_name")
    private String pictureName;
    @Column(name = "price")
    private long price;

    public GasSize() {
    }

    public GasSize(String name, String pictureName, long price) {
        this.name = name;
        this.pictureName = pictureName;
        this.price = price;
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

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}