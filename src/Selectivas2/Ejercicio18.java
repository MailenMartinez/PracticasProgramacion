package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio18 {
    public static void main (String[]args) {

        int numeroIng= 1;
        boolean verificar= true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Ingrese un numero, 0 para salir");

            while(verificar==true) {
                numeroIng=Integer.valueOf(entrada.readLine());
                if(numeroIng!=0){
                    System.out.println("Ingrese 2 numeros");
                    int num1=Integer.valueOf(entrada.readLine());
                    int num2=Integer.valueOf(entrada.readLine());
                    System.out.println("Resultado= " + (num1/num2));
                    System.out.println("Ingrese otro numero, 0 para salir");
                }else{
                    System.out.println("Salio del programa");
                    verificar=false;
                }

            }
        }catch (Exception exc){
            System.out.println ("Hubo un error" + exc);        }
        
    }
}
