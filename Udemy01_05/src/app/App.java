package app;

public class App {
    public static void main(String[] args) throws Exception {

        String s = "potato appel lemon orange";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}