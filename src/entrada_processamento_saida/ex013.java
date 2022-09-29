package entrada_processamento_saida;

import java.util.Scanner;

public class ex013 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro valor: ");
		double v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		double v2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		double v3 = ler.nextDouble();
		
		if (v1 > v2 && v1 > v3) {
			System.out.printf("O maior valor digitado foi %.2f",v1);
		}else if (v2 > v1 && v2 >v3) {
			System.out.printf("O maior valor digitado foi %.2f",v2);
		}else {
			System.out.printf("o maior valor digitado foi %.2f",v3);
		}
				
		}
		
		
	}


