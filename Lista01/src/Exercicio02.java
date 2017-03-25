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
		
		if (l1 == l2 && l2 == l3)
			System.out.println("\nO triangulo é Equilatero");
        else
        {
            if (l1 == l2 || l1 == l3 || l2 == l3)
            	System.out.println("\nO triangulo é Isoceles");
            else
            {
                if (l1!=l2 || l1!=l3 || l3!=l2)
                    System.out.println("\nO triangulo é Escaleno");
            }
        }
        
    }
}

