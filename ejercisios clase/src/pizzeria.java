import javax.swing.*;

public class pizzeria {//punto 6
    public static void main(String[] args) {
        int menu;
        int pizza;
        int sand;
        sand = 1;
        int ensa;
        int salsa;
        int cost;
        cost = 1;
        menu = Integer.parseInt(JOptionPane.showInputDialog("que desea ordenar: 1. Pizza 2. Sándwiches 3 ensaladas"));
        switch (menu) {
            case 1:
                pizza = Integer.parseInt(JOptionPane.showInputDialog("vale 7000$ la unidad de pizza, cuantas desea llevar?"));
                cost = pizza * 7000;
                JOptionPane.showMessageDialog(null, "el costo total es de " + cost + "$");
                break;
            case 2:
                sand = Integer.parseInt(JOptionPane.showInputDialog("vale 5000$ la unidad de sandwiches, cuantas desea llevar?"));
                cost = sand * 5000;
                JOptionPane.showMessageDialog(null, "el costo total es de " + cost + "$");
                break;
            case 3:
                ensa = Integer.parseInt(JOptionPane.showInputDialog("vale 15000$ la unidad de ensalada, cuantas desea llevar?"));
                cost = ensa * 15000;
                JOptionPane.showMessageDialog(null, "el costo total es de " + cost + "$");
                break;
        }
        salsa = Integer.parseInt(JOptionPane.showInputDialog("desea llevar salsa? tiene un costo de 3000, 1.si 2.no"));
        if (salsa == 1) {
            salsa = salsa - 1;
            salsa = cost + 3000;
            JOptionPane.showMessageDialog(null, " su valor es " + salsa + "$");
        } else {
            salsa = salsa - 2;
            JOptionPane.showMessageDialog(null, "bueno :3");
        }
        JOptionPane.showMessageDialog(null, " el valor total es de " + salsa + "$");

    }
}