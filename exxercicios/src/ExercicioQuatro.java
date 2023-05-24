import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		float numero1,numero2,numero3,numero4;
		float calculo;
		
		Scanner leia  = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro número :");
		numero1 = leia.nextFloat();
		System.out.print("Digite o segundo número :");
		numero2 = leia.nextFloat();
		System.out.print("Digite o terceiro número :");
		numero3 = leia.nextFloat();
		System.out.print("Digite o quarto número :");
		numero4 = leia.nextFloat();
		
		calculo = (numero1*numero2)-(numero3*numero4);
		
		System.out.print("A diferença dos numeros são :" + calculo);
		
	}

}
