package entities;

/**
 * trangle
 */
public class Triangle {

    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double calcula(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        return p;
    }

    public double area(){
        double p = calcula();
        double result = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
        return result;
    }
    
}