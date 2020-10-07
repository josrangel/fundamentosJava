import java.util.Scanner;

public class PolinomioSegundoGrado {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        double a=sca.nextDouble();
        System.out.println("Ingrese el valor de b");
        double b=sca.nextDouble();
        System.out.println("Ingrese el valor de c");
        double c=sca.nextDouble();
        double aux=(Math.pow(b,2)-(4*a*c));
        double x1,x2;
        if(a>0) {
            if (aux >= 0) {
                x1 = (-b + Math.sqrt(aux)) / (2 * a);
                x2 = (-b - Math.sqrt(aux)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {
                x1 = (-b + aux) / (2 * a);
                x2 = (-b - aux) / (2 * a);
            }

            System.out.println("x1=" + (-b / (2 * a)) + "+" + (Math.sqrt(Math.abs(aux))) + "i");
            System.out.println("x1=" + (-b / (2 * a)) + "-" + (Math.sqrt(Math.abs(aux))) + "i");
        }else{
            System.out.println("Error, no estas evaluando una ecuacion de grado 2");
        }
    }
}
