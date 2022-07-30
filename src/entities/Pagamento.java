package entities;

import java.util.Date;

import entities.enums.Status;

public abstract class Pagamento {
	
	private Date dataPagamento;
	private Status status;

	public Pagamento (Date dataPagamento, Status status) {
		this.dataPagamento = dataPagamento;
		this.status = status;
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
