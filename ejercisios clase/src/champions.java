import javax.swing.*;

public class champions {//punto 12
    public static void main(String[] args) {
        String equip1;
        String equip2;
        int score1;
        int score2;
        String date1;
        String date2;
        String date3;
        equip1 = JOptionPane.showInputDialog("nombre del equipo 1");
        score1 = Integer.parseInt(JOptionPane.showInputDialog("marcador del equipo 1"));
        JOptionPane.showMessageDialog(null, "el equipo es: "+equip1+" con el marcador de:"+score1+"");
        equip2 = JOptionPane.showInputDialog("nombre del equipo 2");
        score2 = Integer.parseInt(JOptionPane.showInputDialog("marcador del equipo 2"));
        JOptionPane.showMessageDialog(null, "el equipo es: "+equip2+" con el marcador de:"+score2+"");
        date1 = JOptionPane.showInputDialog("fecha del primer partido");
        date2 = JOptionPane.showInputDialog("fecha del segundo partido");
        date3 = JOptionPane.showInputDialog("fecha del tercero partido");
        if(score1 < score2){
            JOptionPane.showMessageDialog(null, "ranking de los equipos es: primer equipo es "+equip2+" y el segundo es "+equip1+"");
        } else if (score1 == score2) {
            JOptionPane.showMessageDialog(null, "los equipos estan empatados");
        }
        else {
            JOptionPane.showMessageDialog(null, "ranking de los equipos es: primer equipo es "+equip1+" y el segundo es "+equip2+"");
        }

    }
}
