package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // ponto como separador de decimal e não a virgula, chamo default dos US
		Scanner sc = new Scanner(System.in); // instanciando a variavel para leitura dos dados

		// criando variaveis temporarias para receber os dados
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titularConta = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limitSaque = sc.nextDouble();

		// instanciando a Conta com os quatro dados lidos acima.
		Conta acc = new Conta(numero, titularConta, saldo, limitSaque);

		// pedindo dados de saque da conta
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double conta = sc.nextDouble(); // leitura da quantia do saque na conta

		acc.quantiaSaque(conta); // chama a função da quantia de saque
		System.out.printf("Novo saldo: %.2f%n", acc.getSaldo());

		sc.close(); // fechando a instancia da variavel de leitura
	}

}

/*
 * Mudando Banch master para main "GitHub" git branch -m master main
 */
