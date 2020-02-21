package app;
/**
 * Exercício 07
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
 * situação.
 *
 *       Y
 *   Q2  |  Q1
 * ______|______X
 *       |
 *   Q3  |  Q4
 * 
 * */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > 0) {
            if(y > 0) {
                System.out.println("Q1");
            }
            else if(y < 0) {
                System.out.println("Q4");
            }
            else {
                System.out.println("Eixo X");
            }
        }
        else if(x < 0) {
            if(y > 0) {
                System.out.println("Q2");
            }
            else if(y < 0) {
                System.out.println("Q3");
            }
            else {
                System.out.println("Eixo X");
            }
        }
        else {
            if(y != 0) {
                System.out.println("Eixo Y");
            }
            else {
                System.out.println("Origem");
            }
        }
        sc.close();
    }
}