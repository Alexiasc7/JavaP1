package Figuras;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel{
    //Con esta variable el usuario elegirá qué figura dibujar.
    private int opcion;
    //El constructor va a establecer la opción del usuario
    public Figuras(int opcionUsuario){

        opcion = opcionUsuario;

    }//Fin del constructor Figuras.Figuras

    //Este método dibuja una cascada de figuras, empezando desde la esquina superior izquierda.
    public void paintComponent (Graphics g){

        super.paintComponent(g);

        for (int i = 0; i < 20; i++) {

            switch(opcion){
                case 1: //dibuja rectángulos
                    int xRect = 10 + i * 5;
                    int yRect = 10 + i * 5;
                    int anchoRect = 50 + i * 5;
                    int altoRect = 50 + i * 5;
                    g.drawRect(xRect, yRect, anchoRect, altoRect);
                    break;
                case 2: //dibuja óvalos
                    int xOval = 10 + i * 10;
                    int yOval = 10 + i * 10;
                    int anchoOval = 35 + i * 10;
                    int altoOval = 35 + i * 10;
                    g.drawOval(xOval, yOval, anchoOval, altoOval);
                    break;
            }
        }
    }
}

