package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.Status;

public class PagAVista extends Pagamento{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
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
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Pagamento:\n");
		sb.append("Data: " + sdf.format(super.getDataPagamento()) + "\n");
		sb.append("Status: " + super.getStatus() + "\n");
		sb.append("Forma de pagamento: " + formaPagamento + "\n");
		return sb.toString();
	}
}
