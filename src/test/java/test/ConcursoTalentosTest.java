package test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concursantes.Concursante;
import concursantes.impl.Malabarista;
import concursantes.impl.Musico;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class ConcursoTalentosTest {

	private static Log log = LogFactory.getLog(ConcursoTalentosTest.class);
	
	@Autowired
	@Qualifier("solei")
	private Concursante malabarista;
	
	@Autowired
	@Qualifier("soleiRecitador")
	private Concursante malabaristaRecitador;
	
	@Autowired
	@Qualifier("jasonPiano")
	private Concursante pianista;
	
	@Autowired
	@Qualifier("jasonSax")
	private Concursante saxofonista;

	public static final int PELOTAS_ESPERADAS = 5;
	public static final String CANCION_NOCHE_DE_PAZ = "Noche de Paz";
	public static final String CANCION_EQUINOX = "Equinox";

	@Test
	public void malabaristaTest() {
		log.info("Inicio ejecucion malabarista");

		malabarista.ejecutar();

		assertEquals("Numero de pelotas no coincide.", PELOTAS_ESPERADAS, ((Malabarista) malabarista).getPelotas());

		log.info("Fin ejecucion malabarista");
	}

	@Test
	public void malabaristaRecitadorTest() {
		log.info("Inicio ejecucion malabarista recitador");

		malabaristaRecitador.ejecutar();

		assertEquals("Numero de pelotas no coincide.", PELOTAS_ESPERADAS,
				((Malabarista) malabaristaRecitador).getPelotas());

		log.info("Fin ejecucion malabarista recitador");
	}

	@Test
	public void pianistaTest() {
		log.info("Inicio ejecucion pianista");

		pianista.ejecutar();

		assertEquals("El nombre de la cancion no coincide.", CANCION_NOCHE_DE_PAZ, ((Musico) pianista).getCancion());

		log.info("Fin ejecucion pianista");
	}

	@Test
	public void saxofonistaTest() {
		log.info("Inicio ejecucion saxofonista");

		saxofonista.ejecutar();

		assertEquals("El nombre de la cancion no coincide.", CANCION_EQUINOX, ((Musico) saxofonista).getCancion());

		log.info("Fin ejecucion saxofonista");
	}
}
