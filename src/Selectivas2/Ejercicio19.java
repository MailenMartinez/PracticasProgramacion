package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio19 {
    public static void main (String[]args) {

        int mes=1;
        boolean verificar=true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese numero de mes, 0 para salir");

        try{
            while(verificar==true){
                mes= Integer.valueOf(entrada.readLine());
                if(mes==0){
                    System.out.println("Se cierra el programa");
                    verificar=false;
                }else{
                    if((mes>=1)&&(mes<=12)){
                        if(mes==2){
                            System.out.println("Ingrese el anio , del 2000 al 2019");
                            int anio=Integer.valueOf(entrada.readLine());
                            if((anio>=2000)&&(anio<=2019)){
                                if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                                    System.out.println("El mes " + mes + " del anio " + anio +  " tiene 28 dias");
                                    System.out.println("Ingrese otro numero, 0 para salir");
                                }else{
                                    System.out.println("El mes " + mes + " del anio " + anio +  " tiene 29 dias");
                                    System.out.println("Ingrese otro numero, 0 para salir");
                                }
                            }else {
                                System.out.println("Anio incorrecto, se cierra el programa");
                                verificar=false;
                            }    
                        }else if((mes==4)||(mes==6)||(mes==9)){
                            System.out.println("El mes " + mes + " tiene 30 dias");
                            System.out.println("Ingrese otro numero, 0 para salir");
                        }
                        else{
                            System.out.println("El mes " + mes + " tiene 31 dias");
                            System.out.println("Ingrese otro numero, 0 para salir");
                        }
                    }else{
                        System.out.println("mes incorrecto, ingrese un numero del 1 al 12");
                    }
                }
            }
        }catch (Exception exc){
            System.out.println("Hubo un error" +  exc);
        }
    }

    
}
