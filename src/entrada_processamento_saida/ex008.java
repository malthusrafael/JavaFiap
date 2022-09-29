package entrada_processamento_saida;

import java.util.Scanner;

public class ex008 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
	
		System.out.printf("DIGITE O PRIMEIRO VALOR: ");
		double v1 = ler.nextDouble();
		
		System.out.printf("DIGITE O SEGUNDO VALOR: ");
		double v2 = ler.nextDouble();
		
		if (v1>v2){
			System.out.printf("O maior valor digitado foi o primeiro %.2f",v1);
		}else {
			System.out.printf("O maior valor digitado foi o segundo %.2f",v2);
		}
	
		
	
	
	}

}
