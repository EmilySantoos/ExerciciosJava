import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4;
		float media;
		
		Scanner leia  = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota :");
		 nota1 = leia.nextFloat();
		 System.out.print("Digite sua segunda nota :");
		 nota2 = leia.nextFloat();
		 System.out.print("Digite sua terceira nota nota :");
		 nota3 = leia.nextFloat();
		 System.out.print("Digite sua quarta nota :");
		 nota4 = leia.nextFloat();
		 
		 media =( nota1 + nota2 + nota3+nota4 )/4;
				 
		 System.out.print("Parabéns,sua nota foi de :" + media);
		  
	
	}

}
