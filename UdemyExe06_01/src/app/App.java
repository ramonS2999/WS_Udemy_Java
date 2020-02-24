package app;
/**
 * Faça um programa para ler a contação do dólar, depois um valor em dólares a ser 
 * sompradopor uma pssoa em reais. Informar quantos reais a pessoa vai pagar pelos 
 * dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor 
 * em dólar. Criar uma classe CorrencyConverter para ser resposável pelos cálculos.
 */
import java.util.Scanner;

import correncyconverter.CorrencyConverter;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CorrencyConverter.valorDollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CorrencyConverter.valorCompra = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f %n", CorrencyConverter.converter());

        sc.close();
    }
}