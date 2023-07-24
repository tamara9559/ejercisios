import javax.swing.*;

public class tablas {//punto 14
    public static void main(String[] args) {
        int num;
        int safe;
        num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("que numero quieres saber la tabla?"));
        for (int a = 1; a <= 10; a++){
            safe = num * a;
            System.out.println(num + " * " + a + " = " + num * a);
        }
    }
}