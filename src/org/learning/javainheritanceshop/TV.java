package org.learning.javainheritanceshop;

import java.math.BigDecimal;

public class TV extends Product{
    private int inches;
    private boolean isSmart;

    public TV(String name, String brand, BigDecimal price, BigDecimal vat, int inches, boolean isSmart) {
        super(name, brand, price, vat);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String getDetails() {
        return "Product details: " + String.format("%s, %s, %s, %s, %s, %s, %s, %s", getCode(), getName(), getBrand(), getPrice(), getVat(), getVatPrice(), inches, isSmart);
    }
}
