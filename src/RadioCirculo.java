import javax.swing.*;
import java.util.Scanner;

public class RadioCirculo {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double radio=sca.nextDouble();
        JOptionPane.showMessageDialog(null,Math.PI*Math.pow(radio,2));
    }
}
