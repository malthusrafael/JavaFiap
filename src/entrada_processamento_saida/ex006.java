package entrada_processamento_saida;
import java.util.Scanner;

public class ex006 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Coversor de dolares em reais\n");
		
		System.out.printf("Digite o valor da cotaçao do dolar em reais R$");
		double cot = ler.nextDouble();
		
		System.out.printf("Digite quantos dolares deseja converter para reais U$");
		double d = ler.nextDouble();
		
		double r = cot*d;
		
		System.out.printf("U$%.2f é equivalente a quantia de R$%.2f ",d,r);
		
		
		
	}

}
