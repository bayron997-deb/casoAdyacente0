import java.util.InputMismatchException;
import java.util.Scanner;

public class casoAdyacente {
    public static Scanner teclado =new Scanner(System.in);

    public static double prodAdyacente(double[]numeros){
        double result=0;
        for (int i=0;i<numeros.length-1;++i){
            if (numeros[i]*numeros[i+1]>result) {
                result = numeros[i] * numeros[i + 1];
            }
        }
        return result;
    }
    public static void arreglo(){
        System.out.println("Ingrese cantidad de numeros a comparar: ");
        //el largo toma el valor de el metodo
        int largo = validarint();
        double  [] numeros=new double[largo];

        for (int i=0; i<numeros.length;++i){
            System.out.println("Ingrese un numero ");
            //cada numero se valida
            numeros[i]=validardouble();
        }
        double resultado=prodAdyacente(numeros);
        System.out.println("mayor: "+resultado);
    }

    public static int validarint(){
        boolean repetir = true;
        int a = 0;
        while(repetir){
            try{
                a = teclado.nextInt();
                if(a<2) {
                    a=2;
                }else if(a>20){
                    a=20;
                }
                repetir = false;
            } catch (InputMismatchException e){
                teclado.next(); // Limpia el Scanner
                System.out.println("Ingrese un largo valido");
                repetir = true;
            }
        }
        return a;
    }
    public static double  validardouble(){
        boolean repetir = true;
        double a = 0;
        while(repetir){
            try{
                a = teclado.nextDouble();
                if(a<-1000){
                    a=-1000;
                }else if (a>1000){
                    a=1000;
                }
                repetir = false;
            } catch (InputMismatchException e){
                teclado.next(); // Limpia el Scanner
                System.out.println("Ingrese un número (valido), por favor");
                repetir = true;
            }
        }
        return a;
    }

    }
