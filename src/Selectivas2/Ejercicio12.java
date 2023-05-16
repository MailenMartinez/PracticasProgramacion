package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// Escribir un programa que mientras el usuario ingrese un
// carácter letra minúscula, se quede con la menor y la mayor letra
// ingresada. Finalmente muestre por pantalla dichas letras.
public class Ejercicio12 {
    public static void main(String[] args){
        char letraIngresada= 'a';
        char letraMenor= 'z';
        char  letraMayor= 'a';

        BufferedReader entrada= new BufferedReader(new InputStreamReader (System.in));

        try{
            while((letraIngresada>= 'a')&&(letraIngresada<= 'z')){
                System.out.println("Ingrese una letra minuscula: ");
                letraIngresada=entrada.readLine().charAt (0);
                if ((letraIngresada<='z')&&(letraIngresada>='a')){
                    if(letraIngresada<letraMenor){
                        letraMenor=letraIngresada;
                    }
                    if(letraIngresada>letraMayor){
                        letraMayor=letraIngresada;
                    }
                }

            }
            System.out.println("La menor letra ingresada fue " + letraMenor + " y la mayor fue " + letraMayor);
        }
        catch(Exception exc){
            System.out.println(exc);
        } 
    }


    
}
