package ar.edu.unlam;

public class Pasajero extends Persona{

	public Pasajero(Integer edad, String nombre, String apellido, Integer dni, boolean esChofer) {
		super(edad, nombre, apellido, dni, esChofer);
	
		esChofer = false;
	}
	
	

}
