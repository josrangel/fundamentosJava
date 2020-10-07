import javax.swing.*;

public class ReglaTres {
    public static void main(String[] args) {

        //5.5 - 4.5
        //x - 100
        //122,2Guests@01
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el area del circulo"));
        System.out.println(Math.PI*Math.pow(radio,2));
    }
}
