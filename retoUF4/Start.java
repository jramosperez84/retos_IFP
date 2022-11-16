// ******************************* Clase Start
 
 
public class Start {
    
    public static String imprimePersona (Persona persona) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("La persona se llama: "+persona.getNombre()+" - ")
            .append("Edad: "+persona.getEdad()+" - ")
            .append("DNI: "+persona.getDni()+" - ")
            .append("IMC: "+persona.imc());
        return sb.toString();
    };
    
    public static void main(String[] args) {
    
        Persona persona1 = new Persona ("Jorge", 38, "00000000A", "Masculino", 87.0f, 1.79f, "001", "Mi direccion", "Mi poblacion", "Mi provincia");
        
        Persona persona2 = new Persona ("Persona2", 35, "00000000Z", "Femenino", 71.0f, 1.63f, "002", "Mi direccion", "Mi poblacion", "Mi provincia");
        
        Persona persona3 = new Persona ("Persona3", 12, "00000000N", "Femenino", 55.0f, 1.45f, "003", "Mi direccion", "Mi poblacion", "Mi provincia");
        
        System.out.println(imprimePersona(persona1));
        System.out.println(imprimePersona(persona2));
        System.out.println(imprimePersona(persona3));
        
    }
}