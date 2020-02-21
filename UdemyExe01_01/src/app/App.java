package app;

/*
 * Exercício 01
 * 
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa, conforme exemplos.
 * 
 */
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Soma = " + (x + y));

        sc.close();
    }
}