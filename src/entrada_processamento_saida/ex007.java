package entrada_processamento_saida;
import java.util.Scanner;
public class ex007 {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o valor do primeiro produto R$");
		double p1 = ler.nextDouble();
		
		System.out.print("Digite o valor do segundo produto R$");
		double p2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto R$");
		double p3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto R$");
		double p4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto R$");
		double p5 = ler.nextDouble();
		
		double t = p1+p2+p3+p4+p5;
		
		System.out.printf("O total é R$%.2f\n",t);
		
		System.out.printf("Digite o valor do pagamento R$");
		double pg = ler.nextDouble();
		
		double troco = pg-t;
		
		System.out.printf("O troco é R$%.2f",troco);
	}

}
