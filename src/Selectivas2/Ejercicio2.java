package Selectivas2;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
public class Ejercicio2{
	public static void main (String []Args) {
		int mes=0;
	
		try{
			BufferedReader entrada= new BufferedReader (new InputStreamReader (System.in) );
			System.out.println ("Ingrese numero del mes");
			mes= Integer.valueOf(entrada.readLine());
		
				switch(mes){
				case 4: case 6: case 9: case 11: System.out.println ("El mes tiene 30 dias"); break;
				case 2:{
					int anio= 0;
					System.out.println("Ingrese el año");
					anio= Integer.valueOf (entrada.readLine());
					if ((anio%4==0)&&((anio%100!=0)||(anio%400==0))) {
					System.out.println ("El mes tiene 29 dias");
					
					}
					else {
						System.out.println ("El mes tiene 28 dias");break;
					}
				}
			 	default: System.out.println("El mes tiene 31 dias");
				}
		}
		catch (Exception exc) {
			System.out.println ( exc);
		}
	}
}
