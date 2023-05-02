package Selectivas2;
import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class Ejercicio3 {
	public static void main (String []Args) {
		double numero =0;
		try {
			BufferedReader entrada= new BufferedReader (new InputStreamReader (System.in) );
			System.out.println ("Ingrese un numero mayor a 50");
			numero= Double.valueOf(entrada.readLine());
			if ((numero>50)&&(numero%2==0)&&(numero%3==0)){
				System.out.println("El numero ingresado es "+ numero);
			}
			else{
				System.out.println("El numero ingresado no es valido");
			}
		}
		catch (Exception exc){
			System.out.println("Hubo un error"+ exc);
		}
	}
}
