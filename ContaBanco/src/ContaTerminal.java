import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.print("Digite sua agencia: ");
        agencia = sc.next();

        System.out.print("Digite o numero da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

        sc.close();
    }

}