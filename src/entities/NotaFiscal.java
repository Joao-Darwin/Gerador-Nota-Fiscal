package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {
	
	private Integer numeroNota;
	private Date data;
	
	private List<Produto> produtos = new ArrayList<E>();
	private Pagamento pagamento;
	
	public NotaFiscal () {
	}
	
	public NotaFiscal (int numeroNota, Date data, Pagamento pagamento) {
		this.numeroNota = numeroNota;
		this.data = data;
		this.pagamento = pagamento;
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

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	@Override 
	public String toString() {
		
	}
}
