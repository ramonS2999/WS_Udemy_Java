package app;
/**
 * Exercício 02
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 * casas decimais conforme exemplos.
 * 
 * Fórmula da área: area = π . raio^2
 * Considere o valor de π = 3.14159
 */
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        double raio = sc.nextDouble();
        double A = PI * Math.pow(raio, 2);

        System.out.printf("A %.4f%n", A);

        sc.close();
    }
}