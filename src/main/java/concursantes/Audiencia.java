package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("publico")
public class Audiencia {
	
	public void monitorearShow(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("El show está por comenzar!! Favor de tomar asiento... ");
			System.out.println("... tengan la amabilidad de apagar sus celulares");
			
			long horaInicio = System.currentTimeMillis();		
			
			joinpoint.proceed();
			Thread.sleep(1000);
			
			long horaTermino = System.currentTimeMillis();
			
			System.out.println("BRAVO!!! clap! clap! clap!");
			System.out.println("(duracion del show: " + (horaTermino - horaInicio) + ")");
		} catch (Throwable t) {
			System.out.println("BUUUUUUU!!!! Que devuelvan el dinero!! Esto es un robo");
		}
	}
	
}
