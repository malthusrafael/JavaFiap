package entrada_processamento_saida;


import java.util.Scanner;

public class ex047w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String novocalculo;
		int fatorial, x, x1;

		novocalculo = "S";

		while (novocalculo.toUpperCase().equals("S")) {
			fatorial = 1;

			System.out.println("Digite o número (positivo) que você quer calcular o fatorial: ");
			x = ler.nextInt();
			x1 = x;

			while (x < 0) {
				System.out.println("O valor deve ser positivo.");
				System.out.println("Digite o número (positivo) que você quer calcular o fatorial: ");
				x = ler.nextInt();
				x1 = x;
			}
			if (x == 0) {
				System.out.println("0! = 1");
				System.out.println("Deseja calcular novamente? (S ou N)");
				novocalculo = ler.next();

				while ((!novocalculo.toUpperCase().equals("S")) && (!novocalculo.toUpperCase().equals("N"))) {
					System.out.println("Favor responder com S para SIM ou N para NÃO");
					System.out.println("Deseja calcular novamente? (S ou N)");
					novocalculo = ler.next();
				}
			} else {
				while (x > 0) {
					fatorial = fatorial * x;
					x = x - 1;
				}
				System.out.println(x1 + "! = " + fatorial);

				System.out.println("Deseja calcular novamente? (S ou N)");
				novocalculo = ler.next();

				while ((!novocalculo.toUpperCase().equals("S")) && (!novocalculo.toUpperCase().equals("N"))) {
					System.out.println("Favor responder com S para SIM ou N para NÃO");
					System.out.println("Deseja calcular novamente? (S ou N)");
					novocalculo = ler.next();
				}
			}
		}
		System.out.println("Programa Encerrado.");
	}
	}