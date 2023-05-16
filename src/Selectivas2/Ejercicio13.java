package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio13 {
    public static void main (String []Args){

        char letra= 'a';
        int numero;
        final int MAX=10;

        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));

        try{
            while ((letra<='z')&&(letra>='a')){
                System.out.println("Ingrese una letra minuscula: ");
                letra= entrada.readLine().charAt(0);

                if((letra<='z')&&(letra>='a')){
                    System.out.println("Ingrese un numero del 1 al 5 inclusive: ");
                    numero=Integer.valueOf(entrada.readLine());

                    if((numero>=1)&&(numero<=5)){
                        for (int multiplicador=1; multiplicador <= MAX; multiplicador++){
                            System.out.println(numero+"*"+multiplicador+"="+(numero * multiplicador));
                        }
                    }
                }
            }
        }
        catch (Exception exc){
            System.out.println(exc);
        }
    }
    
}
