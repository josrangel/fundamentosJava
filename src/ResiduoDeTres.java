import javax.swing.*;

public class ResiduoDeTres {
    public static void main(String[] args) {
        double numero=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero a dividir"));
        System.out.println(numero%3);
    }
}
