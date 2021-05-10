package exceptions;

//regra de negocio que foi inflingida, herdando da classe RuntimeException do java
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L; //explica que essa exceção esta na versão 1.

	public BusinessException(String msg) { // construtor para estarciar com String
		super(msg); // aproveitando o construtor da RuntimeException com o super repasando a msg.
	}
}
