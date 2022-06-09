package Clases;

import Excepciones.ValorInvalidoPeligrosidadException;
import Herencia.ObjetoConAtributos;

public class Preso extends ObjetoConAtributos{
	private String mote;
	private byte peligrosidad;
	private Carcelero carcelero;
	
	public Preso(String dni, String nombre, String apellidos, String mote, byte peligrosidad, Carcelero carcelero) throws ValorInvalidoPeligrosidadException {
		super(dni, nombre, apellidos);
		if (this.peligrosidadValida(peligrosidad)==false) {
			throw new ValorInvalidoPeligrosidadException("La peligrosidad es incorrecta tiene que estar entre 1 y 10");
		}
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

	public boolean peligrosidadValida(byte peligrosidad) {
		if(peligrosidad<1 && peligrosidad>10) {
			return false;
		}else {
			return true;
		}
		 
	}
	public void setPeligrosidad(byte peligrosidad) throws ValorInvalidoPeligrosidadException {
		if (this.peligrosidadValida(peligrosidad)==false) {
			throw new ValorInvalidoPeligrosidadException("La peligrosidad es incorrecta tiene que estar entre 1 y 10");
		}
		this.peligrosidad = peligrosidad;
	}

	public Carcelero getCarcelero() {
		return carcelero;
	}

	public void setCarcelero(Carcelero carcelero) {
		this.carcelero = carcelero;
	}
	
	
	
	    
}
