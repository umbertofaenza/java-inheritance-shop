package org.learning.javainheritanceshop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal vat;

    public Product(String name, String brand, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
        code = generateCode();
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price.setScale(2, RoundingMode.HALF_DOWN);
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.HALF_DOWN);
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getVatPrice() {
        return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_DOWN);
    }

    public String getDetails() {
        return "Product details: " + String.format("%s, %s, %s, %s, %s, %s", code, name, brand, price, vat, getVatPrice());
    }

    private int generateCode() {
        Random randomGen = new Random();
        return randomGen.nextInt(100000000);
    }
}
