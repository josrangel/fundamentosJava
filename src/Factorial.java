import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

        System.out.println("Ingrese el factorial a calcular");
        int factorial=sca.nextInt();
        int resultado=factorial;
        for (int i=factorial;i>1;i--){
            resultado *= --factorial;
        }
        System.out.println("El factorial es= "+resultado);
    }
}
