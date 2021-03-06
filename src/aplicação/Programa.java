package aplica??o;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import exceptions.BusinessException;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // ponto como separador de decimal e n?o a virgula, chamo default dos US
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

		try { // tentar executar o bloco
			acc.quantiaSaque(conta); // chama a fun??o da quantia de saque, porem pode lan?ar uma exce??o
			System.out.printf("Novo saldo: %.2f%n", acc.getSaldo());
		} catch (BusinessException e) { // pode capturar uma exce??o BusinessException e
			System.out.println(e.getMessage()); // e.getMessage pega a mensagem armazenada na exce??o e envia ao
												// usuario.
		}

		sc.close(); // fechando a instancia da variavel de leitura
	}

}

/*
 * Mudando Banch master para main "GitHub" git branch -m master main
 */