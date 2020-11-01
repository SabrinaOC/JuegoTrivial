package juegoTrivial;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class JuegoTrivial {

	public static void main(String[] args) {
		
		int cont = 0;
		int suma = 0;
		int num;
		
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
		
		String str = JOptionPane.showInputDialog("¿Cuánto duró la Guerra de los 100 años?"
				+ "\n1 - 106 años"
				+ "\n2 - 116 años");
		num = Integer.parseInt(str);
		
		switch (num) {
		 
			case 1:
				System.out.println("Respuesta incorrecta... "
						+ " -5 pts  =´(");
				suma = suma - 5;
			break;
			
			case 2:
				System.out.println("¡Respuesta correcta!"
						+ " ¡+10 pts! ");
				suma = suma + 10;
				
		}
		
		
	}
	
	
}
