package ar.edu.unlam;

public abstract class Persona {

	private Integer edad;
	private String nombre;
	private String apellido;
	private Integer dni;
	private boolean esChofer;
	
	
	public Persona(Integer edad, String nombre, String apellido, Integer dni, boolean esChofer) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.esChofer = esChofer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public boolean isEsChofer() {
		return esChofer;
	}
	public void setEsChofer(boolean esChofer) {
		this.esChofer = esChofer;
	}
	
	
	
}
