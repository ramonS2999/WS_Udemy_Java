package app;
/**
 * Exercício 03
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
 * exemplo.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
        int cliente = sc.nextInt();

        while(cliente != 4){

            switch (cliente) {
                case 1:
                    alcool += 1;
                break;

                case 2:
                    gasolina += 1;
                break;

                case 3:
                    diesel += 1;
                break;

                default:
                    System.out.println("Informa um numero valido");
                    break;
            }

            cliente = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d %nGasolina: %d %nDiesel: %d %n", alcool, gasolina, diesel);
        sc.close();
    }
}