package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NotaFiscal {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private String nomeEstabelecimento;
	private Integer numeroNota;
	private Date data;
	
	private List<Produto> produtos = null;
	
	public NotaFiscal () {
	}
	
	public NotaFiscal (String nomeEstabelecimento, int numeroNota, Date data, List<Produto> produtos) {
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.numeroNota = numeroNota;
		this.data = data;
		this.produtos = produtos;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public Integer getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(Integer numeroNota) {
		this.numeroNota = numeroNota;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public double valorTotal() {
		double valorTotal = 0;
		for(Produto produto : produtos) {
			valorTotal += produto.valorTotalProduto();
		}
		return valorTotal;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Estabelecimento: " + nomeEstabelecimento + "\n");
		sb.append("Número da Nota: " + numeroNota + "\n");
		sb.append("Data: " + sdf.format(data) + "\n");
		for(Produto prod : produtos) {
			sb.append(prod.toString());
		}
		sb.append("\nValor Total da nota fiscal = R$ " + String.format("%.2f", valorTotal()));
		return sb.toString();
	}
}
