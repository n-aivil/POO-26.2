import java.utils.List;
import java.util.ArrayList;

public class CarrinhoDeCompras{
	private List<Produto> itens;

	public CarrinhoDeCompras(){
		List<Produto> itens = new ArrayList();
	}

	public void adicionar(Produto p){
		itens.add(Produto p);
	}

	public void adicionar(Produto p, int quantidade){
		for(int i = 1; i <= quantidade; i++){
			itens.adicionar(p);
		}
	}

	public double calcularTotal(){
		double total = 0;

		for(int i = 0; i < itens.size(); i++){
			total += itens.get(i).calcularPrecoFinal();
		}

		return total;
	}

	double calcularFreteTotal(String cep){
		double freteTotal = 0;

		for(int i = 0; i < items.size() ; i++){
			if(itens.get(i).getClass() == ProdutoFisico.class){
				freteTotal += itens.get(i).calcularFrete();
			}else {continue;}
		}

		return freteTotal;
	}
}
