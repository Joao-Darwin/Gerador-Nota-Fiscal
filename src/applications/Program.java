package applications;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Categoria;
import entities.NotaFiscal;
import entities.PagAPrazo;
import entities.PagAVista;
import entities.Produto;
import entities.enums.Status;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String caminho = "/home/joaodarwin/eclipse-workspace/Gerador nota fiscal/Notas fiscais/Nota Fiscal 01";
		File file = new File(caminho);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		List<Produto> produtos = new ArrayList<>();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			char escolha = 'S';
			System.out.println("***NOTA FISCAL***");
			System.out.print("Nome do estabelecimento: ");
			String nomeEstabelecimento = sc.nextLine();
			System.out.print("Número da nota fiscal: ");
			int numeroNota = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy HH:mm:ss): ");
			sc.nextLine();
			Date data = sdf.parse(sc.nextLine());

			do {
				System.out.print("Nome do produto: ");
				String nomeProduto = sc.nextLine();
				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();
				System.out.print("Valor (R$): ");
				double valor = sc.nextDouble();
				System.out.print("Categoria: ");
				sc.nextLine();
				String categoria = sc.nextLine();
				System.out.print("Tipo pagamento (A vista 1/A Prazo 2): ");
				int tipoPagamento = sc.nextInt();
				sc.nextLine();
				System.out.print("Status (PROCESSADO/CANCELADO): ");
				String status = sc.nextLine().toUpperCase();
				System.out.print("Forma de pagamento: ");
				String formaPagamento = sc.nextLine();

				if (tipoPagamento == 1) {
					produtos.add(new Produto(nomeProduto, quantidade, valor, new Categoria(categoria),
							new PagAVista(data, Status.valueOf(status), formaPagamento)));
				} else {
					System.out.print("Quatidade de parcelas: ");
					int quantParcelas = sc.nextInt();
					produtos.add(new Produto(nomeProduto, quantidade, valor, new Categoria(categoria),
							new PagAPrazo(data, Status.valueOf(status), quantParcelas)));
				}
				
				System.out.print("Existe outro produto? (S/N) ");
				escolha = sc.next().charAt(0);
				sc.nextLine();
			} while (escolha == 'S');
			
			NotaFiscal notaFiscal = new NotaFiscal(nomeEstabelecimento, numeroNota, data, produtos);
			bw.write(notaFiscal.toString());
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
