package estruturaRepeticao;
import java.util.Scanner;

public class EmpresaJXA {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int salario, quantfun, mediasal, soma=0;

		System.out.println("Informe a quantidade de funcionários que há em sua empresa: ");
		quantfun = ler.nextInt();

		for (int i = 1; i <= quantfun; i++) {
			System.out.println("Informe o salário do funcionário: ");
			salario = ler.nextInt();
			soma += salario;
		}
		mediasal = soma/quantfun;
		System.out.println("A média salarial é R$" + mediasal);
		ler.close();
	}

}
