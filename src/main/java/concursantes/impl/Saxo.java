package concursantes.impl;

import org.springframework.stereotype.Component;

import concursantes.Instrumento;

@Component
public class Saxo implements Instrumento {

	@Override
	public void tocar() {
		System.out.println("Tocando el saxo...");
	}

}
