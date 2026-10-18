package EXCECOES;

public class CartaoInvalidoException extends RuntimeException{
	public CartaoInvalidoException(String mensagem){
		super(mensagem);
	}
}
