package test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import consursantes.Concursante;
import consursantes.impl.Malabarista;

public class ConcursoTalentosTest {

	private static Log log = LogFactory.getLog(ConcursoTalentosTest.class);
	private ApplicationContext context;
	private Concursante malabarista;

	public static final int PELOTAS_ESPERADAS = 5;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext("spring-context.xml");
		malabarista = (Concursante) context.getBean("malabarista");
	}

	@Test
	public void malabaristaTest() {
		log.info("Inicio ejecucion malabarista");

		malabarista.ejecutar();

		assertEquals("Numero de pelotas no coincide.", PELOTAS_ESPERADAS, ((Malabarista) malabarista).getPelotas());

		log.info("Fin ejecucion malabarista");
	}

}
