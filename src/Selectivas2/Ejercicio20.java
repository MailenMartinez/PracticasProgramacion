package Selectivas2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio20 {
    public static void main(String[]args) {

        int numero=1;
        boolean verificar=true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero entero positivo , 0 para salir");

        try{
            while(verificar==true){
                numero=Integer.valueOf(entrada.readLine());
                if (numero==0){
                    System.out.println("Se cierra el programa");
                    verificar=false;
                }else if(numero<0){
                    System.out.println("Numero incorrecto, ingrese otro");
                }else{
                    System.out.println("Ingrese un caracter, a b o c");
                    boolean verificarCaracter=true;
                    while(verificarCaracter==true){
                        int caracter=entrada.readLine().charAt(0);
                        if(caracter=='a'){
                            System.out.println("Ingrese un texto libre");
                            String texto= entrada.readLine();
                            System.out.println("Su texto es: " + texto);
                            verificarCaracter=false;
                            System.out.println("Ingrese otro numero, 0 para salir");
                        }else if(caracter=='b'){
                            System.out.println("Ingrese 5 numeros positivos");
                            int num1=Integer.valueOf(entrada.readLine());
                            int num2=Integer.valueOf(entrada.readLine());
                            int num3=Integer.valueOf(entrada.readLine());
                            int num4=Integer.valueOf(entrada.readLine());
                            int num5=Integer.valueOf(entrada.readLine());
                            if((num1<num2)&&(num2<num3)&&(num3<num4)&&(num4<num5)){
                                System.out.println("Fueron ingresados de forma ascendente");
                                verificarCaracter=false;
                                System.out.println("Ingrese otro numero, 0 para salir");
                            }else{
                                System.out.println("No fueron ingresados de forma ascendente");
                                verificarCaracter=false;
                                System.out.println("Ingrese otro numero, 0 para salir");
                            }
                        }else if(caracter=='c'){
                            System.out.println("Ingrese 2 numeros negativos");
                            int numNeg1=Integer.valueOf(entrada.readLine());
                            int numNeg2=Integer.valueOf(entrada.readLine());
                            if((numNeg1<0)&&(numNeg2<0)){
                                System.out.println (Math.sqrt(numNeg1*numNeg2));
                                verificarCaracter=false;
                                System.out.println("Ingrese otro numero, 0 para salir");
                            }else{
                                System.out.println("Incorrecto. Ingrese otro numero o 0 para salir");
                                verificarCaracter=false;
                            }
                        }else{
                            System.out.println("Incorrecto. Ingrese otro caracter o 0 para salir");
                        
                        }
                    }
                }
            }
        }catch(Exception exc){
            System.out.println("Hubo un error" + (exc));
        }
    }
    
}
