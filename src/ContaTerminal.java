
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nomeCliente = sc.nextLine();
        System.out.println("\nDigite o numero da conta:");
        int numero = sc.nextInt();
        System.out.println("\nDigite a agencia:");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.println("\nDigite seu saldo:");
        double saldo = sc.nextDouble();
        
        System.out.printf("\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque\n",nomeCliente,agencia,numero,saldo);             
    }
}
