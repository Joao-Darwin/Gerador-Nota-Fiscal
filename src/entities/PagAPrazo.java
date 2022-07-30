package entities;

import java.util.Date;

import entities.enums.Status;

public class PagAPrazo extends Pagamento{
	
	private Integer quantParcelas;

	public PagAPrazo(Date dataPagamento, Status status, Integer quantParcelas) {
		super(dataPagamento, status);
		this.quantParcelas = quantParcelas;
	}

	public Integer getQuantParcelas() {
		return quantParcelas;
	}

	public void setQuantParcelas(Integer quantParcelas) {
		this.quantParcelas = quantParcelas;
	}
}
