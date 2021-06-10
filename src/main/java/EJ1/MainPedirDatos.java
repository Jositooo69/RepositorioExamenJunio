package EJ1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jdk.internal.net.http.common.Log;




/*
 * @author Jose Collado
 * 
 */

public class MainPedirDatos {
	
	
	
	static Logger Log = LogManager.getLogger(MainPedirDatos.class);

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			Nodo nodo = new Nodo(valor);
			
			
			if(valor!=0) {
				lista.add(nodo);
				
				if(valor%2==0) {
					
					Log.debug("El usuario ha decidido entrar un numero par a las ");
					
					
				}
				else {
					Log.info("Se introduce un numero impar el dia ");
					
				}
				}
		}while(valor!=0);
	}
}
