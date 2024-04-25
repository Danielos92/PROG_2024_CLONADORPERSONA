package Persona;

public class persona {
	private String nombre;
	private int peso;
	private int altura;
	private int edad;
	public String getNombre() {
		return nombre;
	}
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
	
	public persona(String nombre, int peso, int altura, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "[" + nombre + " - " + peso + " - " + altura + " - " + edad + "]";
	}
	
}
