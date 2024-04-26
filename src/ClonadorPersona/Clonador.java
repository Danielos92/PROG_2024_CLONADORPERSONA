package ClonadorPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Persona.persona;

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
	public List<persona> clonadorPersonas() {
		Vector<persona> personas = new Vector<persona>();
		
		return personas;
		
	}
	@Override
	public String toString() {
		return "[" + clonadorPersona + "]";
	}
	
}
