package Sub_Super_Clases;
import javax.swing.JFrame;
public class Herencia extends JFrame{
public Herencia(){
    setSize(300,300);
    setVisible(true);
}
public static void main(String []arg){
 Herencia ventana = new Herencia();
}
}
//en esta clase sin necesidad de codigo , con la herencia de la clase JFrame se logro hacer un panel/ventana
//ya que se a eredado los objetos setSixe y setVisible de Jframe clases dde Java