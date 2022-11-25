import java.util.ArrayList;
import java.util.Scanner;

public class ListaArray {

    public static void main(String[] args) {
        int i = 0;
        int numEmpleados = 0;
        String nombre = "";
        float sueldo = 0.0f;
        float aux = 0.0f;
        float sueldoMedio = 0.0f;
        
        ArrayList<String> nombreEmpleado = new ArrayList<String>();
        ArrayList<Float> sueldoEmpleado = new ArrayList<Float>();

        try (Scanner entradaDatos = new Scanner(System.in)) {            

            System.out.print("Introduzca el número de empleados: ");
            numEmpleados = entradaDatos.nextInt();
            System.out.println("");

            if (numEmpleados <= 0 )
                System.out.println("Error, el número de empleados es incorrecto.");

            else {

                for (i = 0; i < numEmpleados; i++) {
                    System.out.print("Introduzca el nombre del empleado: ");
                    nombre = entradaDatos.next();
                    nombreEmpleado.add(nombre);
                    
                    System.out.print("Introduzca el sueldo del empleado: ");
                    sueldo = entradaDatos.nextFloat();
                    sueldoEmpleado.add(sueldo);
                    System.out.println("");
                }

                for (i = 0; i < numEmpleados; i++) {
                    System.out.println("El nombre del empleado " + (i+1) + " es " + nombreEmpleado.get(i) + " y su sueldo es " + sueldoEmpleado.get(i) + "€");
                    aux = aux + sueldoEmpleado.get(i);                    
                }
                System.out.println("");
                sueldoMedio = aux / numEmpleados;
                System.out.println("El suedo medio es: " + sueldoMedio + "€");
                
            }
        }    
    
    }
}