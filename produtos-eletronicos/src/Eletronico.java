
public abstract class Eletronico {

	String nome; 
	double preco;
	int numeracao;
	String marca; 
	
	public Eletronico(int numeracao) {
		this.numeracao = numeracao; 
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getNumercao() {
		return this.numeracao;
	}
	
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca; 
	}
	
}


