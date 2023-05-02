package Selectivas2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa donde el usuario ingrese un número entre 0
//y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
//tiene 3 dígitos debe informar qué número es.
public class Ejercicio4 {
	public static void main (String []Args) {
		int numero =0;
		
		try {
			BufferedReader entrada= new BufferedReader (new InputStreamReader (System.in) );
			System.out.println ("Ingrese un numero entre 0 y 999");
			numero= Integer.valueOf(entrada.readLine());
			
			if ((numero >=0)&&(numero<=9)) {
				System.out.println("El numero " + numero + " tiene 1 digito");
			}
			else if ((numero>=10)&&(numero<=99)) {
			System.out.println("El numero " + numero +" tiene 2 digitos");
			}
			else if ((numero>=100)&&(numero<=999)) {
				System.out.println("El numero " + numero + " tiene 3 digitos");
			}
		}
		catch (Exception exc) {
			System.out.println ("Hubo un error " + exc);
			
		}
	}
	
}
