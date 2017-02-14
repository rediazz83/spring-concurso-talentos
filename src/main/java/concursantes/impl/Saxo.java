package concursantes.impl;

import concursantes.Instrumento;

public class Saxo implements Instrumento {

	@Override
	public void tocar() {
		System.out.println("Tocando el saxo...");
	}

}
