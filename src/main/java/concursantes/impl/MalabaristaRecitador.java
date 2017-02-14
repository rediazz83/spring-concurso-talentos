package concursantes.impl;

import concursantes.Poema;
import exceptions.EjecucionException;

public class MalabaristaRecitador extends Malabarista {

	private Poema poema;
	
	public MalabaristaRecitador(Poema poema) {
		super();
		this.poema = poema;
	}

	public MalabaristaRecitador(int pelotas, Poema poema) {
		super(pelotas);
		this.poema = poema;
	}
	
	@Override
	public void ejecutar() throws EjecucionException {
		super.ejecutar();
		
		System.out.println("Mientras recita... ");
		
		this.poema.recitar();
		
		System.out.println("Fin del acto");

	}

}
