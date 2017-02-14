package concursantes.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import concursantes.Concursante;
import concursantes.Instrumento;
import exceptions.EjecucionException;

@Component("jasonPiano")
public class Musico implements Concursante {
	
	@Value("Noche de Paz")
	private String cancion;
	
	@Autowired
	@Qualifier("piano")
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
