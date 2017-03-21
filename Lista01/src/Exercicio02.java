import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1;
		int l2;
		int l3;
				
		//Scanner
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor do primeiro lado: ");
		l1 = leitor.nextInt();
		System.out.println("Informe o valor do segundo lado: ");
		l2 = leitor.nextInt();
		System.out.println("Informe o valor do terceiro lado: ");
		l3 = leitor.nextInt();
		
		if ((l1 == l2) && (l2 == l3));
		System.out.println("O triangulo é Equilatero");
		if ((l1 == l2) && (l2 != l3));
		System.out.println("O triangulo é Isóceles");
		if ((l1 != l2) && (l2 != l3));
		System.out.println("O triangul é Escaleno");
		

	}

}
