package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.Status;

public class PagAPrazo extends Pagamento{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
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
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Pagamento: \n");
		sb.append("Data: " + sdf.format(super.getDataPagamento()) + "\n");
		sb.append("Status: " + super.getStatus() + "\n");
		sb.append("Quantidade de parcelas: " + quantParcelas + "\n");
		return sb.toString();
	}
}
