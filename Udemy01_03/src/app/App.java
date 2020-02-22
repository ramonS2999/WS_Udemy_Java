package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        int mask = 0b1000000; // MASCARA PARA REALIZAR A COMPARÇÃO
        int n = sc.nextInt(); // PEGAR O VALOR PARA DESCOBRIR ATREVES DA AMASCARA

        if((n & mask) != 0){
            System.out.println("6th bit is true!");
        }
        else{
            System.out.println("6th bit is false!");
        }
        sc.close();
    }
}