package concursantes.impl;

import concursantes.Concursante;
import exceptions.EjecucionException;

public class Malabarista implements Concursante {

	private int pelotas = 5;

	public Malabarista() {
	}

	public Malabarista(int pelotas) {
		this.pelotas = pelotas;
	}
	
	public int getPelotas() {
		return this.pelotas;
	}
	
	public void setPelotas(int pelotas) {
		this.pelotas = pelotas;
	}

	@Override
	public void ejecutar() throws EjecucionException {
		System.out.println("Malabarismo con " + pelotas + " pelotas");
	}

}
