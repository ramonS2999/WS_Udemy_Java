package app;
/**
 * Exercício 01
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double senha = 0.00;

        while (senha != 2002) {
            senha = sc.nextDouble();
            if(senha != 2002){
                System.out.println("Senha Invalida");
            }    
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}