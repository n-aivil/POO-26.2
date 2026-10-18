import EXCECOES.*;

public class Main{
	public static void main(String[] args){
		// planos mensais
		Mensal planoMesA = new Mensal("Plano Mensal Básico", 15.00, 3);
		Mensal planoMesB = new Mensal("Plano Semestral Básico", 12.00, 6);

		// planos anuais
		Anual planoAnoA = new Anual("Plano Anual Básico", 10.00, "Revistas exclusivas");
		Anual planoAnoB = new Anual("Plano Anual Avançado", 13.00, "Meet & Greet");

		// lista de assinatura (abstract list?)

		planoMesA.exibirInfo();
		planoMesB.exibirInfo();
		planoAnoA.exibirInfo();
		planoAnoB.exibirInfo();

		// cobranças
		SistemaCobranca sistemaCobranca = new SistemaCobranca();

		try{
			sistemaCobranca.cobrar(10.00, "4856267856321486", "st_728");
		}catch(CartaoInvalidoException exc){
			System.out.println(exc.getMessage());
		}catch(PagamentoRecusadoException exc){
			System.out.println(exc.getMessage());
		}catch(AssinaturaNaoEncontradaException exc){
			System.out.println(exc.getMessage());
		}finally{
			System.out.println("Cobrança finalizada.");
			System.out.println();
		}

		try{
			sistemaCobranca.cobrar(13.00, "48563217956", "ai_273");
		}catch(CartaoInvalidoException exc){
			System.out.println(exc.getMessage());
		}catch(PagamentoRecusadoException exc){
			System.out.println(exc.getMessage());
		}catch(AssinaturaNaoEncontradaException exc){
			System.out.println(exc.getMessage());
		}finally{
			System.out.println("Cobrança finalizada.");
			System.out.println();
		}

		try{
			sistemaCobranca.cobrar(2000.00, "7854123658965423", "ja_289");
		}catch(CartaoInvalidoException exc){
			System.out.println(exc.getMessage());
		}catch(PagamentoRecusadoException exc){
			System.out.println(exc.getMessage());
		}catch(AssinaturaNaoEncontradaException exc){
			System.out.println(exc.getMessage());
		}finally{
			System.out.println("Cobrança finalizada.");
			System.out.println();
		}

		try{
			sistemaCobranca.cobrar(12.00, "4857621589635485", "");
		}catch(CartaoInvalidoException exc){
			System.out.println(exc.getMessage());
		}catch(PagamentoRecusadoException exc){
			System.out.println(exc.getMessage());
		}catch(AssinaturaNaoEncontradaException exc){
			System.out.println(exc.getMessage());
		}finally{
			System.out.println("Cobrança finalizada.");
			System.out.println();
		}

		//reembolsos
		try{
			sistemaCobranca.reembolsar(10.00, "4856267856321486", "st_728");
		}catch(AssinaturaNaoEncontradaException exc){
			System.out.println(exc.getMessage());
		}catch(CartaoInvalidoException exc){
			System.out.println(exc.getMessage());
		}catch(IllegalArgumentException exc){
			System.out.println(exc.getMessage());
		}finally{
			System.out.println("Reembolso finalizado.");
			System.out.println();
		}

		try{
			sistemaCobranca.reembolsar(-10.00, "4856267856321486", "st_728");
		}catch(AssinaturaNaoEncontradaException exc){
			System.out.println(exc.getMessage());
		}catch(CartaoInvalidoException exc){
			System.out.println(exc.getMessage());
		}catch(IllegalArgumentException exc){
			System.out.println(exc.getMessage());
		}finally{
			System.out.println("Reembolso finalizado.");
			System.out.println();
		}
	}
}
