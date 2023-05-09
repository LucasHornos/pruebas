package ar.edu.unlam;

import java.util.ArrayList;

public class Auto extends Transporte{

	private ArrayList<Pasajero> pasajeros;
	
	public Auto(Chofer chofer, Pasajero pasajero) {
		super(chofer, pasajero);
		this.pasajeros = new ArrayList<>();
	}

	public void agregarPasajeros(Pasajero pasajero) {
		Integer cantidadAsientos = 3;
		Integer cantidadDePasajeron = pasajeros.size();
		
		if (cantidadDePasajeron < cantidadAsientos) {
			pasajeros.add(pasajero);
		} else {
			System.out.println("el auto ta lleno");
		}
}
}
