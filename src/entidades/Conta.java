package entidades; //entidade do negocio.

public class Conta {

	private Integer numero;
	private String titularConta;
	private Double saldo;
	private Double limitSaque;

	//para criar um contrutor sem nenhum argumento "construtor vazio"
	public Conta() {
	}
	
	//Contrutor com os argumentos
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

	// metodo Depósito
	public void deposito(double conta) {
		saldo += conta;
	}

	// metodo Saque recebendo argumento quantiaSaque
	public void quantiaSaque(double conta) {
			saldo -= conta;
	}
}
