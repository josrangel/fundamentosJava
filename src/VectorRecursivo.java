import java.util.Scanner;

public class VectorRecursivo {
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector");
        int longitud=sca.nextInt();
        double[] vector= new double[longitud];
        vector =llenaArreglo(vector);
        for (double valor:vector) {
            System.out.println(valor);
        }
        System.out.println("El resultado es: "+Math.sqrt(raiz(0, vector, 0)));

    }

    public static double[] llenaArreglo(double[] arreglo){
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=Math.round(Math.random()*10);
        }
        return arreglo;
    }

    public static double raiz(int posicion, double[] arreglo, double sumatoria){
        if(posicion==arreglo.length-1){
            return sumatoria + Math.sqrt(arreglo[posicion]);
        }else{
            return sumatoria + raiz(posicion+1,arreglo,sumatoria);
        }
    }
}
