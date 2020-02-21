package app;
/**
 * Exercício 02
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        sc.close();
    }
}