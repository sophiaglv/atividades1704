package estruturaRepeticao;
import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numIN, numFIM;

		System.out.println("Informe o número inicial do intervalo: ");
		numIN = ler.nextInt();
		System.out.println("Informe o número final do intervalo: ");
		numFIM = ler.nextInt();

		for (int i = numIN; i <= numFIM; i++) {
			if (i %2 == 1) {
				System.out.println(i + " é ímpar");
			}
		}
		ler.close();
	}

}
