package ClonadorPersona;
/*
 * Clase clonador
 */
public class Clonador {
	private String clonadorPersona;

	public String getClonadorPersona() {
		return clonadorPersona;
	}

	public void setClonadorPersona(String clonadorPersona) {
		this.clonadorPersona = clonadorPersona;
	}

	public Clonador(String clonadorPersona) {
		super();
		this.clonadorPersona = clonadorPersona;
	}

	@Override
	public String toString() {
		return "[" + clonadorPersona + "]";
	}
	
}
