package ar.edu.unlam;

public class Alumno extends Persona {
//Integer?
	private Integer asistencias;
	

	
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, Integer dni, String email,  String telefono,Integer asistencias) {
		super(nombre, apellido, dni, email, telefono);
		this.asistencias=asistencias;
	}

}
