package app;
/**
 * Em um banco, para se cadastrar uma conta bancária, é necessária informar o número da conta, o nome do 
 * titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
 * inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
 * conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
 * 
 * Importe: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
 * o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
 * exemplo).
 * 
 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
 * isso. O saldo só aumentar por meio de depósitos, e só diminui por meio de saque. Para cada saque 
 * realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com negativo se o saldo não for 
 * suficiente para realizar o saque e/ou pagar a taxa.
 * 
 * VocÊ deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
 * informado o valor de depósito inicial. Em seguida, realizado um depósito e depois um saque, sempre 
 * mostrando os dados da conta após cada operação.
 */
import java.util.Scanner;
import contabancaria.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.print("Enter accounte number: ");
        int numeber = sc.nextInt();

        System.out.print("Enter accounte holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        
        System.out.print("Is there an initial deposit (y/n)? ");
        char opcao = sc.next().charAt(0);

        if(opcao == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDoposit = sc.nextDouble();
            conta = new Conta(holder, initialDoposit, numeber);
        }
        else { 
            conta = new Conta(holder, numeber);
        }

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        conta.deposito(sc.nextDouble());
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.print("Enter a withdraw value: ");
        conta.saque(sc.nextDouble());
        System.out.println("Account data:");
        System.out.println(conta);

        sc.close();
    }
}