import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        int conta=1;
        int contaPares=0;
        while(contaPares<100){

            if(conta%2==0){
                System.out.println(conta);
                contaPares++;
            }
            conta++;
        }
    }
}
