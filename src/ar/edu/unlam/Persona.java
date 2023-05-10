package ar.edu.unlam;


public class Persona {
	private String nombre;
	private String apellido;
	private Integer dni;
	private String email;
	private String telefono;
//	private boolean esInstructor; ?
	



public Persona() {
	
}



public Persona(String nombre, String apellido, Integer dni, String email, String telefono) {
	this.apellido = apellido;
	this.dni = dni;
	this.email = email;
	this.telefono = telefono;
}


public void largoTelefono() {
	if (telefono.length()<10) {
		System.out.println("Ta enano tu telefono");
	}
	
}

}
