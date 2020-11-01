package juegoTrivial;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class JuegoTrivial {

	public static void main(String[] args) {
		
		
		int suma = 0;
		int[] array = new int [10]; //Creamos array de 10 para recoger todas las preguntas
		
		System.out.println("�Listo para poner a prueba tus conocimientos hist�ricos?");
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

		
		
		
		System.out.println("Antes de que demuestres que eres un cerebrito, d�jame que te diga las reglas b�sicas."
				+ "\nEl juego consta de 10 preguntas, por cada acierto sumar�s 10 puntos, pero �CUIDADO! "
				+ "\ncada error te costar� la friolera de 10 puntos, as� que piensa bien antes de responder." 
				+ "\nAl finalizar podr�s ver tu contador total.");
		
		//Empezamos con la pregunta 1
		String str = JOptionPane.showInputDialog("1. �Cu�nto dur� la Guerra de los 100 a�os?"
				+ "\n1 - 106 a�os."
				+ "\n2 - 116 a�os."
				+ "\n3 - 100 a�os."
				+ "\n4 - 102 a�os.");
		array[0] = Integer.parseInt(str); //Colocamos el valor en la posici�n 0 del array
		
		switch (array[0]) { //Usamos switch para mostrar las diferentes opciones
		 
			case 1:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;
			break;
			
			case 2:
				System.out.println("\n�Respuesta correcta!"
						+ " �+10 pts! ");
				suma = suma + 10;
			break;
			
			case 3:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;
			break;
			
			case 4:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;
			break;
				
				
		}
		//Pregunta 2
		str = JOptionPane.showInputDialog("2. �Qu� l�der tribal luch� contra la ocupaci�n romana de Gran Breta�a (Britania)?"
				+ "\n1 - T�cito."
				+ "\n2 - Prasutagus."
				+ "\n3 - Boudica."
				+ "\n4 - Ariovistus.");
		array[1] = Integer.parseInt(str);
		
		switch (array[1]) {
		 
			case 1:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;
			break;
			
			case 2:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;				
			break;
			
			case 3:
				System.out.println("\n�Respuesta correcta!"
						+ " �+10 pts! ");
				suma = suma + 10;
			break;
			
			case 4:
				System.out.println("\nRespuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;
			break;
	}
	 System.out.println("\nTu puntuaci�n final es..."
	 		+ "\n..."
	 		+ "\nredoble de tambores..."
	 		+ " �"+ suma +"!");
	}	
}
