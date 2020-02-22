package app;
/**
 * Exercício 02
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int X = 0;
        int in = 0;
        int out = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                in += 1;
            }
            else{
                out += 1;
            }
        }

        System.out.printf("%d in %n%d out %n", in, out);
        sc.close();
    }
}