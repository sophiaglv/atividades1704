package estruturaRepeticao;
import java.util.Scanner;

public class ImparPar10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, somaPar=0, somaImpar=0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o número: ");
			num = ler.nextInt();

			if (num %2 == 0) {
				somaPar ++;
			}
			else {
				somaImpar ++;
			}
		}
		System.out.println("A quantidade de números pares é: " + somaPar);

		System.out.println("A quantidade de números ímpares é: " + somaImpar);

		ler.close();
	}

}
