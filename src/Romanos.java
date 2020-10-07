import javax.swing.JOptionPane;
public class Romanos {
    public static void main(String[] args) {

        String[] letrasRomanos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] enteros = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        System.out.println("Numero entero: " + numero);
        String romano="";
        for(int i=0;i<enteros.length;i++) {
            while(numero >= enteros[i]) {
                numero =numero- enteros[i];
                romano=romano+letrasRomanos[i];
            }
        }
        System.out.println("Numero Romano: "+romano);
    }
}