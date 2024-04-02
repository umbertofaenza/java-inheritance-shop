package org.learning.javainheritanceshop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    private String IMEI;
    private int storage;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, String IMEI, int storage) {
        super(name, brand, price, vat);
        this.IMEI = IMEI;
        this.storage = storage;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String getDetails() {
        return String.format("%s, %s, %s, %s, %s, %s, %s, %s", getCode(), getName(), getBrand(), getPrice(), getVat(), getVatPrice(), IMEI, storage);
    }
}
