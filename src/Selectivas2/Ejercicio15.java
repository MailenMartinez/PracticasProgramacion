package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio15 {
    public static void main (String []args){
        int numero=1;
        int contador=0;
        int suma=0;
        int mayor=1;
        int menor=9999;

        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));

        try{
            while (numero!=0){
                System.out.println("Ingrese un entero, 0 para salir: ");
                numero=Integer.valueOf(entrada.readLine());
                if(numero!=0){
                    contador++;
                    suma+=numero;
                    if(numero<menor){
                        menor=numero;
                    }
                    if(numero>mayor){
                        mayor=numero;
                    }
                }   
            }
            System.out.println("El promedio de numeros ingresados fue: " + (suma/contador) + " el numero mayor ingresado fue: " + mayor + " y el numero menor fue: " + menor);
        }
        catch (Exception exc){
            System.out.println ("Hubo un error" + (exc));
        }
    }

    
}
