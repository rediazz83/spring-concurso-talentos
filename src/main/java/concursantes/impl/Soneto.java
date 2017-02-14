package concursantes.impl;

import org.springframework.stereotype.Component;

import concursantes.Poema;

@Component("poema")
public class Soneto implements Poema {

	@Override
	public void recitar() {
		String sonetoPasionSorJuana = "Este, que ves, engaño colorido, que del arte ostentando los primores,\n"
				+ "con falsos silogismos de colores es cauteloso engaño del sentido; \n"
				+ "éste, en quien la lisonja ha pretendido excusar de los años los horrores, \n"
				+ "y venciendo del tiempo los rigores triunfar de la vejez y del olvido, \n"
				+ "es un vano artificio del cuidado, es una flor al viento delicada, \n"
				+ "es un resguardo inútil para el hado, es una necia diligencia errada, \n"
				+ "es un afán caduco y, bien mirado, es cadáver, es polvo, es sombra, es nada. \n";

		System.out.println("\nSoneto: " + sonetoPasionSorJuana);
	}

}
