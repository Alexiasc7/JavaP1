package Sobreescritura;

public class Sobreescritura  {
    public String toString (){
        return "Adios";
    }

    public static void main(String[] args) {
        Sobreescritura2 obj = new Sobreescritura2();

        System.out.println(obj.toString()); //aqui se indicara de donde pertenece el objeto obj (osea que nos dara q pertence a sobereescritura2)
    }
}
