public abstract class Produto{
	private String codigo;
	private String nome;
	private double precoBase;
	private int estoque;

	public Produto(String codigo, String nome, double precoBase, int estoque){
		setCodigo(codigo);
		setNome(nome);
		setPrecoBase(precoBase);
		setEstoque(estoque);
	}

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

	public void setPrecoBase(double precoBase){
		this.precoBase = precoBase;
	}
	public double getPrecoBase(){
		return this.precoBase;
	}

	public void setEstoque(int estoque){
		this.estoque = estoque;
	}
	public int getEstoque(){
		return this.estoque;
	}

	public abstract double calcularPrecoFinal();

	public String exibirResumo(){
		return getCodigo() + " - " + getNome() + ": R$" + calcularPrecoFinal();
	}

	public void baixarEstoque(int quantidade){
		setEstoque(getEstoque() - quantidade);
		System.out.println(quantidade + " unidades removidas do estoque.");
	}
}

class ProdutoFisico extends Produto implements Entregavel{
	private double pesoKg;

	public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg){
		super(codigo, nome, precoBase, estoque);
		setPesoKg(pesoKg);
	}

	public void setPesoKg(double pesoKg){
		this.pesoKg = pesoKg;
	}
	public double getPesoKg(){
		return this.pesoKg;
	}

	public double calcularPrecoFinal(){
		return super.getPrecoBase() + (super.getPrecoBase() * 0.10);
	}

	public double calcularFrete(){
		double frete = 15 + (getPesoKg() * 2);
		return frete;
	}

	public int prazoEntregaDias(String cep){
		if(cep.charAt(0) == 6){
			return 7;
		}else{
			return 12;
		}
	}
}

class ProdutoDigital extends Produto{
	private int tamanhoMB;

	public ProdutoDigital(String codigo, String nome, double precoBase, int estoque, int tamanhoMB){
		super(codigo, nome, precoBase, estoque);
		setTamanhoMB(tamanhoMB);
	}

	public void setTamanhoMB(int tamanhoMB){
		this.tamanhoMB = tamanhoMB;
	}
	public int getTamanhoMB(){
		return this.tamanhoMB;
	}

	public double calcularPrecoFinal(){
		return super.getPrecoBase() - (super.getPrecoBase() * 0.05);
	}
}

class Assinatura extends Produto{
	private int meses;

	public Assinatura(String codigo, String nome, double precoBase, int estoque, int meses){
		super(codigo, nome, precoBase, estoque);
		setMeses(meses);
	}

	public void setMeses(int meses){
		this.meses = meses;
	}
	public int getMeses(){
		return this.meses;
	}

	public double calcularPrecoFinal(){
		if(getMeses() >= 6){
			return ((super.getPrecoBase() * getMeses()) - ((super.getPrecoBase() * getMeses()) * 0.10));
		}else{
			return (super.getPrecoBase() * getMeses());
		}
	}
}
