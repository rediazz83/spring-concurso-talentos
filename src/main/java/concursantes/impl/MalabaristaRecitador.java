package concursantes.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import concursantes.Poema;
import exceptions.EjecucionException;

@Component("soleiRecitador")
public class MalabaristaRecitador extends Malabarista {

	private Poema poema;
	
	public MalabaristaRecitador(Poema poema) {
		super();
		this.poema = poema;
	}

	@Autowired
	public MalabaristaRecitador(@Value("5") int pelotas, Poema poema) {
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
