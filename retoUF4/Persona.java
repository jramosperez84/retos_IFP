// ******************************* Clase Persona


public class Persona extends Familia {

	protected String nombre;
	protected int edad;
	protected String dni;
	protected String sexo;
	protected float peso;
	protected float altura;
	
	public Persona (String nombre, int edad, String dni, String sexo, float peso, float altura, String libroFamilia, String direccion, String poblacion, String provincia) {
		super(libroFamilia, direccion, poblacion, provincia);
		setNombre(nombre);
		setEdad(edad);
		setDni(dni);
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float imc() {
		float imc = peso/(altura*altura);
		return imc;
	}
	
}