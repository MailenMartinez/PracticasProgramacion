package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio10 {
	public static void main (String[] Args) {
		int numero=0;
		int numero2=0;
		
		
		BufferedReader entrada= new BufferedReader (new InputStreamReader ( System.in));
		try {
			System.out.println("Ingrese un entero del 1 al 10");
			numero= Integer.valueOf(entrada.readLine());
			if ((numero>= 1)&&(numero<=9)) {
				System.out.println("Ingrese otro numero del 1 al 10");
				numero2= Integer.valueOf(entrada.readLine());
				while ((numero2>=1)&&(numero2<=9)) {
					int suma = (numero + numero2);
					System.out.println("La suma de los numero es" + suma);
					System.out.println("Ingrese otro numero del 1 al 10");
					numero2= Integer.valueOf(entrada.readLine());
					numero=suma;
				
				}
			}
			
		}
		catch (Exception exc) {
			System.out.println(" hubo un error" +(exc));
		}
		
	}

}
