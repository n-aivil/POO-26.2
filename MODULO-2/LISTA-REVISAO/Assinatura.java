public abstract class Assinatura{
	protected String nomePlano;
	protected double preco;

	public Assinatura(String nomePlano, double preco){
		this.nomePlano = nomePlano;
		this.preco = preco;
	}

	public abstract double calcularPrecoFinal();

	public void exibirInfo(){
		System.out.println("Plano: " + this.nomePlano);
		System.out.println("Preço: R$" + this.preco);
	}
}

class Mensal extends Assinatura{
	private int numeroMeses;

	public Mensal(String nomePlano, double preco, int numeroMeses){
		super(nomePlano, preco);
		this.numeroMeses = numeroMeses;
	}

	public double calcularPrecoFinal(){
		if(numeroMeses < 1){
			System.out.println("Quantidade inválida.");
			return 0.0;
		}else if(numeroMeses == 1){
			return this.preco;
		}else{
			return (this.preco * 0.05);
		}
	}

	@Override
	public void exibirInfo(){
		System.out.println("Plano: " + this.nomePlano);
		System.out.println("Ativo por: " + this.numeroMeses + " meses");
		System.out.println("Preço: R$" + calcularPrecoFinal());
	}
}

class Anual extends Assinatura{
	private String beneficiosExtras;

	public Anual(String nomePlano, double preco, String beneficiosExtras){
		super(nomePlano, preco);
		this.beneficiosExtras = beneficiosExtras;
	}

	public double calcularPrecoFinal(){
		return (this.preco * 0.2);
	}

	@Override
	public void exibirInfo(){
		System.out.println("Plano: " + this.nomePlano);
		System.out.println("Preço: R$" + calcularPrecoFinal());
		System.out.println("Benefícios extras: " + this.beneficiosExtras);
	}
}
