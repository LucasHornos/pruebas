package zzParcial;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.Auto;
import ar.edu.unlam.Autobus;
import ar.edu.unlam.Chofer;
import ar.edu.unlam.Motocicleta;
import ar.edu.unlam.Pasajero;
import ar.edu.unlam.Persona;

public class empresaTransportesTest {

	@Test
	public void queSePuedaCrearUnaMotocicleta() {
		
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
		Chofer chofer;
		Motocicleta motocicleta;
		
		
		pasajero = new Pasajero(edad, nombre, apellido, dni, !esChofer);
		chofer = new Chofer(edadChofer, nombreChofer, apellidoChofer, dniChofer, esChofer);
		
		motocicleta= new Motocicleta(chofer, pasajero);
		
		assertNotNull(motocicleta);
	}
	
	@Test
	public void queSePuedaCrearUnAutobus() {
		
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
		
		assertNotNull(autobus);
	}
	
	@Test
	public void queSePuedaCrearUnAuto() {
		
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
		
		assertNotNull(auto);
	}
	

}
