package app;
/**
 * Exercício 03
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
 * ordem crescente ou decrescente.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int resultado;
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B){
            resultado = A % B;
        }
        else{
            resultado = B % A;
        }

        switch (resultado) {
            case 0:
                System.out.println("Sao Multiplos");
                break;
        
            default:
                System.out.println("Nao Sao Multiplos");
                break;
        }
        sc.close();
    }
}