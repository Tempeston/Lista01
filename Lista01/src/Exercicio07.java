import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vendaM;
		double reajuste;
		double preço;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é a venda Mensal?");
		vendaM = leitor.nextDouble();
		
		System.out.println("Qual é o preço do produto?");
		preço = leitor.nextDouble();
		
		
		if (vendaM < 500) 
		{
			if (preço < 30)
			{
				reajuste = preço + (preço*10)/100;
				System.out.println(" O preço do produto fica :"+ reajuste);
			}
			else if (vendaM < 1200)
			{
				if (preço >= 30 && preço <60)
				{
					reajuste = preço + (preço*15)/100;
					System.out.println(" O preço do produto fica :"+ reajuste);
				}
			
				else
				{
					if (preço >= 80)
					{
						reajuste = preço - (preço*20)/100;
						System.out.println(" O preço do produto fica :"+ reajuste);
						
							
					}
				
					
				}
			
			
			
			}	
			
			
				
		}
		
		
		
		
		
	}
}