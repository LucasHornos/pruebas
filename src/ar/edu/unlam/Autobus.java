package ar.edu.unlam;

import java.util.LinkedHashSet;

public class Autobus extends Transporte{

	private LinkedHashSet<Pasajero> pasajeros;
	
	public Autobus(Chofer chofer, Pasajero pasajero) {
		super(chofer, pasajero);
		this.pasajeros = new LinkedHashSet<>();
	}

	public void agregarPasajeros(Pasajero pasajero) {
			Integer cantidadAsientos = 20;
			Integer cantidadDePasajeron = pasajeros.size();
			
			if (cantidadDePasajeron < cantidadAsientos) {
				pasajeros.add(pasajero);
			} else {
				System.out.println("el bondi ta lleno");
			}
	}
	
	public Integer cantidadPasajeros() {
		Integer cantidadPasajeros = pasajeros.size();
		return cantidadPasajeros;
	}
}
