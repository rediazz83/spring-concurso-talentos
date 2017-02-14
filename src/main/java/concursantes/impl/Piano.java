package concursantes.impl;

import concursantes.Instrumento;

public class Piano implements Instrumento {

	@Override
	public void tocar() {
		System.out.println("Tocando el piano...");
	}

}
