import javax.swing.*;

public class LavanYa {//punto 4
    public static void main(String[] args) {
        int service;
        int washed;
        int garments;
        int shipment;
        int decision1;
        boolean decision2;
        boolean decision3;
        boolean decision4;
        int vseco;
        int vnormal;
        int vplancha;
        vplancha = 1;
        decision1 = 0;
        decision2 = false;
        decision3 = false;
        decision4 = false;
        washed = 0;


        service = Integer.parseInt(JOptionPane.showInputDialog("que tipo de servicio quiere: 1.lavado  2.planchado"));
        washed = Integer.parseInt(JOptionPane.showInputDialog("que tipo de lavado quiere: 1.en seco  2.normal"));
       if (washed == 1 && service == 1) {
            JOptionPane.showMessageDialog(null, "escogio lavado en seco");
            decision2 = true;
        } else if (washed == 2 && service == 1) {
            decision3 = true;
            JOptionPane.showMessageDialog(null, "escogio lavado normal");

        } else {
            JOptionPane.showMessageDialog(null, "escogio planchado");
            decision4 = true;
        }
        System.out.println(decision2);

        garments = Integer.parseInt(JOptionPane.showInputDialog("cuantas prendas son?"));
        if (decision2 == true) {
            vseco = garments * 2000;
            JOptionPane.showMessageDialog(null, "el precio es de "+vseco+"");
        }
        else if (decision3 == true) {
            vnormal = garments * 1500;
            JOptionPane.showMessageDialog(null, "el precio es de "+vnormal+"");
        }
        else{
            vplancha = garments * 1800;
            JOptionPane.showMessageDialog(null, "el precio es de "+vplancha+"");
        }
        shipment = Integer.parseInt(JOptionPane.showInputDialog("quiere servicio a domicilio: 1.si  2.no"));
        if(shipment == 1 && decision4 == true){
         shipment = vplancha + 3000;
            JOptionPane.showMessageDialog(null, "el costo total es "+shipment+"");
        } else if (shipment == 1 && decision2 == true) {
            JOptionPane.showMessageDialog(null, "domicilio gratis");}
        else if (shipment == 1 && decision3 == true) {
                JOptionPane.showMessageDialog(null, "domicilio gratis");
        } else {
            JOptionPane.showMessageDialog(null, "sin domicilio");
        }
    }
}