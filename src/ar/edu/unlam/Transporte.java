package ar.edu.unlam;


public abstract class Transporte {

	private Chofer chofer;
	private Pasajero pasajero;
	private Integer kilometros;
	
	public Transporte(Chofer chofer, Pasajero pasajero) {
		this.chofer = chofer;
		this.pasajero = pasajero;
		
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Integer getKilometros() {
		return kilometros;
	}

	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}
	
	
	
	
	
}
