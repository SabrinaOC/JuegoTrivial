package juegoTrivial;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class JuegoTrivial {

	public static void main(String[] args) {
		
		
		int suma = 0;
		int[] array = new int [10]; //Creamos array de 10 para recoger todas las preguntas
		
		System.out.println("¿Listo para poner a prueba tus conocimientos históricos?");
		System.out.println(" \\ __\r\n"
				+ "--==/////////////[})))==*\r\n"
				+ "                 / \\ '          ,|\r\n"
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
				+ "                                    \\~\\\r\n"
				+ "                                     ~~");

		
		
		
		System.out.println("Antes de que demuestres que eres un cerebrito, déjame que te diga las reglas básicas."
				+ "\nEl juego consta de 10 preguntas, por cada acierto sumarás 10 puntos, pero ¡CUIDADO! "
				+ "\ncada error te costará la friolera de 10 puntos, así que piensa bien antes de responder." 
				+ "\nAl finalizar podrás ver tu contador total.");
		
		//Empezamos con la pregunta 1
		String str = JOptionPane.showInputDialog("1. ¿Cuánto duró la Guerra de los 100 años?"
				+ "\n1 - 106 años."
				+ "\n2 - 116 años."
				+ "\n3 - 100 años."
				+ "\n4 - 102 años.");
		array[0] = Integer.parseInt(str); //Colocamos el valor en la posición 0 del array
		
		switch (array[0]) { //Usamos switch para mostrar las diferentes opciones
		 
			case 1:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;
			break;
			
			case 2:
				System.out.println("\n¡Respuesta correcta!"
						+ " ¡+10 pts! ");
				suma = suma + 10;
			break;
			
			case 3:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;
			break;
			
			case 4:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;
			break;
				
				
		}
		//Pregunta 2
		str = JOptionPane.showInputDialog("2. ¿Qué líder tribal luchó contra la ocupación romana de Gran Bretaña (Britania)?"
				+ "\n1 - Tácito."
				+ "\n2 - Prasutagus."
				+ "\n3 - Boudica."
				+ "\n4 - Ariovistus.");
		array[1] = Integer.parseInt(str);
		
		switch (array[1]) {
		 
			case 1:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;
			break;
			
			case 2:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;				
			break;
			
			case 3:
				System.out.println("\n¡Respuesta correcta!"
						+ " ¡+10 pts! ");
				suma = suma + 10;
			break;
			
			case 4:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;
			break;
	}
	 System.out.println("\nTu puntuación final es..."
	 		+ "\n..."
	 		+ "\nredoble de tambores..."
	 		+ " ¡"+ suma +"!");
	}	
}
