package app;
/**
 * Execício 01
 * 
 * Fazer um progarama para ler os valores da largura altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar
 * uma classe como mostrado no projeto ao lado.
 */
import java.util.Scanner;
import entities.Rectangle;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Enter rectangle Width and Height: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        System.out.println(retangulo);

        sc.close();
    }
}