package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un programa que mientras el usuario ingrese un
//caracter letra minúscula, acumule la cantidad de vocales que
//ingresó. Finalmente muestre por pantalla dicha cantidad.

public class Ejercicio11 {
    public static void main(String[] args) {
        
        char letra;
        int contador=0;

        BufferedReader entrada= new BufferedReader(new InputStreamReader (System.in));

        try{
            System.out.println("Ingrese una letra minuscula");
            letra= entrada.readLine().charAt (0);
            while ((letra>='a')&&(letra<='z')){
                if ((letra=='a') || (letra=='e')  ||  (letra=='i')  || (letra=='o') || (letra=='u')){
                    contador++;
                }  
                System.out.println("Ingrese otra letra minuscula, cualquier otro caracter para salir: ");
                letra=entrada.readLine().charAt (0);
            }    
            System.out.println("La cantidad de vocales ingresadas fue: " + contador);        
        }
        catch(Exception exc){
            System.out.println(exc);
        } 

    }
}
