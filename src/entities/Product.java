package entities;

public class Product implements Comparable<Product>{
	private String nome;
	private Double valor;
	
	
	public Product() {
	}
		
	public Product(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto: "+ nome + " - Valor: R$" + String.format("%.2f", valor);
	}

	@Override
	public int compareTo(Product other) {
		return valor.compareTo(other.getValor());
	}
	
	
}
