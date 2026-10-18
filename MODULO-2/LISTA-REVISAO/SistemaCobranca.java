import EXCECOES.*;

public class SistemaCobranca implements Cobravel{
	public void cobrar(double valor, String numeroCartao, String idAssinatura){
		if(idAssinatura == null || idAssinatura.isEmpty()){
			throw new AssinaturaNaoEncontradaException("Assinatura não encontrada ou ID inválido.");
		}else if(numeroCartao.length() != 16){
			throw new CartaoInvalidoException("Número do cartão inválido.");
		}else if(valor > 1000 || valor <= 0){
			throw new PagamentoRecusadoException("Pagamento recusado.");
		}else{
			System.out.println("Cobrança no valor de R$" + valor + " à assinatura ID " + idAssinatura + " realizada.");
		}
	}

	public void reembolsar(double valor, String numeroCartao, String idAssinatura){
		if(idAssinatura == null || idAssinatura.isEmpty()){
			throw new AssinaturaNaoEncontradaException("Assinatura não encontrada ou ID inválido.");
		}else if(numeroCartao.length() != 16){
			throw new CartaoInvalidoException("Número do cartão inválido.");
		}else if(valor <= 0){
			throw new IllegalArgumentException("Valor de reembolso inválido.");
		}else{
			System.out.println("Reembolso de R$ " + valor + " realizado com sucesso para a assinatura ID: " + idAssinatura + "; cartão ****" + numeroCartao.substring(11) + " .");
		}
	}
}
