package concursantes.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import concursantes.Concursante;
import exceptions.EjecucionException;

@Component("solei")
public class Malabarista implements Concursante {

	private int pelotas = 5;

	public Malabarista() {
	}

	@Autowired
	public Malabarista(@Value("5") int pelotas) {
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
