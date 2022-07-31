package entities;

public class Produto {
	
	private String nome;
	private Integer quantidade;
	private Double valor;
	
	private Categoria categoria;
	private Pagamento pagamento;
	
	public Produto () {
	}
	
	public Produto (String nome, int quantidade, double valor, Categoria categoria, Pagamento pagamento) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.categoria = categoria;
		this.pagamento = pagamento;
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
	
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public double valorTotalProduto () {
		return getValor() * getQuantidade();
	}
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome do produto: " + nome + "\n");
		sb.append("Categoria: " + categoria.getNome() + "\n");
		sb.append("Quantidade: " + quantidade + "\n");
		sb.append("Valor (R$): R$ " + String.format("%.2f", valor) + "\n");
		sb.append("Valor produtos: R$ " + String.format("%.2f", valorTotalProduto()) + "\n");
		sb.append(pagamento.toString());
		return sb.toString();
	}
}
