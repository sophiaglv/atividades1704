package estruturaRepeticao;
import java.util.Scanner;

public class SomaeMedia5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma = 0, num, media ;

		for (int i=1; i<=5; i++) {
			System.out.println("Informe o número: ");
			num = ler.nextInt();
			soma += num;		
		}
		media = soma/5;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		
		ler.close();
	}

}
