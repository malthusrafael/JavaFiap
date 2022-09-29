package entrada_processamento_saida;
import java.util.Scanner;

public class ex048f {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, y, i;

        System.out.println("Digite um número qualquer: ");
        x = ler.nextInt();

        for (i = 1; i <= 20; i++) {
            y = x + i;
            System.out.println(y);
        }
    }
    }