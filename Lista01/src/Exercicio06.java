import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double renda ;
		double Qpessoas;
		double pag;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas pessoas s�o?");
		Qpessoas = leitor.nextDouble();
		
		System.out.println("Quanto � a renda?");
		renda = leitor.nextDouble();
		
		renda = renda - (600*Qpessoas) ;
		
		if (renda <= 10000)
		{
			System.out.println("Voc� esta isento do imposto de renda");
		}
		else if (renda <= 30000)
		 
		{		
			pag = (renda*5)/100;
		
			System.out.println("O pagamento � de :"+ pag);
		}
		
		else if ( renda <= 60000) 
		{
			pag = (renda*10)/100;
			System.out.println("O pagamento � de"+ pag);
		}	
		
		else {
			
			pag = (renda*15)/100;
			System.out.println(" O pagamento � de :"+ pag);
		}
		
		
		
	}

}
