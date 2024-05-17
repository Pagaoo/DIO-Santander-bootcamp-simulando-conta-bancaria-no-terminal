import entities.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira o número do conta: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, insira o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, insira o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Por favor, insira o saldo da conta: ");
        BigDecimal saldo = sc.nextBigDecimal();

        Conta newConta = new Conta(numero, agencia, titular, saldo);

        sc.close();

       String msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel",
               newConta.getTitular(), newConta.getAgencia(), newConta.getNumero(), newConta.getSaldo());

        System.out.println(msg);

    }
}
