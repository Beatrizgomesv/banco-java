package aplicação;

import java.util.Locale;
import java.util.Scanner;

import projetoBanco.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do usuário: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("É o seu primeiro deposito? (S/N) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.println("Digite o valor do primeiro depósito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(conta);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Digite o valor do Depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);

		System.out.println("Deposito realizado com sucesso!");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(conta);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(conta);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Atenção! A taxa para saques é de R$5.00");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Digite o valor a ser sacado: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Saque efetuado com sucesso!");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(conta);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		sc.close();

	}

}
