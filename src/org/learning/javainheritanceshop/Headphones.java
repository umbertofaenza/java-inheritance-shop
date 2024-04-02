package org.learning.javainheritanceshop;

import java.math.BigDecimal;

public class Headphones extends Product{
    private String color;
    private boolean isWireless;

    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String getDetails() {
        return "Product details: " + String.format("%s, %s, %s, %s, %s, %s, %s, %s", getCode(), getName(), getBrand(), getPrice(), getVat(), getVatPrice(), color, isWireless);
    }
}
