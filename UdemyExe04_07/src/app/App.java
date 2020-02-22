package app;
/**
 * Exercício 07
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
 * exemplo.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d %n", i, i * i, i * i * i);
        }
        sc.close();
    }
}