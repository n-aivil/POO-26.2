public interface Cobravel{
	public void cobrar(double valor, String numeroCartao, String idAssinatura);
	public void reembolsar(double valor, String numeroCartao, String idAssinatura);
}
