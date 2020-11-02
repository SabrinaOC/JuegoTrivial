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
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int suma = 0;
		int respuesta;

		System.out.println("�Listo para poner a prueba tus conocimientos hist�ricos?");
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

		System.out.println("Antes de que demuestres que eres un cerebrito, d�jame que te diga las reglas b�sicas."
				+ "\nEl juego consta de 10 preguntas, por cada acierto sumar�s 10 puntos, pero �CUIDADO! "
				+ "\ncada error te costar� la friolera de 10 puntos, as� que piensa bien antes de responder."
				+ "\nAl finalizar podr�s ver tu contador total.");

		String str = JOptionPane.showInputDialog("�Cu�nto dur� la Guerra de los 100 a�os?" + "\n1 - 106 a�os"
				+ "\n2 - 116 a�os" + "\n3 - 100 a�os." + "\n4 - 102 a�os.");
		respuesta = Integer.parseInt(str); // Guardamos elecci�n en la variable respuesta

		switch (respuesta) { //Usamos un switch para poder avanzar en el juego tras seleccionar respuesta

		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa guerra de los Cien A�os fue un conflicto armado entre los reinos de Francia e Inglaterra que dur� 116 a�os.");
			suma = suma - 5;
			break;

		case 2:
			System.out.println("\n�Respuesta correcta!" + " �+10 pts!"
					+ "\nLa guerra de los Cien A�os fue un conflicto armado entre los reinos de Francia e Inglaterra que dur� 116 a�os.");
			suma = suma + 10;
			break;

		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa guerra de los Cien A�os fue un conflicto armado entre los reinos de Francia e Inglaterra que dur� 116 a�os.");
			suma = suma - 5;
			break;

		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa guerra de los Cien A�os fue un conflicto armado entre los reinos de Francia e Inglaterra que dur� 116 a�os.");
			suma = suma - 5;
			break;

		}
		// Pregunta 2. De aqu� en adelante usaremos siempre la misma estructura para presentar opciones y que siga el juego
		str = JOptionPane.showInputDialog("2. �Qu� l�der tribal luch� contra la ocupaci�n romana de Gran Breta�a (Britania)?"
						+ "\n1 - T�cito." + "\n2 - Prasutagus." + "\n3 - Boudica." + "\n4 - Ariovistus.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {

		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nBoudica, reina guerrera de los icenos, llev� a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupaci�n romana, entre los a�os 60 y 61 d.C., durante el reinado del emperador Ner�n. "
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma - 5;
			break;

		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nBoudica, reina guerrera de los icenos, llev� a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupaci�n romana, entre los a�os 60 y 61 d.C., durante el reinado del emperador Ner�n."
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma - 5;
			break;

		case 3:
			System.out.println("\n�Respuesta correcta!" + " �+10 pts! "
					+ "\nBoudica, reina guerrera de los icenos, llev� a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupaci�n romana, entre los a�os 60 y 61 d.C., durante el reinado del emperador Ner�n."
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma + 10;
			break;

		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nBoudica, reina guerrera de los icenos, llev� a cabo el mayor levantamiento en Britania"
					+ "\ncontra la ocupaci�n romana, entre los a�os 60 y 61 d.C., durante el reinado del emperador Ner�n."
					+ "\nSu nombre significaba 'victoria'.");
			suma = suma - 5;
			break;
		}
		//Pregunta 3
		str = JOptionPane.showInputDialog("3. �Qu� emperador romano legaliz� el cristianismo y puso fin a la persecusi�n de los cristianos?"
						+ "\n1 - Ner�n." + "\n2 - Adriano." + "\n3 - Trajano." + "\n4 - Constantino.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nAl emperador Constantino tambi�n se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad pr�spera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio P�o y Marco Aurelio), pues durante su reinado el Imperio alcanz� su m�xima expansi�n");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nAl emperador Constantino tambi�n se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad pr�spera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio P�o y Marco Aurelio), pues durante su reinado el Imperio alcanz� su m�xima expansi�n");
			suma = suma - 5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nAl emperador Constantino tambi�n se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad pr�spera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio P�o y Marco Aurelio), pues durante su reinado el Imperio alcanz� su m�xima expansi�n");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta correcta!" + " �+10 pts!"
					+ "\nAl emperador Constantino tambi�n se le atribuye haber hecho de la antigua Bizancio, ahora Estambul, una ciudad pr�spera."
					+ "\nNo forma parte de los Cinco Emperadores Buenos del Imperio Romano (que fueron Adriano, Trajano, Nerva,"
					+ "\nAntonio P�o y Marco Aurelio), pues durante su reinado el Imperio alcanz� su m�xima expansi�n");
			suma = suma + 10;
			break;
		}

		//Pregunta 4
		str = JOptionPane.showInputDialog("4. �Cu�ntas personas murieron durante el Gran Incendio de Londres de 1666, seg�n los registros?"
				+ "\n1 - 6." + "\n2 - 60." + "\n3 - 600." + "\n4 - 6 000.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta correcta!" + " �+10 pts!"
					+ "\nEsta cat�strofe provoc� la destrucci�n de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruy� el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma +10;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nEsta cat�strofe provoc� la destrucci�n de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruy� el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma -5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nEsta cat�strofe provoc� la destrucci�n de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruy� el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma -5;
			break;
		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nEsta cat�strofe provoc� la destrucci�n de parte de la ciudad de Londres desde el 2 hasta el 5 de septiembre de 1666."
					+ "\nEl fuego destruy� el centro de la ciudad medieval dentro de la vieja muralla romana de Londres."
					+ "\nLos registros apenas hablan de 6 personas fallecidas en el incendio, pero hay que dejar constancia de que las muertes"
					+ "\nde las personas con pocos posibles o de clase media no fueron registradas."
					+ "\nLa cifra real fue con toda probabilidad muy superior.");
			suma = suma -5;
			break;
		}
		//Pregunta 5
		str = JOptionPane.showInputDialog("5. �Cu�l es el nombre de la famosa batalla donde Napole�n Bonaparte due derrotado?"
				+ "\n1 - Batalla de Stalingrado." + "\n2 - Battalla de Waterloo." + "\n3 - Batalla del �lamo." + "\n4 - Batalla de Hastings.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ej�rcito del Duque de Wellington venci� al de Napole�n, sentenciando a este �ltimo"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta correcta!" + " �+10 pts!"
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ej�rcito del Duque de Wellington venci� al de Napole�n, sentenciando a este �ltimo"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma + 10;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ej�rcito del Duque de Wellington venci� al de Napole�n, sentenciando a este �ltimo"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa batalla de Waterloo tuvo lugar el 18 de junio de 1815 en las proximidades de Waterloo."
					+ "\nEn ella, el ej�rcito del Duque de Wellington venci� al de Napole�n, sentenciando a este �ltimo"
					+ "\na toda una vida en el exilio en la isla de Santa Elena.");
			suma = suma - 5;
			break;
		}
		//Pregunta 6
		str = JOptionPane.showInputDialog("6. �En qu� a�o se disolvi� la Uni�n Sovi�tica?"
						+ "\n1 - En 1981." + "\n2 - En 1987." + "\n3 - En 1989." + "\n4 - En 1991.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa Uni�n Sovi�tica se disolvi� oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa Uni�n Sovi�tica se disolvi� oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma - 5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nLa Uni�n Sovi�tica se disolvi� oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta correcta!" + " �+10 pts!"
					+ "\nLa Uni�n Sovi�tica se disolvi� oficialmente el 26 de diciembre de 1991 tras la firma del Tratado de Belavezha.");
			suma = suma + 10;
			break;
				
				}
		//Pregunta 7
		str = JOptionPane.showInputDialog("7. �Qu� cient�fico es considerado el padre de la Bomba At�mica?"
								+ "\n1 - Jonas Salk." + "\n2 - Albert Einstein." + "\n3 - Robert Oppenheimer." + "\n4 - Le� Szil�rd.");
		respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba at�mica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logr� crear el explosivo murmur� �Yo soy la muerte, soy la destrucci�n�."
					+ "\nPor su parte, L�o Szil�rd solicit� (y se le otorg�) la patente de la bomba at�mica.");
			suma = suma -5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba at�mica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logr� crear el explosivo murmur� �Yo soy la muerte, soy la destrucci�n�."
					+ "\nPor su parte, L�o Szil�rd solicit� (y se le otorg�) la patente de la bomba at�mica.");
			suma = suma -5;
			break;
		case 3:
			System.out.println("\nRespuesta correcta!" + " �+10 pts!"
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba at�mica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logr� crear el explosivo murmur� �Yo soy la muerte, soy la destrucci�n�."
					+ "\nPor su parte, L�o Szil�rd solicit� (y se le otorg�) la patente de la bomba at�mica.");
			suma = suma +10;
			break;
		case 4:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nRobert Oppenheimer fue uno de los padres de la bomba at�mica, el director del Proyecto Manhattan."
					+ "\nSe dice que cuando logr� crear el explosivo murmur� �Yo soy la muerte, soy la destrucci�n�."
					+ "\nPor su parte, L�o Szil�rd solicit� (y se le otorg�) la patente de la bomba at�mica.");
			suma = suma -5;
			break;
			}
		//Pregunta 8
		str = JOptionPane.showInputDialog("8. �Con qu� nombre se conoce el esc�ndalo que oblig� al presidente Richard Nixon a dimitir?"
										+ "\n1 - Vietnam." + "\n2 - Powergate." + "\n3 - Nixon Process." + "\n4 - Watergate.");
			respuesta = Integer.parseInt(str); 

		switch (respuesta) {
		case 1:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nHasta el momento, sigue siendo el �nico presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl esc�ndalo Watergate, destapado por los j�venes Bob Woodward y Carl Bernstein, inspir� a muchos periodistas."
					+ "\nSu investigaci�n fue galardonada con un Premio Pulitzer.");
			suma = suma - 5;
			break;
		case 2:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nHasta el momento, sigue siendo el �nico presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl esc�ndalo Watergate, destapado por los j�venes Bob Woodward y Carl Bernstein, inspir� a muchos periodistas."
					+ "\nSu investigaci�n fue galardonada con un Premio Pulitzer.");
			suma = suma - 5;
			break;
		case 3:
			System.out.println("\nRespuesta incorrecta... " + " -5 pts  =�("
					+ "\nHasta el momento, sigue siendo el �nico presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl esc�ndalo Watergate, destapado por los j�venes Bob Woodward y Carl Bernstein, inspir� a muchos periodistas."
					+ "\nSu investigaci�n fue galardonada con un Premio Pulitzer.");
			suma = suma - 5;
			break;
		case 4:
			System.out.println("\nRespuesta correcta!" + " �+10 pts!"
					+ "\nHasta el momento, sigue siendo el �nico presidente de los Estados Unidos en renunciar a su cargo. "
					+ "\nEl esc�ndalo Watergate, destapado por los j�venes Bob Woodward y Carl Bernstein, inspir� a muchos periodistas."
					+ "\nSu investigaci�n fue galardonada con un Premio Pulitzer.");
			suma = suma + 10;
			break;
		}
		
		
		
		
		System.out.println(
				"\n" + "\nTu puntuaci�n final es..." + "\n..." + "\nredoble de tambores..." + " �" + suma + "!");

	}
}
