package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // ATTRIBUTI
    private String productName;
    private String productDescription;
    private double price;
    private double vat;

    // COSTRUTTORI
    Prodotto(String productName, String productDescription, double price, double vat) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.vat = vat;
    }



    // GETTERS & SETTERS

    public int getCode() {
        return randomCode.nextInt(1000,999);
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

    // METODI
    Random randomCode = new Random();
    public int codeProduct = randomCode.nextInt(1000000,99999999);


    double priceWithVat() {
        return price + vat;
    }

    public String infoAndCode(){
        return productName + " " + productDescription+"-"+codeProduct + " " + priceWithVat() + "euro";
    }

}