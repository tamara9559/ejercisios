import javax.swing.*;

public class Services {
    public static void main(String[] args) {
        int options;
        int money;
        int userMoney;
        options = Integer.parseInt(JOptionPane.showInputDialog("Select the type of money you have: 1. Dollars 2. " +
                "Pennies"));
        switch (options){
            case 1:
                money = Integer.parseInt(JOptionPane.showInputDialog("Introduce the amount of money (only 2000 or 5000 " +
                        "dollars)"));
                userMoney = money - 500;
                if(money == 2000  || money == 5000){
                    if(userMoney == 0){
                        JOptionPane.showMessageDialog(null, "You have no more money");
                    } else{
                        JOptionPane.showMessageDialog(null, "You have " + userMoney + " dollars" +
                                " left");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, try again");
                }
                break;
            case 2:
                money = Integer.parseInt(JOptionPane.showInputDialog("Introduce the amount of pennies (only 500 " +
                        "or 1000 pennies)"));
                userMoney = money - 500;
                if(money == 500  || money == 1000){
                    if(userMoney == 0){
                        JOptionPane.showMessageDialog(null, "You have no more money");
                    } else{
                        JOptionPane.showMessageDialog(null, "You have " + userMoney + " pennies" +
                                " left");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, try again");
                }
                break;
        }
    }
}