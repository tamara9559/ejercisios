import javax.swing.*;

public class examen {//punto 10
    public static void main(String[] args) {
        int result;
        int quest1;
        int quest2;
        int quest3;
        int quest4;
        int quest5;
        int score;
        score = 0;
        quest1 = Integer.parseInt(JOptionPane.showInputDialog("cual es la capital de colombia?:  1.bogota 2.medellin 3.armenia 4.cali"));
        if(quest1 == 1){
            JOptionPane.showMessageDialog(null, "respuesta correcta :3");
            score = score + 10;
        }else{
            JOptionPane.showMessageDialog(null, "incorrecto");
        }
        JOptionPane.showMessageDialog(null, "tus puntos son:"+score+"");

        quest2 = Integer.parseInt(JOptionPane.showInputDialog("1+1 = 2, esta suma es:  1.falsa  2.verdadero"));
        if(quest2 == 2){
            JOptionPane.showMessageDialog(null, "respuesta correcta :3");
            score = score + 10;
        }else{
            JOptionPane.showMessageDialog(null, "incorrecto");
        }
        JOptionPane.showMessageDialog(null, "tus puntos son:"+score+"");

        quest3 = Integer.parseInt(JOptionPane.showInputDialog("en que continente queda colombia?: 1.norte america 2.europa 3.asia 4.sur america "));
        if(quest3 == 4){
            JOptionPane.showMessageDialog(null, "respuesta correcta :3");
            score = score + 10;
        }else{
            JOptionPane.showMessageDialog(null, "incorrecto");
        }
        JOptionPane.showMessageDialog(null, "tus puntos son:"+score+"");

        quest4 = Integer.parseInt(JOptionPane.showInputDialog("los humanos tenemos 200 huesos, esta afirmacion es:  1.falsa  2.verdadero"));
        if(quest4 == 1){
            JOptionPane.showMessageDialog(null, "respuesta correcta :3");
            score = score + 10;
        }else{
            JOptionPane.showMessageDialog(null, "incorrecto");
        }
        JOptionPane.showMessageDialog(null, "tus puntos son:"+score+"");

        quest5 = Integer.parseInt(JOptionPane.showInputDialog("cual es el rio mas largo del mundo? 1.el nilo 2.misisipi 3.el amazonas 4. de la plata"));
        if(quest5 == 3){
            JOptionPane.showMessageDialog(null, "respuesta correcta :3");
            score = score + 10;
        }else{
            JOptionPane.showMessageDialog(null, "incorrecto");
        }
        JOptionPane.showMessageDialog(null, "tus puntos son:"+score+"");

        JOptionPane.showMessageDialog(null, "tus puntos en total fueron "+score+"");
    }
}
