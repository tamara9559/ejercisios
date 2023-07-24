import javax.swing.*;

public class Cars {
    public static void main(String[] args) {
        int options;
        int carSelect;
        options = Integer.parseInt(JOptionPane.showInputDialog("Select which car you want to know: 1. Chevrolet 2. " +
                "Mazda 3. Renault"));
        switch (options){
            case 1:
                carSelect = Integer.parseInt(JOptionPane.showInputDialog("Select the reference: 1. DaCar 2. Great car"));
                switch (carSelect){
                    case 1:  JOptionPane.showMessageDialog(null, "DaCar is a awesome car, it has " +
                            "a lot of uses");
                        break;
                    case 2:  JOptionPane.showMessageDialog(null, "Great car is the ultimate car " +
                            "in our stocks");
                        break;
                }
                break;
            case 2:
                carSelect = Integer.parseInt(JOptionPane.showInputDialog("Select the reference: 1. TamaraCar 2. " +
                        "Miguel car"));
                switch (carSelect){
                    case 1:  JOptionPane.showMessageDialog(null, "TamaraCar is fast, but is " +
                            "useless against cats");
                        break;
                    case 2:  JOptionPane.showMessageDialog(null, "MiguelCar is a car against " +
                            "everything, but it doesn't have good wheels");
                        break;
                }
                break;
            case 3:
                carSelect = Integer.parseInt(JOptionPane.showInputDialog("Select the reference: 1. AwesomeCar 2. " +
                        "UglyCar"));
                switch (carSelect){
                    case 1:  JOptionPane.showMessageDialog(null, "The awesome car is awesome, " +
                            "that's all");
                        break;
                    case 2:  JOptionPane.showMessageDialog(null, "The UglyCar is ugly but it " +
                            "has missiles :)");
                        break;
                }
                break;
        }
    }

}