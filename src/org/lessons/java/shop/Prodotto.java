package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // ATTRIBUTI
    private int code;
    private String productName;
    private String productDescription;
    private double price;
    private double vat;

    // COSTRUTTORI
    Prodotto(String productName, String productDescription, double price, double vat) {
        codeProduct();
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.vat = vat;
    }

    // GETTERS & SETTERS

    public int getCode() {
        return this.code;
    }

    private void setCode(int code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    public double getVat() {
        return vat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // METODI

   private void codeProduct() {
        Random randomCode = new Random();
        int code = randomCode.nextInt(1000,9999);
        setCode(code);
    }


    public double priceWithVat() {
        return price + vat;
    }

    public String infoAndCode(){
        return productName + " " + productDescription+"-"+ code + " " + priceWithVat() + "euro";
    }

}