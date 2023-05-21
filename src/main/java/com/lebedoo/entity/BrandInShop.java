package com.lebedoo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "brands_in_shop")
public class BrandInShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "brand_id")
    private int brandId ;
    @Column(name = "gas_size_id")
    private int gasSizeId ;

    public BrandInShop() {
    }

    public BrandInShop(int shopId, int brandId, int gasSizeId) {
        this.shopId = shopId;
        this.brandId = brandId;
        this.gasSizeId = gasSizeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getGasSizeId() {
        return gasSizeId;
    }

    public void setGasSizeId(int gasSizeId) {
        this.gasSizeId = gasSizeId;
    }
}