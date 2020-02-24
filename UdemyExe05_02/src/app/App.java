package app;
/**
 * Exercício 02
 * Fazer um programa para ler os dados de um funcinário(nome, salário bruto e imposto).
 * Em seguida, mostra os dados do funcionários(nome e salário líquido). Em seguida, 
 * aumentar o salário do funcionário com base em uma porcentagem dada(somete o salário
 * bruto é afetado com a porcentagem) e mostrar novamente os dados do funcionário. Use
 * a classe projetada abaixo.
 */
import java.util.Scanner;
import entities.Employee;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("NAME: ");
        employee.name = sc.nextLine();

        System.out.print("GORSS SALARY:");
        employee.grossSalary = sc.nextDouble();

        System.out.print("TAX: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println("Update data: " + employee);

        sc.close();
    }
}