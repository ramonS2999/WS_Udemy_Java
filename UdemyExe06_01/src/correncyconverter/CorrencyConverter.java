package correncyconverter;

/**
 * CorrencyCoverter
 */
public class CorrencyConverter {

    public static final double IOF = 0.06;
    public static double valorDollar;
    public static double valorCompra;

    public static double converter(){
        return (valorCompra * IOF + valorCompra) * valorDollar;
    }
}