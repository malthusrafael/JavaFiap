package entrada_processamento_saida;
import java.util.Scanner;

public class ex002 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int a,area;
	
	System.out.printf("Digite a aresta do quadrado para calcular sua area: ");
	a = ler.nextInt();
	
	area = a*a;
	
	
	System.out.printf("Um quadrado com aresta de %d tem uma area de %d ",a,area);
	
	
	
}
}
