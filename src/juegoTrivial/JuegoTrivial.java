package juegoTrivial;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class JuegoTrivial {

	public static void main(String[] args) {
		
		int cont = 0;
		int suma = 0;
		int num;
		
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
		
		String str = JOptionPane.showInputDialog("�Cu�nto dur� la Guerra de los 100 a�os?"
				+ "\n1 - 106 a�os"
				+ "\n2 - 116 a�os");
		num = Integer.parseInt(str);
		
		switch (num) {
		 
			case 1:
				System.out.println("Respuesta incorrecta... "
						+ " -5 pts  =�(");
				suma = suma - 5;
			break;
			
			case 2:
				System.out.println("�Respuesta correcta!"
						+ " �+10 pts! ");
				suma = suma + 10;
				
		}
		
		
	}
	
	
}
