package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio10 {
	public static void main (String[] Args) {

		int numeroIngresado;
		int suma = 0;
		BufferedReader entrada= new BufferedReader(new InputStreamReader (System.in));

		try{
			System.out.print("Ingresa un número entre 1 y 10 inclusive: ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
		
				while (numeroIngresado >= 1 && numeroIngresado <= 10) {
					suma += numeroIngresado;
					System.out.print("Ingresa otro número entre 1 y 10 inclusive, o un número fuera del rango para finalizar: ");
					numeroIngresado =Integer.valueOf(entrada.readLine());
				}
		
				System.out.println("La suma de los números ingresados es: " + suma);
		}
		catch(Exception exc){
            System.out.println(exc);
        } 
		
	}
}
		
	


