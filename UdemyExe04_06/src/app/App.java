package app;
/**
 * Exercício 06
 * Ler um número inteiro N e calcular todos os seus divisores.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            
            if (N % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}