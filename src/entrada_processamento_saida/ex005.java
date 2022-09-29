package entrada_processamento_saida;
import java.util.Scanner;

public class ex005 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf(" Digite a temperatura em Celsius para calcular equivalente em Fahrenheit: ");
		double c = ler.nextDouble();
		
		double f = (c*9/5)+32;
		
		System.out.printf("A temperatura de %.2f°C é equivalente a %.2f°F ",c ,f);
		
	}

}
