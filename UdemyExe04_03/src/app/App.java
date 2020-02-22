package app;
/**
 * Exercício 03
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            p1 = sc.nextDouble();
            p2 = sc.nextDouble();
            p3 = sc.nextDouble();

            double mediaPonderada = (p1 * 2 + p2 * 3 + p3 * 5) / (2 + 3 +5);
            System.out.printf("%.1f %n", mediaPonderada);
        }
        sc.close();
    }
}