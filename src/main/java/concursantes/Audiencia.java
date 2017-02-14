package concursantes;

import org.springframework.stereotype.Component;

@Component("publico")
public class Audiencia {
	public void sentarse() {
		System.out.println("El show está por comenzar!! Favor de tomar asiento... ");
	}

	public void apagarCelulares() {
		System.out.println("... tengan la amabilidad de apagar sus celulares");
	}

	public void aplaudir() {
		System.out.println("BRAVO!!! clap! clap! clap!");
	}
	
	public void devolucion() {
		System.out.println("BUUUUUUU!!!! Que devuelvan el dinero!! Esto es un robo");
	}
}
