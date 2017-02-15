package concursantes.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import concursantes.Adivinador;

@Component
@Aspect
public class Mago implements Adivinador {

	private String pensamientos;

	@Pointcut("execution(* concursantes.Pensador.pensarEnAlgo(String)) && args(pensamientos)")
	public void pensar(String pensamientos) { }

	@Before("pensar(pensamientos)")
	public void interceptarPensamientos(String pensamientos) {
		System.out.println("Magia... ");
		System.out.println("El voluntario estaba pensando que: ".concat(pensamientos));
		
		this.pensamientos = pensamientos;
	}

	@Override
	public String getPensamientos() {
		return this.pensamientos;
	}

}
