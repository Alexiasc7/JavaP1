package Sub_Super_Clases;
public class Gato extends Mamifero{
    public static void main(String []arg){
        Gato g1 = new Gato();
        Animal a = g1;
        if ( a instanceof Gato){
            System.out.println("El objeto 'a' pertenece a clase gato");
        }
    }
}
