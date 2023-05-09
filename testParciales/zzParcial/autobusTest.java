package zzParcial;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.Autobus;
import ar.edu.unlam.Chofer;
import ar.edu.unlam.Pasajero;

public class autobusTest {

	@Test
	public void queSePuedaAgregarPasajerosAUnAutobus() {
		
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
		Chofer chofer;
		Autobus autobus;
		
		
		pasajero = new Pasajero(edad, nombre, apellido, dni, !esChofer);
		pasajero2 = new Pasajero(edad, nombreChofer, apellido, dni, !esChofer);
		
		chofer = new Chofer(edadChofer, nombreChofer, apellidoChofer, dniChofer, esChofer);
		
		autobus= new Autobus(chofer, pasajero);
		
		autobus.agregarPasajeros(pasajero);
		autobus.agregarPasajeros(pasajero2);
		
		assertNotNull(autobus);
	}
	
	@Test
	public void queNoSePuedaAgregarMasDe20PasajerosAUnAutobus() {
		
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
		Chofer chofer;
		Autobus autobus;
		
		Integer cantidadMaximaDePasajeros = 20;
		Integer cantidadDePasajeros;
		
		pasajero = new Pasajero(edad, nombre, apellido, dni, !esChofer);
		pasajero2 = new Pasajero(edad, nombreChofer, apellido, dni, !esChofer);
		Pasajero pasajero3 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero4 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero5 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero6 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero7 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero8 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero9 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero10 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero11 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero12 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero13 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero14 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero15 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero16 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero17 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero18 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero19 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero20 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		Pasajero pasajero21 = new Pasajero(edad, nombre, apellidoChofer, dni, !esChofer);
		
		chofer = new Chofer(edadChofer, nombreChofer, apellidoChofer, dniChofer, esChofer);
		
		autobus= new Autobus(chofer, pasajero);
		
		autobus.agregarPasajeros(pasajero);
		autobus.agregarPasajeros(pasajero2);
		autobus.agregarPasajeros(pasajero3);
		autobus.agregarPasajeros(pasajero4);
		autobus.agregarPasajeros(pasajero5);
		autobus.agregarPasajeros(pasajero6);
		autobus.agregarPasajeros(pasajero7);
		autobus.agregarPasajeros(pasajero8);
		autobus.agregarPasajeros(pasajero9);
		autobus.agregarPasajeros(pasajero10);
		autobus.agregarPasajeros(pasajero11);
		autobus.agregarPasajeros(pasajero12);
		autobus.agregarPasajeros(pasajero13);
		autobus.agregarPasajeros(pasajero14);
		autobus.agregarPasajeros(pasajero15);
		autobus.agregarPasajeros(pasajero16);
		autobus.agregarPasajeros(pasajero17);
		autobus.agregarPasajeros(pasajero18);
		autobus.agregarPasajeros(pasajero19);
		autobus.agregarPasajeros(pasajero20);
		autobus.agregarPasajeros(pasajero21);
		
		
		cantidadDePasajeros = autobus.cantidadPasajeros();
		
		assertEquals(cantidadMaximaDePasajeros, cantidadDePasajeros);
	}
}
