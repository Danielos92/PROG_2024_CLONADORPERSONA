package Persona;
/*
 * Clase persona con sus atributos
 */
public class persona {
	private String nombre;
	private int peso;
	private int altura;
	private int edad;
	/*
	 * el GetNombre devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/*
	 * Set nombre establece el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/*
	 * constructor de la clase persona
	 */
	public persona(String nombre, int peso, int altura, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	/*
	 * El toString establece la forma de la que se devolveran los datos
	 */
	public String toString() {
		return "[" + nombre + " - " + peso + " - " + altura + " - " + edad + "]";
	}
	
}
