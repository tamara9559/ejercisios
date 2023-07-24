

import javax.swing.*;

public class Stickers {
    public static void main(String[] args) {
        int stickerSize;
        int amount;
        int price;
        amount = 0;
        stickerSize = Integer.parseInt(JOptionPane.showInputDialog("Select the size of your sticker: 1. Big 2. Small"));
        switch (stickerSize){
            case 1:
                amount = Integer.parseInt(JOptionPane.showInputDialog("How many? (need at least 10)"));
                while (amount<10){
                    JOptionPane.showMessageDialog(null, "Sorry, you need at least 10");
                    amount = Integer.parseInt(JOptionPane.showInputDialog("How many? (needs to be at least 10)"));
                }
                price = amount * 6000;
                JOptionPane.showMessageDialog(null, "The final price is " + price);
                break;
            case 2:
                amount = Integer.parseInt(JOptionPane.showInputDialog("How many? (need at least 10)"));
                while (amount<10){
                    JOptionPane.showMessageDialog(null, "Sorry, you need at least 10");
                    amount = Integer.parseInt(JOptionPane.showInputDialog("How many? (needs to be at least 10)"));
                }
                price = amount * 4000;
                JOptionPane.showMessageDialog(null, "The final price is " + price);
        }
    }
}