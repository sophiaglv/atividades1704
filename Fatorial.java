package estruturaRepeticao;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, fatorial=1;

		System.out.println("Escreva o número para a fatoração: ");
		num = ler.nextInt();

		for (int i = 1; i <=num; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("O fatorial do número escolhido é: " + fatorial);
		ler.close();
	}

}
