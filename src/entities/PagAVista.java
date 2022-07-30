package entities;

import java.util.Date;

import entities.enums.Status;

public class PagAVista extends Pagamento{
	
	private String formaPagamento;

	public PagAVista(Date dataPagamento, Status status, String formaPagamento) {
		super(dataPagamento, status);
		this.formaPagamento = formaPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
