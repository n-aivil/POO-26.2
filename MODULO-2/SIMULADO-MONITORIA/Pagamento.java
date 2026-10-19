public interface Pagamento{
	double calcularValorFinal(double valor);
	String getDescricao();
	default void exibirComprovante(double valor){
		System.out.println("Pago via " + getDescricao() + ": R$" + calcularValorFinal(valor));
	}
}

class PagamentoPix implements Pagamento{
	public double calcularValorFinal(double valor){
		return valor - (valor * 0.05);
	}

	public String getDescricao(){
		return "Pix";
	}
}

class PagamentoBoleto implements Pagamento{
	public double calcularValorFinal(double valor){
		return valor;
	}

	public String getDescricao(){
		return "Boleto";
	}
}

class PagamentoCartao implements Pagamento{
	private int parcelas;

	public void setParcelas(int parcelas){
		this.parcelas = parcelas;
	}

	public double calcularValorFinal(double valor){
		if(parcelas > 3){
			return valor + (valor * 0.08);
		}else{
			return valor;
		}
	}

	public String getDescricao(){
		return "Cartão";
	}
}
