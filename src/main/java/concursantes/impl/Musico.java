package concursantes.impl;

import concursantes.Concursante;
import concursantes.Instrumento;
import exceptions.EjecucionException;

public class Musico implements Concursante {
	
	private String cancion;
	private Instrumento instrumento;
	
	public Musico() { }

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public void ejecutar() throws EjecucionException {
		System.out.println("Interpretando: " + cancion);
		this.instrumento.tocar();
	}

}
