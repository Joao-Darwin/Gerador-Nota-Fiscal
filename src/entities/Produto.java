package entities;

public class Produto {
	
	private String nome;
	private Integer quantidade;
	private Double valor;
	
	private Categoria categoria;
	
	public Produto () {
	}
	
	public Produto (String nome, int quantidade, double valor, Categoria categoria) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
