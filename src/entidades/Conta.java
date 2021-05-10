package entidades; //entidade do negocio.

import exceptions.BusinessException;

public class Conta {

	private Integer numero;
	private String titularConta;
	private Double saldo;
	private Double limitSaque;

	// para criar um contrutor sem nenhum argumento "construtor vazio"
	public Conta() {
	}

	// Contrutor com os argumentos
	public Conta(Integer numero, String titularConta, Double saldo, Double limitSaque) {
		this.numero = numero;
		this.titularConta = titularConta;
		this.saldo = saldo;
		this.limitSaque = limitSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimitSaque() {
		return limitSaque;
	}

	public void setLimitSaque(Double limitSaque) {
		this.limitSaque = limitSaque;
	}

	// metodo Dep�sito
	public void deposito(double conta) {
		saldo += conta;
	}

	// metodo Saque recebendo argumento quantiaSaque
	public void quantiaSaque(double conta) {
		validateQuantiaSaque(conta); // tratamento de exce��o sendo chamada aqui
		saldo -= conta;
	}

	// metodo Saque como privado
	private void validateQuantiaSaque(double conta) { // throw corta o metodo, finaliza.
		if (conta > getLimitSaque()) {
			// BusinessException da classe RuntimeException
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		}
		if (conta > getSaldo()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente!");
		}
	}
}