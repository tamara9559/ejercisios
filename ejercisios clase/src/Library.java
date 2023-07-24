import javax.swing.*;

public class Library {
    public static void main(String[] args) {
        int books;
        int options;
        int fine;
        int days;
        int returnType;
        options = Integer.parseInt(JOptionPane.showInputDialog("Select the service you require: 1. Report loss 2. " +
                "Return a item"));
        switch (options){
            case 1:
                books = Integer.parseInt(JOptionPane.showInputDialog("How many you loss?"));
                fine = books * 10000;
                JOptionPane.showMessageDialog(null, "Your fine is " + fine);
                break;
            case 2:
                returnType = Integer.parseInt(JOptionPane.showInputDialog("Which type of item? 1. Book 2. Magazine"));
                if(returnType == 1){
                    books = Integer.parseInt(JOptionPane.showInputDialog("How many?"));
                    days = Integer.parseInt(JOptionPane.showInputDialog("How long?"));
                    fine = books * 600 * days;
                    JOptionPane.showMessageDialog(null, "Your fine is " + fine);
                } else if (returnType == 2){
                    books = Integer.parseInt(JOptionPane.showInputDialog("How many?"));
                    days = Integer.parseInt(JOptionPane.showInputDialog("How long?"));
                    fine = books * 500 * days;
                    JOptionPane.showMessageDialog(null, "Your fine is " + fine);
                }
        }
    }
}