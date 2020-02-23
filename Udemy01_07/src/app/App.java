package app;

import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of triangle X: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();
        
        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Triangle Y area: %.4f%n", y.area());

        if(x.area() > y.area()){
            System.out.println("Large area: X");
        }
        else if(x.area() < y.area()){
            System.out.println("Larege area: Y");
        }
        else{
            System.out.println("X = Y");
        }
        sc.close();
    }
}