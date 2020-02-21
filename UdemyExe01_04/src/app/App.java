package app;
/**
 * Exercício 04
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais. 
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        double horas = sc.nextDouble();
        double valorHora = sc.nextDouble();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", horas * valorHora);

        sc.close();
    }
}