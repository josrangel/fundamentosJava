import java.util.Scanner;

public class NumeroMayor3 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1=sca.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2=sca.nextDouble();
        System.out.println("Ingrese el tercer numero");
        double numero3=sca.nextDouble();

        if(numero1>numero2){
            if(numero1>numero3){
                System.out.println("el mayor es el primero");
            }else if(numero1<numero3){
                System.out.println("el mayor es el tercero");
            }else if(numero1==numero3){
                System.out.println("el mayor es el tercero");
            }
        }else if(numero1>numero2){
            if(numero2>numero3){
                System.out.println("el mayor es el segundo");
            }else if(numero3>numero2){
                System.out.println("el mayor es el tercero");
            }else if(numero2==numero3){
                System.out.println("el 2 y el 3 son iguales y mayores es el tercero");
            }
        }else if(numero1==numero2){
            if(numero1>numero3){
                System.out.println("el 1 y el 2 son iguales y mayores que el tercero");
            }else if(numero3>numero1){
                System.out.println("el mayor es el tercero");
            }else if(numero1==numero3){
                System.out.println("los tres son iguales");
            }
        }
    }
}
