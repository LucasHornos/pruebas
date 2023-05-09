package zzParcial;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.Auto;
import ar.edu.unlam.Chofer;
import ar.edu.unlam.Pasajero;

public class autoTest {

	@Test
	public void queNoSePuedaAgregarMasDe3PasajerosAUnAuto() {
		
		Integer edad = 30;
		String nombre = "Ernesto";
		String apellido = "Messi";
		Integer dni = 123456789;
		
		
		Integer edadChofer = 40;
		String nombreChofer = "Jorge";
		String apellidoChofer= "Boca";
		Integer dniChofer = 987654321;
		boolean esChofer = true;
		
		Pasajero pasajero;
		Pasajero pasajero2;
		Pasajero pasajero3;
		Pasajero pasajero4;
		Chofer chofer;
		Auto auto;
		
		
		pasajero = new Pasajero(edad, nombre, apellido, dni, !esChofer);
		pasajero2 = new Pasajero(edad, nombreChofer, apellido, dni, !esChofer);
		pasajero3 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		pasajero4 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		
		chofer = new Chofer(edadChofer, nombreChofer, apellidoChofer, dniChofer, esChofer);
		
		auto= new Auto(chofer, pasajero);
		
		auto.agregarPasajeros(pasajero);
		auto.agregarPasajeros(pasajero2);
		auto.agregarPasajeros(pasajero3);
		auto.agregarPasajeros(pasajero4);
		
		assertNotNull(auto);
	}
	
	@Test
	public void queSePuedaAgregarPasajerosAUnAuto() {
		
		Integer edad = 30;
		String nombre = "Ernesto";
		String apellido = "Messi";
		Integer dni = 123456789;
		
		
		Integer edadChofer = 40;
		String nombreChofer = "Jorge";
		String apellidoChofer= "Boca";
		Integer dniChofer = 987654321;
		boolean esChofer = true;
		
		Pasajero pasajero;
		Pasajero pasajero2;
		Pasajero pasajero3;
		Pasajero pasajero4;
		Chofer chofer;
		Auto auto;
		
		
		pasajero = new Pasajero(edad, nombre, apellido, dni, !esChofer);
		pasajero2 = new Pasajero(edad, nombreChofer, apellido, dni, !esChofer);
		pasajero3 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		pasajero4 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		
		chofer = new Chofer(edadChofer, nombreChofer, apellidoChofer, dniChofer, esChofer);
		
		auto= new Auto(chofer, pasajero);
		
		auto.agregarPasajeros(pasajero);
		auto.agregarPasajeros(pasajero2);
		auto.agregarPasajeros(pasajero3);
		
		assertNotNull(auto);
	}
}
