package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void main (String []Args){

        int numero=0;
        int contadorIng= 0;
        int contadorPar= 0;

        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));

        try{
            while ((numero>=0)&&(contadorIng<=10)){
                System.out.println("Ingrese un numero entero positivo: ");
                numero= Integer.valueOf(entrada.readLine());

                if (numero>0){
                    contadorIng++;
                    if (numero%2 ==0){
                        contadorPar++;
                    }
                }
            }
            System.out.println("La cantidad de numero pares ingresados fue de : " + contadorPar);
        }
        catch (Exception exc){
            System.out.println ("Hubo un error" + (exc));
        }
    }
    
}
