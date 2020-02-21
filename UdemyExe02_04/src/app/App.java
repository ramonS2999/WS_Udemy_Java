package app;
/**
 * Exercício 04
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double duracao = 0.0;

        double horaInicil = sc.nextDouble();
        double horaFinal = sc.nextDouble();

        if(horaFinal <= horaInicil) {
            duracao = (horaFinal + 24) - horaInicil;
        }
        else {
            duracao = horaFinal - horaInicil;
        }

        System.out.printf("O JOGO DUROU %.0f HORA(S)%n", duracao);

        sc.close();
    }
}