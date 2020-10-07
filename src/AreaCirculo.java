import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el area del circulo"));
        System.out.println(Math.PI*Math.pow(radio,2));
    }
}
