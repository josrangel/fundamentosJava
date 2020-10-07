public class NumerosNoMultiplosTres {
    public static void main(String[] args) {
        int conta=1;
        int contaNoPares3=0;
        while(contaNoPares3<100){
            if(conta%3!=0){
                System.out.println(conta);
                contaNoPares3++;
            }
            conta++;
        }
    }
}
