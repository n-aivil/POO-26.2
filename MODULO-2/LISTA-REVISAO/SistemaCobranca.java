public class SistemaCobranca implements Cobravel{
	public void cobrar(double valor, String numeroCartao, String idAssinatura){
		if(idAssinatura == null || idAssinatura.isEmpty()){
			throw AssinaturaNaoEncontradaException;
		}else if(numeroCartao.length() != 16){
			throw CartaoInvalidoException;
		}else if(valor > 1000 || valor <= 0){
			throw PagamentoRecusadoException;
		}else{
			System.out.println("Cobrança ao ID " + idAssinatura + " realizada.");
		}
	}

}
