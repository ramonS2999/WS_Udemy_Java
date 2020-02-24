package app;
import util01.Calculator;
import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Calculator.radios = sc.nextDouble();
        System.out.printf("Circunference: %.2f %n", Calculator.circunference());
        System.out.printf("Volume: %.2f %n", Calculator.volume());
        System.out.printf("PI value: %.2f %n", Calculator.PI);

        sc.close();
    }
}