package app;
/**
 * Exercício 05
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
 * seguir, calcule e mostre o valor da conta a pagar.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1   Cachorro quente   R$ 4,00");
        System.out.println("2   X-Salada          R$ 4,50");
        System.out.println("3   X-Bacon           R$ 5,00");
        System.out.println("4   Torrada Simples   R$ 2,00");
        System.out.println("5   Refrigerante      R$ 1,50");

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.printf("Total: R$ %.2f%n", quantidade * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n", quantidade * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f%n", quantidade * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n", quantidade * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n", quantidade * 1.50);
                break;
        }
        sc.close();
    }
}