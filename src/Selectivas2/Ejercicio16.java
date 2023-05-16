package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio16 {
    public static void main (String []args){

        int maxCount = 0; // Variable para almacenar la mayor cantidad de 'a' seguidas
        int count = 0; // Variable para contar la cantidad de 'a' seguidas actual

        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresa 15 caracteres uno por uno:");
            
              for (int i = 1; i <= 15; i++) {
                  System.out.print("Caracter " + (i) + ": ");
                  char ingresado = entrada.readLine().charAt(0);
                  if (ingresado == 'a'){

                    count++;
                        if (count > maxCount){
                          maxCount = count;
                        }
                    }
                    else {
                      count = 0; // Reiniciar el contador si el caracter actual no es 'a'
                    }
              }
                System.out.println("La mayor cantidad de 'a' seguidas ingresadas es: " + maxCount);
        }
        catch (Exception exc){
            System.out.println ("Hubo un error" + (exc));
        }  
    }
    
}
