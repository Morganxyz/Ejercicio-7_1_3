import java.util.Scanner;

public class M7_1Ex3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix un nombre sencer:");
		num1 = entrada.nextInt();
		
		System.out.println((num1 % 2 == 0) ? "El número introduit es par" : "El número introduit es impar");

	}

}
