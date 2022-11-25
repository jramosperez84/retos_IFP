import java.util.Scanner;

public class ArraySimple {
    public static void main(String[] args) throws Exception {

        int i = 0;
        int numEmpleados = 0;
        float aux = 0.0f;
        float sueldoMedio = 0.0f;
        try (Scanner entradaDatos = new Scanner(System.in)) {
            System.out.print("Introduzca el número de empleados: ");
            numEmpleados = entradaDatos.nextInt();
            System.out.println("");

            if (numEmpleados <= 0 )
                System.out.println("Error, el número de empleados es incorrecto.");

            else {

                String[] nombreEmpleados = new String[numEmpleados];
                float[] sueldoEmpleados = new float[numEmpleados];
                entradaDatos.nextLine();

                for (i = 0; i < nombreEmpleados.length; i++) {
                    System.out.print("Introduce el nombre del empleado número " + (i + 1) + ": ");
                    nombreEmpleados[i] = entradaDatos.nextLine();

                    System.out.print("Introduce el sueldo del empleado número " + (i + 1) + ": ");
                    sueldoEmpleados[i] = entradaDatos.nextFloat();
                    entradaDatos.nextLine();
                    System.out.println("");
                }
                entradaDatos.close();


                for (i = 0; i< nombreEmpleados.length; i++) {                
                    System.out.println("El nombre del empleado " + (i+1) + " es " + nombreEmpleados[i] + " y su sueldo es " + sueldoEmpleados[i] + "€");
                    aux = aux + sueldoEmpleados[i];
                }

                System.out.println("");
                sueldoMedio = aux / numEmpleados;
                System.out.println("El suedo medio es: " + sueldoMedio + "€");

            }
        }

    }
}
