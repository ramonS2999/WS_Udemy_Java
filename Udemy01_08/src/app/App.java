package app;

import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("Enter the number of product to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("\nUpdate data: " + product);

        System.out.print("Enter the number of product to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("\nUpdate data: " + product);

        sc.close();
    }
}