package org.lessons.java.shop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 0;
        double vat = 0;
        boolean correctInfo = false;
        boolean validName = false;
        String productName = null;
        Scanner scanner= new Scanner(System.in);
       while (!validName) {
           try {
               System.out.println("Qual è il nome del prodotto?");
               productName = scanner.nextLine();
               if (productName.isEmpty()) {
                   throw new IllegalArgumentException(Double.toString(price));
               }
           } catch (IllegalArgumentException e) {
               System.out.println("Il nome non può essere vuoto!");
           }
           if (!productName.isEmpty()) {
               validName = true;
           }
       }
        System.out.println("Qual è la descrizione del prodotto?");
        String productDescription = scanner.next();
      while (!correctInfo) {
          try {
              System.out.println("Qual è il prezzo del prodotto?");
              price = scanner.nextDouble();
              if (price < 0) {
                  throw new IllegalArgumentException(Double.toString(price));
              }
              System.out.println("Qual è l'IVA del prodotto?");
              vat = scanner.nextDouble();
              if (vat < 0) {
                  throw new IllegalArgumentException(Double.toString(price));
              }
          } catch (IllegalArgumentException e) {
              System.out.println("Sia prezzo che IVA devono essere valori positivi, inserisci nuovamente il prezzo :)");
          }
            if (price > 0 && vat > 0)
            {correctInfo = true;
                                  }
      }
        Prodotto product = new Prodotto(
                productName, productDescription, price, vat);
        System.out.println("Il prezzo senza IVA sarà di " + product.getPrice());
        System.out.println("Il prezzo con IVA sarà di" + " " + product.priceWithVat());
        System.out.println(product.infoAndCode());
    }
}
