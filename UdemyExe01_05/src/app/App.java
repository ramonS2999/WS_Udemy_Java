package app;
/**
 * Exercício 05
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeroPeca1 = sc.nextInt();
        int quantidadePeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int numeroPeca2 = sc.nextInt();
        int quantidadePeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double total = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}