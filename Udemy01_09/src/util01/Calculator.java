package util01;

/**
 * Calculary
 */
public class Calculator {

    public static double radios;
    public static final double PI = 3.141516;

    public static double circunference() {
        return 2.0 * PI * radios;
    }

    public static double volume() {
        return 4.0 * PI * radios * radios * radios / 3.0;
    }
}