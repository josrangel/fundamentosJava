import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1=sca.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2=sca.nextDouble();

        if(numero2==0){
            System.out.println("No se puede dividir, el numero no puede ser 0");
        }else{
            System.out.println("El resultado es: "+numero1/numero2);
        }
    }
}
