import javax.swing.*;

public class Elections {
    public static void main(String[] args) {
        int ana = 0;
        int diego = 0;
        int voteOption;
        for (int i = 0; i <= 9; i++){
            voteOption = Integer.parseInt(JOptionPane.showInputDialog("Select your candidate: 1. Ana Maria Suarez 2." +
                    " Diego Acero"));
            if(voteOption == 1){
                ana ++;
            } else if (voteOption == 2) {
                diego ++;
            } else {
                JOptionPane.showMessageDialog(null, "Please select a valid number");
            }
        }
        if(ana < diego){
            JOptionPane.showMessageDialog(null, "Diego wins the elections!!");
        } else if (diego < ana){
            JOptionPane.showMessageDialog(null, "Ana wins the elections!!");
        } else {
            JOptionPane.showMessageDialog(null, "Empate");
        }
    }
}