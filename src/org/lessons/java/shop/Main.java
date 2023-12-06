package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Qual è il nome del prodotto?");
        String productName = scanner.next();
        System.out.println("Qual è la descrizione del prodotto?");
        String productDescription = scanner.next();
        System.out.println("Qual è il prezzo del prodotto?");
        double price = scanner.nextDouble();
        System.out.println("Quant'è l'IVA del prodotto?");
        double vat = scanner.nextDouble();
        Prodotto product = new Prodotto(productName, productDescription, price, vat);
        System.out.println(product.infoAndCode());
    }
}
