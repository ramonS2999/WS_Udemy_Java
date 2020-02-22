package app;
/**
 * Exercício 04
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double numerador = 0.0;
        double denominador = 0.0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            
            numerador = sc.nextDouble();
            denominador = sc.nextDouble();

            if (denominador == 0) {
                System.out.println("divisão impossivel");
            } 
            else {
                System.out.printf("%.1f %n", (numerador / denominador));
            }
        }
        sc.close();
    }
}