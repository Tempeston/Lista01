import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double RM;
		double RH;
		double RC;
		double IR;
		double RL;
		double LQ;
		
		Scanner leitor = new Scanner(System.in);	
		
		System.out.println(" Qual é o Salario do Homem ?");
		RH = leitor.nextDouble();
		System.out.println(" Qual é o salario da Mulher ?");
		RM = leitor.nextDouble();
		
		RC = RH + RM;
		IR = 0;
		
		if (RH + RM <= 900)
		{
			System.out.println(" A renda conjunta é baixa e esta isenta de juros. ");
		}
		else
		{
			
		}
		
		if (RC <= 1500)
			{
				IR = (RC*10) /100;
			}
		
		 else {
			if (RC <= 2500)
			{
				IR = (RC*15)/100;
			}
		
		 }
			if (RC > 2500)
			
			{
				IR = (RC*25)/100;
				
			}
			
			RL = IR + RC;
			LQ = (RL*100)/RC-100;
			
		System.out.println(" A Renda Conjunta do casal é de : " + RC);
		System.out.println(" Aliquota ultilizada foi de :" + LQ+"%" );
		System.out.println(" O imposto de renda calculado foi de : " + IR);
		System.out.println(" A renda liquida do casal é de "+ RL);
				
	}

}
