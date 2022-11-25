import java.util.Scanner;

public class RetoUF1 {

	public static void main(String[] args) {		
		
		System.out.println("Reto del reloj");
		
		Scanner entradaDatos = new Scanner (System.in);
		
		System.out.print("Introduce la hora: ");
		int hora = entradaDatos.nextInt();
		System.out.print("Introduce los minutos: ");
		int minutos = entradaDatos.nextInt();
		System.out.print("Introduce los segundos: ");
		int segundos = entradaDatos.nextInt();		
		
		entradaDatos.close();
		
		if (hora<0 || hora>23) {
			System.out.println("La hora NO es correcta");
		} else if (minutos<0 || minutos>59){
			System.out.println("La hora NO es correcta");
		} else if (segundos<0 || segundos>59){
			System.out.println("La hora NO es correcta");
		} else {
			System.out.println("La hora es correcta");
		}
		
	}

}