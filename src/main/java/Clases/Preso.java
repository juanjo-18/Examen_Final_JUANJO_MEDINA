package Clases;

import Herencia.ObjetoConAtributos;

public class Preso extends ObjetoConAtributos{
	private String mote;
	private byte peligrosidad;
	private Carcelero carcelero;
	
	public Preso(String dni, String nombre, String apellidos, String mote, byte peligrosidad, Carcelero carcelero) {
		super(dni, nombre, apellidos);
		this.mote = mote;
		this.peligrosidad = peligrosidad;
		this.carcelero = carcelero;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public byte getPeligrosidad() {
		return peligrosidad;
	}

	public void setPeligrosidad(byte peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	public Carcelero getCarcelero() {
		return carcelero;
	}

	public void setCarcelero(Carcelero carcelero) {
		this.carcelero = carcelero;
	}
	
	
	
	    
}
