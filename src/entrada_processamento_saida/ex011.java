package entrada_processamento_saida;

import java.util.Scanner;

public class ex011 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o tamanho da base: ");
		double base = ler.nextDouble();
		
		System.out.printf("Digite a altura: ");
		double h = ler.nextDouble();
		
		double area = (base*h);
		
		if (area>100) {
			System.out.printf("Terreno grande");
		}
		
	
}

	

}
