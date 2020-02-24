package entities;

/**
 * Student
 */
public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    private final int notaMedia = 60;

    public double somaNotas() {
        return nota1 + nota2 +nota3;
    }

    public String toString(){
        if (somaNotas() >= notaMedia){
            return "FINAL GRADE = "
                   + String.format("%.2f", somaNotas())
                   + "\n"
                   + "PASS";
        }
        else{
            return "FINAL GRADE = "
                   + String.format("%.2f", somaNotas())
                   + "\n"
                   + "FALIDE"
                   + "\n"
                   + "MISSING " 
                   + String.format("%.2f", notaMedia - somaNotas()) 
                   + " POINTS";
        }
    }
}