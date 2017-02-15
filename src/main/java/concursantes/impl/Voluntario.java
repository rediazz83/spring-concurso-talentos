package concursantes.impl;

import org.springframework.stereotype.Component;

import concursantes.Pensador;

@Component
public class Voluntario implements Pensador {

	private String pensamientos;

	@Override
	public void pensarEnAlgo(String pensamientos) {
		this.pensamientos = pensamientos;
	}

	public String getPensamientos() {
		return this.pensamientos;
	}

}
