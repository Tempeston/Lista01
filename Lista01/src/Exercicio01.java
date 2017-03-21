import java.util.Scanner;


public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		final int multa = 4;
		double excesso;
		double multav = 0;
		
		//Scanner
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o peso da pesca: ");
		peso = leitor.nextDouble();
		excesso = peso - 50;
		if(excesso < 0)
			System.out.println("O valor da multa a ser paga é: 0R$ O excesso de peso foi de: 0.0Kg");
		else
			multav = excesso * multa;
			System.out.println("O valor da multa a ser paga é: " + multav + "R$ O excesso de peso foi de: " + excesso + "Kg");
	}

}
