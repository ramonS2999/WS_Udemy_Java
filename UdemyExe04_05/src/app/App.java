package app;
/**
 * Exercício 05
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Lembrando que, por definição, fatorial de 0 é 1.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int fatorial = 1;
        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}