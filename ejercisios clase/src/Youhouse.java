import javax.swing.*;

public class Youhouse {
        public static void main(String[] args) {
            int typeHouse;
            int house;
            double commision;
            double userMoney;
            commision = 1;
            typeHouse = Integer.parseInt(JOptionPane.showInputDialog("Which type of house is yours: 1. Used 2. New"));
            switch (typeHouse) {
                case 1:
                    house = Integer.parseInt(JOptionPane.showInputDialog("How much it cost?"));
                    commision = house * 0.1;
                    userMoney = house - commision;
                    JOptionPane.showMessageDialog(null, "You received " + userMoney + "$");
                    JOptionPane.showMessageDialog(null, "We received " + commision + "$");
                    break;
                case 2:
                    house = Integer.parseInt(JOptionPane.showInputDialog("How much it cost?"));
                    commision = house * 0.12;
                    userMoney = house - commision;
                    JOptionPane.showMessageDialog(null, "You received " + userMoney + "$");
                    JOptionPane.showMessageDialog(null, "We received " + commision + "$");
                    break;
            }
        }
    }


