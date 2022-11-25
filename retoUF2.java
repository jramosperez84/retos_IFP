import java.util.Scanner;

public class RetoUF2 {

	public static void main(String[] args) {
		
		int i = 0;
		int numero = 0;
		int contador = 0;
		
		System.out.println("***** Números Primos *****\n"
				+ "**************************");
		System.out.print("Introduzca un número: ");
		
		Scanner entradaDatos = new Scanner (System.in);
		numero = entradaDatos.nextInt();
		entradaDatos.close();
		
		for (i=1; i<numero; i++) {
			if (numero%i == 0) {
				contador++;
			}
		}
		
		System.out.println();
		
		if (contador > 2) {
			System.out.println("El número NO es primo.");
		} else {
			System.out.println("El número SI es primo.");
		}
		
	}

}
