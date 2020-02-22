package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int high = max(a, b, c);
        showResult(high);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;

        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("HIGH - " + value);
    }
}