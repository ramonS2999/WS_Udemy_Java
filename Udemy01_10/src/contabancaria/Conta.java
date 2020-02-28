package contabancaria;

/**
 * Conta
 */
public class Conta {

    private String name;
    private double saldo;
    private int number;

    public Conta() {
    }

    public Conta(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Conta(String name, double deposito, int number) {
        this.name = name;
        this.number = number;
        deposito(deposito);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumber() {
        return number;
    }

    public void saque(double saque) {
        this.saldo = this.saldo - (saque + 5.00);
    }

    public void deposito(double deposito) {
        this.saldo = this.saldo + deposito;
    }

    public String toString(){
        return "Account: "
               + String.format("%d, ", number)
               + "Holder: "
               +  name
               + ", "
               + "Balance: "
               + String.format("$ %.2f %n", saldo);
    }
}
