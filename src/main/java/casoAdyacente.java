import java.util.Scanner;

public class casoAdyacente {
    public static Scanner teclado=new Scanner(System.in);
    public static int prodAdyacente(int[]numeros){
        int result=0;
        for (int i=0;i<numeros.length-1;++i){
            if (numeros[i]*numeros[i+1]>result) {
                result = numeros[i] * numeros[i + 1];
            }
        }
        return result;
    }
    public static void validador(){
        System.out.println("Ingrese cantidad de numeros a comparar: ");
        int largo=teclado.nextInt();
        int [] numeros=new int[largo];

        System.out.println("Ingrese numeros: ");
        for (int i=0; i<numeros.length;++i){
            numeros[i]=teclado.nextInt();
        }
        int resultado=prodAdyacente(numeros);
        System.out.println("mayor: "+resultado);
    }
}
