package Selectivas2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que solicite una hora del día (valor entero de
//la hora solamente) y resuelva en cada caso:
//Si la hora está entre las 6 y las 11, pida un carácter letra
//minúscula y si es vocal imprima por la consola la cantidad de
//vocales que tiene la palabra que corresponde con la hora.
//Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
//cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
//tiene 2 consonantes.

public class Ejercicio5 {
	public static void main (String []Args) {
		int hora=0;
		
		try {
			BufferedReader entrada= new BufferedReader (new InputStreamReader (System.in) );
			System.out.println ("Ingrese hora del dia");
			hora= Integer.valueOf(entrada.readLine());
			
				if ((hora>=0)&&(hora<=5)){
					int temperatura=0;
					System.out.println("Ingrese la temperatura");
					temperatura= Integer.valueOf(entrada.readLine());
						if (temperatura<20) {
							System.out.println("Encender la calefaccion");
						}
						else if ((temperatura>=20)&&(temperatura<=25)) {
							System.out.println("Calefaccion encendida, no abra las ventanas");
						}
						else {
							System.out.println("Apagar calefaccion");
						}
				}
				else if ((hora>=6)&&(hora<=11)){
					char letra;
					System.out.println("Ingrese una letra minuscula");
					letra = entrada.readLine().charAt(0);
					
					if ((letra=='a')||(letra=='e') ||(letra=='i') ||(letra=='o') ||(letra=='u')) {
						
				}
			}
		catch (Exception exc) {
			System.out.println("Hubo un error" + (exc));
		}
	}
}
