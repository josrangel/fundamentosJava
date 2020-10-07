import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

        System.out.println("Ingrese el limite de la serie de fibonnaci");
        int limite=sca.nextInt();
        int resultado=limite;
        int n=1;
        for (int i=1;i<resultado;i++){
            n *= i ;
        }
        System.out.println("la serie es = "+n);
    }
}
