import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double diaria;
		double dias;
		double extra;
		
		dias = 0;
		diaria = 300;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Você irá passar quantos dias no hotel ? ");
		dias = leitor.nextDouble();
			
		
		if (dias < 15)
		{
			diaria = (dias*diaria) + (dias*20);
		}
		else
		{
			
		}
		
		if (dias == 15)
		{
			diaria = (dias*diaria)+ (dias*14);
			
		}
		else{}
		
		if (dias > 15)
		{
			diaria = (dias*diaria)+ (dias*12);
			
		}
		
		System.out.println(" O numero de dias que você ira passar é de : "+ dias +" Dias");
		System.out.println(" O valor total a ser pago será de : "+ diaria+" Reais");
		 
	}
}
