package entrada_processamento_saida;

import java.util.Scanner;

public class ex003 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int base,h,a;
		
		System.out.printf("Digite o valor da base do triangulo: ");
		base = ler.nextInt();
		
		System.out.printf("Digite a altura do triangulo: ");
		h = ler.nextInt();
		
		a = (base*h)/2;
		
		System.out.printf("A area do triangulo é: %d", a);
		
	
	}
}
