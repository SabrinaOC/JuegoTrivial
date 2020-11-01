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
		int[] array = new int[10];

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
		array[0] = Integer.parseInt(str);

		switch (array[0]) {

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
		// Pregunta 2
		str = JOptionPane
				.showInputDialog("2. �Qu� l�der tribal luch� contra la ocupaci�n romana de Gran Breta�a (Britania)?"
						+ "\n1 - T�cito." + "\n2 - Prasutagus." + "\n3 - Boudica." + "\n4 - Ariovistus.");
		array[1] = Integer.parseInt(str); // Guardamos elecci�n en �ndice 2 del array

		switch (array[1]) {

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

		str = JOptionPane.showInputDialog(
				"3. �Qu� emperador romano legaliz� el cristianismo y puso fin a la persecusi�n de los cristianos?"
						+ "\n1 - Ner�n." + "\n2 - Adriano." + "\n3 - Trajano." + "\n4 - Constantino.");
		array[2] = Integer.parseInt(str); // Guardamos elecci�n en �ndice 3 del array

		switch (array[2]) {
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
			suma = suma - 5;
			break;
		}

		System.out.println(
				"\n" + "\nTu puntuaci�n final es..." + "\n..." + "\nredoble de tambores..." + " �" + suma + "!");

	}
}
