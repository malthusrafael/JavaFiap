package entrada_processamento_saida;
import java.util.Scanner;

public class ex001 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.printf("Digite a base do retangulo: ");
	double b =  ler.nextDouble();
	
	System.out.printf("Digite a altura do retangulo: ");
	double h = ler.nextDouble();
	
	double a = (b * h);
	
	System.out.printf("A area do retangulo é %.2f",a);
}
	
	
}

