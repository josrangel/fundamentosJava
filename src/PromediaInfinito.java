import java.util.Scanner;

public class PromediaInfinito {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int conta=0;
        int acumulador=0;
        boolean continuar=true;
        do {
            System.out.println("Ingrese su valor a acumular");
            int ingreso=sca.nextInt();

            if(ingreso>=0){
                acumulador+=ingreso;
                conta++;
            }else{
                continuar=false;
            }
        }while(continuar);

        System.out.println("El promedio es= "+acumulador/conta);
    }
}
