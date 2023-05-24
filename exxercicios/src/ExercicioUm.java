import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		float salario,novoSalario;
		float ABONO = 10000.00f;
		
		  Scanner leia  = new Scanner(System.in);
		  
		  System.out.print("Digite seu atual salario :");
		  salario  = leia.nextFloat();
		  
		  novoSalario = ABONO + salario;
		  

		  System.out.printf("\nParabéns, seu novo salario é de : " + novoSalario );
		  salario  = leia.nextFloat();

	}

}
