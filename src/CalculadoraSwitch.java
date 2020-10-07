import javax.swing.*;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        double a= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor"));
        double b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        String menu="1. Suma \n2. Resta \n3. Producto \n4. Division \n5. Potencia \n6. Raiz cuadrada \n";
        int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu+"Ingrese su opcion"));

        double resultado=0;
        switch (opcion){
            case 1:
                resultado=a+b;
                break;
            case 2:
                resultado=a-b;
                break;
            case 3:
                resultado=a*b;
                break;
            case 4:
                if (b == 0) {
                    JOptionPane.showMessageDialog(null,"No se puede dividir entre 0");
                }else {
                    resultado = a / b;
                }
                break;
            case 5:
                resultado=Math.pow(a,b);
                break;
            case 6:
                resultado=Math.sqrt(a);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no encontrada");
                break;
        }
        JOptionPane.showMessageDialog(null,"Resultado ="+resultado);


    }
}
