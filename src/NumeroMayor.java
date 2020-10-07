import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1=sca.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2=sca.nextDouble();

        if(numero1>numero2){
            System.out.println("El mayor es el primero");
        }else if(numero1==numero2){
            System.out.println("El mayor es el segundo");
        }else{
            System.out.println("El mayor es el segundo");
        }
    }
}
