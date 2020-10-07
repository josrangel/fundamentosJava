import javax.swing.*;

public class AreasSwitch {
    public static void main(String[] args) {
        double a= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor"));
        double b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        String menu="1. Area de un cuadrado \n2. Area de un triangulo \n3. Area de un circulo \n";
        int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu+"Ingrese su opcion"));

        double resultado=0;
        switch (opcion){
            case 1:
                resultado=a*b;
                break;
            case 2:
                resultado=a*b/2;
                break;
            case 3:
                resultado=Math.PI*Math.pow(a,2);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no encontrada");
                break;
        }
        JOptionPane.showMessageDialog(null,"Resultado ="+resultado);
    }
}
