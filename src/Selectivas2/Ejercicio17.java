package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio17 {
    public static void main(String[]args) {
        int ingresado = 0;
        boolean verificar = true;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese un numero  mayor a 1 y menor a 10, ingrese 0 para finalizar");
        try{
                while (verificar == true){
                    ingresado = Integer.valueOf(entrada.readLine());
                    if ((ingresado>1)&&(ingresado<10)){
                        System.out.println("Cuenta regresiva:");
                        for(int i=ingresado ; i>=0 ; i-- ){
                            System.out.println(i);
                        }
                        verificar = false;
                    }else if (ingresado==0){
                        System.out.println("Salio del programa");
                        verificar=false;
                    }else{
                        System.out.println("Valor fuera de rango, vuelva a ingresar un numero");
                    }
                }
        }
        catch(Exception exc){
                System.out.println("ocurrio algun arror"+exc);
        }
    }
}

