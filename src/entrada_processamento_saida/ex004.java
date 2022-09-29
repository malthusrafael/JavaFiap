package entrada_processamento_saida;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		Double n1, n2, n3, n4, m;
		
		System.out.print("DIGITE QUATRO VALORES PARA SABER A MÉDIA\n");
		System.out.printf("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor:  ");
		n2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		n3 = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor:   ");
		n4 = ler.nextDouble();
		
		m = (n1+n2+n3+n4)/4;
		
		System.out.printf("A média dos quatro valores digitados é: %.2f",m);
	}
}
