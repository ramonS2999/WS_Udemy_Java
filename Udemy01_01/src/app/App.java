package app;

import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        double x = 35.26741;

        System.out.println("");
        System.out.printf("BRASIL:         %.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("ESTADOS UNIDOS: %.2f%n", x);
    }
}