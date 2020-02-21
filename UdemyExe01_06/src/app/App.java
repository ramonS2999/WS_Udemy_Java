package app;
/**
 * Exercício 06
 * 
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 * mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 */
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (A * C / 2));
        System.out.printf("CIRCULO: %.3f%n", (PI * Math.pow(C, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", ((A + B) * C ) / 2);
        System.out.printf("QUADRADO: %.3f%n", B * B);
        System.out.printf("RETANGULO: %.3f%n", A * B);
        sc.close();
    }
}