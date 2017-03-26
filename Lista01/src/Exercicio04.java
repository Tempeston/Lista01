import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	double altura;
	double peso;
	
	
	Scanner leitor = new Scanner(System.in);
		
	System.out.println(" Qual é o seu peso atual ? ");
	peso = leitor.nextDouble();
	System.out.println(" Qual é a sua altura atual ? ");
	altura = leitor.nextDouble();
	
	if (altura <= 150) {
		
		if (peso <50){
			
			peso = 50 - peso;
			System.out.println(" Engorde "+ peso + "Kg" + " para ficar no peso ideal");
			
		}
		
		else if(peso > 50)
		
		{	peso = peso - 50;
			
			System.out.println("Emagreça " + peso +" Kg"+" para ficar no peso ideal");
		}
			
		else { 	
			System.out.println("Você esta no peso ideal");
		}
	}
		
		else if (altura <= 190){
	
			if (peso <70)
			{
				peso = 70 - peso;
			System.out.println("Engorde"+peso+" Kg "+" para ficar no peso ideal ");
			}
			
			else if (peso > 70)
			{
				
				peso = peso - 70;
			}
			
			else
			{
				System.out.println("Você esta no peso ideal");
			}
		}
			else if (peso > 100){
			
			
				peso = peso - 100;
				
				System.out.println("Emagreça " + peso +"Kg"+" para ficar no peso ideal");
				
			}
			
			else if  (peso < 100){
			
				peso = 100 - peso;
				
				System.out.println("Engorde "+ peso +"Kg"+" para ficar no peso ideal");
			}
		
			else {
				System.out.println("Você esta no peso ideal");
			}
			
	
		}
	


	
	}
