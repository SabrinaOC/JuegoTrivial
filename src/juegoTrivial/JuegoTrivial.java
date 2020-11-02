package juegoTrivial;

import javax.swing.JOptionPane;

/**
 * Juego trivial sobre historia, 10 preguntas
 * 
 * @author F541U
 *
 */

public class JuegoTrivial {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int suma = 0;
		int respuesta;

		System.out.println("¿Listo para poner a prueba tus conocimientos históricos?");
		System.out.println(" \\ __\r\n" + "--==/////////////[})))==*\r\n" + "                 / \\ '          ,|\r\n"
				+ "                    `\\`\\      //|                             ,|\r\n"
				+ "                      \\ `\\  //,/'                           -~ |\r\n"
				+ "   )             _-~~~\\  |/ / |'|                       _-~  / ,\r\n"
				+ "  ((            /' )   | \\ / /'/                    _-~   _/_-~|\r\n"
				+ " (((            ;  /`  ' )/ /''                 _ -~     _-~ ,/'\r\n"
				+ " ) ))           `~~\\   `\\\\/'/|'           __--~~__--\\ _-~  _/, \r\n"
				+ "((( ))            / ~~    \\ /~      __--~~  --~~  __/~  _-~ /\r\n"
				+ " ((\\~\\           |    )   | '      /        __--~~  \\-~~ _-~\r\n"
				+ "    `\\(\\    __--(   _/    |'\\     /     --~~   __--~' _-~ ~|\r\n"
				+ "     (  ((~~   __-~        \\~\\   /     ___---~~  ~~\\~~__--~ \r\n"
				+ "      ~~\\~~~~~~   `\\-~      \\~\\ /           __--~~~'~~/\r\n"
				+ "                   ;\\ __.-~  ~-/      ~~~~~__\\__---~~ _..--._\r\n"
				+ "                   ;;;;;;;;'  /      ---~~~/_.-----.-~  _.._ ~\\     \r\n"
				+ "                  ;;;;;;;'   /      ----~~/         `\\,~    `\\ \\        \r\n"
				+ "                  ;;;;'     (      ---~~/         `:::|       `\\\\.      \r\n"
				+ "                  |'  _      `----~~~~'      /      `:|        ()))),      \r\n"
				+ "            ______/\\/~    |                 /        /         (((((())  \r\n"
				+ "          /~;;.____/;;'  /          ___.---(   `;;;/             )))'`))\r\n"
				+ "         / //  _;______;'------~~~~~    |;;/\\    /                ((   ( \r\n"
				+ "        //  \\ \\                        /  |  \\;;,\\                 `   \r\n"
				+ "       (<_    \\ \\                    /',/-----'  _> \r\n"
				+ "        \\_|     \\\\_                 //~;~~~~~~~~~ \r\n"
				+ "                 \\_|               (,~~              \r\n"
				+ "                                    \\~\\\r\n" + "                                     ~~");

		System.out.println("Antes de que demuestres que eres un cerebrito, déjame que te diga las reglas básicas."
				+ "\nEl juego consta de 10 preguntas, por cada acierto sumarás 10 puntos, pero ¡CUIDADO! "
				+ "\ncada error te costará la friolera de 10 puntos, así que piensa bien antes de responder."
				+ "\nAl finalizar podrás ver tu contador total.");

		String str = JOptionPane.showInputDialog("¿Cuánto duró la Guerra de los 100 años?" + "\n1 - 106 años"
				+ "\n2 - 116 años" + "\n3 - 100 años." + "\n4 - 102 años.");
		respuesta = Integer.parseInt(str); // Guardamos elección en la variable respuesta

		switch (respuesta) { //Usamos un switch para poder avanzar en el juego tras seleccionar respuesta

		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa guerra de los Cien Años fue un conflicto armado entre los reinos de Francia e Inglaterra que duró 116 años.");
			suma = suma - 5;
			break;

		case 2:
			System.out.println("\n¡Respuesta correcta!" + " ¡+10 pts!"
					+ "\nLa guerra de los Cien Años fue un conflicto armado entre los reinos de Francia e Inglaterra que duró 116 años.");
			suma = suma + 10;
			break;

		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa guerra de los Cien Años fue un conflicto armado entre los reinos de Francia e Inglaterra que duró 116 años.");
			suma = suma - 5;
			break;

		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa guerra de los Cien Años fue un conflicto armado entre los reinos de Francia e Inglaterra que duró 116 años.");
			suma = suma - 5;
			break;

		}
		// Pregunta 2. De aquí en adelante usaremos siempre la misma estructura para presentar opciones y que siga el juego
		str = JOptionPane.showInputDialog("2. ¿Qué líder tribal luchó contra la ocupación romana de Gran Bretaña (Britania)?"
						+ "\n1 - Tácito." + "\n2 - Prasutagus." + "\n3 - Boudica." + "\n4 - Ariovistus.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {

		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nBoudica, reina guerrera de los icenos, llevó a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupación romana, entre los años 60 y 61 d.C., durante el reinado del emperador Nerón. "
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma - 5;
			break;

		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nBoudica, reina guerrera de los icenos, llevó a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupación romana, entre los años 60 y 61 d.C., durante el reinado del emperador Nerón."
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma - 5;
			break;

		case 3:
			System.out.println("\n¡Respuesta correcta!" + " ¡+10 pts! "
					+ "\nBoudica, reina guerrera de los icenos, llevó a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupación romana, entre los años 60 y 61 d.C., durante el reinado del emperador Nerón."
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma + 10;
			break;

		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nBoudica, reina guerrera de los icenos, llevó a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupación romana, entre los años 60 y 61 d.C., durante el reinado del emperador Nerón."
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma - 5;
			break;
		}
		//Pregunta 3
		str = JOptionPane.showInputDialog("3. ¿Qué emperador romano legalizó el cristianismo y puso fin a la persecusión de los cristianos?"
						+ "\n1 - Nerón." + "\n2 - Adriano." + "\n3 - Trajano." + "\n4 - Constantino.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nAl emperador Constantino también se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad próspera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio Pío y Marco Aurelio), pues durante su reinado el Imperio alcanzó su máxima expansión");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nAl emperador Constantino también se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad próspera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio Pío y Marco Aurelio), pues durante su reinado el Imperio alcanzó su máxima expansión");
			suma = suma - 5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nAl emperador Constantino también se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad próspera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio Pío y Marco Aurelio), pues durante su reinado el Imperio alcanzó su máxima expansión");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta correcta!" + " ¡+10 pts!"
					+ "\nAl emperador Constantino también se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad próspera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio Pío y Marco Aurelio), pues durante su reinado el Imperio alcanzó su máxima expansión");
			suma = suma + 10;
			break;
		}

		//Pregunta 4
		str = JOptionPane.showInputDialog("4. ¿Cuántas personas murieron durante el Gran Incendio de Londres de 1666, según los registros?"
				+ "\n1 - 6." + "\n2 - 60." + "\n3 - 600." + "\n4 - 6 000.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta correcta!" + " ¡+10 pts!"
					+ "\nEsta catástrofe provocó la destrucción de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruyó el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma +10;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nEsta catástrofe provocó la destrucción de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruyó el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma -5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nEsta catástrofe provocó la destrucción de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruyó el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma -5;
			break;
		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nEsta catástrofe provocó la destrucción de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruyó el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma -5;
			break;
		}
		//Pregunta 5
		str = JOptionPane.showInputDialog("5. ¿Cuál es el nombre de la famosa batalla donde Napoleón Bonaparte due derrotado?"
				+ "\n1 - Batalla de Stalingrado." + "\n2 - Battalla de Waterloo." + "\n3 - Batalla del Álamo." + "\n4 - Batalla de Hastings.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ejército del Duque de Wellington venció al de Napoleón, sentenciando a este último"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta correcta!" + " ¡+10 pts!"
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ejército del Duque de Wellington venció al de Napoleón, sentenciando a este último"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma + 10;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ejército del Duque de Wellington venció al de Napoleón, sentenciando a este último"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ejército del Duque de Wellington venció al de Napoleón, sentenciando a este último"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma - 5;
			break;
		}
		//Pregunta 6
		str = JOptionPane.showInputDialog("6. ¿En qué año se disolvió la Unión Soviética?"
						+ "\n1 - En 1981." + "\n2 - En 1987." + "\n3 - En 1989." + "\n4 - En 1991.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa Unión Soviética se disolvió oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa Unión Soviética se disolvió oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma - 5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nLa Unión Soviética se disolvió oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta correcta!" + " ¡+10 pts!"
					+ "\nLa Unión Soviética se disolvió oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma + 10;
			break;
				
				}
		//Pregunta 7
		str = JOptionPane.showInputDialog("7. ¿Qué científico es considerado el padre de la Bomba Atómica?"
								+ "\n1 - Jonas Salk." + "\n2 - Albert Einstein." + "\n3 - Robert Oppenheimer." + "\n4 - Leó Szilárd.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba atómica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logró crear el explosivo murmuró “Yo soy la muerte, soy la destrucción”."
					+ "\nPor su parte, Léo Szilárd solicitó (y se le otorgó) la patente de la bomba atómica.");
			suma = suma -5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba atómica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logró crear el explosivo murmuró “Yo soy la muerte, soy la destrucción”."
					+ "\nPor su parte, Léo Szilárd solicitó (y se le otorgó) la patente de la bomba atómica.");
			suma = suma -5;
			break;
		case 3:
			System.out.println("\nRespuesta correcta!" + " ¡+10 pts!"
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba atómica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logró crear el explosivo murmuró “Yo soy la muerte, soy la destrucción”."
					+ "\nPor su parte, Léo Szilárd solicitó (y se le otorgó) la patente de la bomba atómica.");
			suma = suma +10;
			break;
		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba atómica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logró crear el explosivo murmuró “Yo soy la muerte, soy la destrucción”."
					+ "\nPor su parte, Léo Szilárd solicitó (y se le otorgó) la patente de la bomba atómica.");
			suma = suma -5;
			break;
			}
		//Pregunta 8
		str = JOptionPane.showInputDialog("8. ¿Con qué nombre se conoce el escándalo que obligó al presidente Richard Nixon a dimitir?"
										+ "\n1 - Vietnam." + "\n2 - Powergate." + "\n3 - Nixon Process." + "\n4 - Watergate.");
			respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nHasta el momento, sigue siendo el único presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl escándalo Watergate, destapado por los jóvenes Bob Woodward y Carl Bernstein, inspiró a muchos periodistas."
					+ "\nSu investigación fue galardonada con un Premio Pulitzer.");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nHasta el momento, sigue siendo el único presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl escándalo Watergate, destapado por los jóvenes Bob Woodward y Carl Bernstein, inspiró a muchos periodistas."
					+ "\nSu investigación fue galardonada con un Premio Pulitzer.");
			suma = suma - 5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =´("
					+ "\nHasta el momento, sigue siendo el único presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl escándalo Watergate, destapado por los jóvenes Bob Woodward y Carl Bernstein, inspiró a muchos periodistas."
					+ "\nSu investigación fue galardonada con un Premio Pulitzer.");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta correcta!" + " ¡+10 pts!"
					+ "\nHasta el momento, sigue siendo el único presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl escándalo Watergate, destapado por los jóvenes Bob Woodward y Carl Bernstein, inspiró a muchos periodistas."
					+ "\nSu investigación fue galardonada con un Premio Pulitzer.");
			suma = suma + 10;
			break;
		}
		
		
		
		
		System.out.println(
				"\n" + "\nTu puntuación final es..." + "\n..." + "\nredoble de tambores..." + " ¡" + suma + "!");

	}
}
