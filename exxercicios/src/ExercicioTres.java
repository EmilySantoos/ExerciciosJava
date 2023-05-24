import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
	float salarioBruto,salarioLiquido;
	float adicionalNoturno = 500.00f;
	float horasExtras = 100.00f;
	float descontos = 200.00f;

	Scanner leia  = new Scanner(System.in);
	
	System.out.print("Digite seu atual salario :");
	salarioBruto = leia.nextFloat();
	System.out.print("Digite seu adicional Noturno :");
	adicionalNoturno = leia.nextFloat();
	
	salarioLiquido =(salarioBruto + adicionalNoturno)+ (horasExtras *5)-descontos;
	 
	System.out.print("Parabéns seu atual salario é :" + salarioLiquido);
	
	}

}
