package Arcoiris;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.Color;

public class DibujoArcoiris extends JPanel  {
    //definicion de los colores a usar
    private final static Color VIOLETA= new Color(128, 0, 128);
    private final static Color INDIGO=  new Color(75, 0, 130);
    // las dos entradas de color blanco producen un arco vacío en el centro.
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    public DibujoArcoiris (){
        setBackground(Color.BLACK);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         int radio=20;
        int centroX = getWidth() /2;
        int centroY = getHeight() - 10;

        for (int contador = colores.length; contador > 0 ; contador--){
            //establecer el color para el arco actual

            g.setColor( colores [contador - 1]);

            //rellena el arco desde 0 hasta 180 grados
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;

            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
        }
    }

}
