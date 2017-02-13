package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import consursantes.Concursante;

public class PruebaConcursoTalento {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring-context.xml");
		Concursante malabarista = (Concursante) context.getBean("malabarista");
		malabarista.ejecutar();
	}

}
