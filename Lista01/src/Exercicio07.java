import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vendaM;
		double reajuste;
		double pre�o;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual � a venda Mensal?");
		vendaM = leitor.nextDouble();
		
		System.out.println("Qual � o pre�o do produto?");
		pre�o = leitor.nextDouble();
		
		
		if (vendaM < 500) 
		{
			if (pre�o < 30)
			{
				reajuste = pre�o + (pre�o*10)/100;
				System.out.println(" O pre�o do produto fica :"+ reajuste);
			}
			else if (vendaM < 1200)
			{
				if (pre�o >= 30 && pre�o <60)
				{
					reajuste = pre�o + (pre�o*15)/100;
					System.out.println(" O pre�o do produto fica :"+ reajuste);
				}
			
				else
				{
					if (pre�o >= 80)
					{
						reajuste = pre�o - (pre�o*20)/100;
						System.out.println(" O pre�o do produto fica :"+ reajuste);
						
							
					}
				
					
				}
			
			
			
			}	
			
			
				
		}
		
		
		
		
		
	}
}