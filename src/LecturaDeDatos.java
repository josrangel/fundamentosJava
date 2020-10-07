import java.util.Scanner;
import javax.swing.JOptionPane;
public class LecturaDeDatos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dato = scanner.nextInt();
        System.out.println(dato);

        JOptionPane.showMessageDialog(null,"Hola mundo");

        String dato2=JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null,"El nombre ingresado es: "+dato2);
    }
}
