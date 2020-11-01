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
		int[] array = new int[10];

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
		array[0] = Integer.parseInt(str);

		switch (array[0]) {

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
		// Pregunta 2
		str = JOptionPane
				.showInputDialog("2. ¿Qué líder tribal luchó contra la ocupación romana de Gran Bretaña (Britania)?"
						+ "\n1 - Tácito." + "\n2 - Prasutagus." + "\n3 - Boudica." + "\n4 - Ariovistus.");
		array[1] = Integer.parseInt(str); // Guardamos elección en índice 2 del array

		switch (array[1]) {

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

		str = JOptionPane.showInputDialog(
				"3. ¿Qué emperador romano legalizó el cristianismo y puso fin a la persecusión de los cristianos?"
						+ "\n1 - Nerón." + "\n2 - Adriano." + "\n3 - Trajano." + "\n4 - Constantino.");
		array[2] = Integer.parseInt(str); // Guardamos elección en índice 3 del array

		switch (array[2]) {
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
			suma = suma - 5;
			break;
		}

		System.out.println(
				"\n" + "\nTu puntuación final es..." + "\n..." + "\nredoble de tambores..." + " ¡" + suma + "!");

	}
}
