public class casoAdyacente {
    public static int prodAdyacente(int[]numeros){
        int result=0;
        for (int i=0;i<numeros.length-1;++i){
            if (numeros[i]*numeros[i+1]>result) {
                result = numeros[i] * numeros[i + 1];
            }
        }
        return result;
    }
}
