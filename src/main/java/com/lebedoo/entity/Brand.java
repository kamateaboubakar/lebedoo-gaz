package com.lebedoo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "picture_name")
    private String pictureName;
    @Column(name = "description")
    private String description;

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand(String name, String pictureName) {
        this.name = name;
        this.pictureName = pictureName;
    }

    public Brand(int id, String name, String pictureName, String description) {
        this.id = id;
        this.name = name;
        this.pictureName = pictureName;
        this.description = description;
    }
}