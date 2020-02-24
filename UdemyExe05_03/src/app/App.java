package app;
/**
 * Exercício 03
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos
 * três trimestres do ano(o primeiro trimestre vale 30 e o segundo e terceiro valem 
 * 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dize também se o 
 * aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos 
 * faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você 
 * deve criar uma calsse Student par resolver esse problema.
 */
import java.util.Scanner;
import entities.Student;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.println(student);

        sc.close();
    }
}