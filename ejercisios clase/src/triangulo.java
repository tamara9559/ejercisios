import javax.swing.*;

public class triangulo {//punto 8
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        side1 = Integer.parseInt(JOptionPane.showInputDialog("que longitud tiene el primer lado?"));
        side2 = Integer.parseInt(JOptionPane.showInputDialog("que longitud tiene el segundo lado?"));
        side3 = Integer.parseInt(JOptionPane.showInputDialog("que longitud tiene el tercer lado?"));
        if(side1 == side2 && side2 == side3 ){
            JOptionPane.showMessageDialog(null, "es un triangulo equilatero");
        }
else {
            JOptionPane.showMessageDialog(null, "no es equilatero weon");
        }
    }
}
