public class Pessoa{
	private String nome;
	private String cpf;
	private String email;

	public Pessoa(String nome, String cpf, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String toString(){
		return "Nome: " + this.nome + " | CPF: " + this.cpf;
	}
}

class Cliente extends Pessoa{
	private String endereco;
	private int pontosFidelidade;

	public Cliente(String nome, String cpf, String email, String endereco){
		super(nome, cpf, email);
		this.endereco = endereco;
		this.pontosFidelidade = 0;
	}

	public void adicionarPontos(int pontos){
		this.pontosFidelidade += pontos;
		System.out.println(pontos + " pontos adicionados.");
	}
}

class ClienteVip extends Cliente{
	private static double percentualDesconto = 0.10;

	public ClienteVip(String nome, String cpf, String email, String endereco){
		super(nome, cpf, email, endereco);
	}

	@Override
	public String toString(){
		return super.toString() + " | VIP (" + percentualDesconto * 100 + "%)";
	}
}

class Funcionario extends Pessoa{
	private String matricula;
	private double salario;

	public Funcionario(String nome, String cpf, String email, String matricula, double salario){
		super(nome, cpf, email);
		this.matricula = matricula;
		this.salario = salario;
	}
}
