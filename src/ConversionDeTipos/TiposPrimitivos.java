package ConversionDeTipos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /* los 8 tipos de datos primitivos que hay en Java son:
        byete, Short, Int, long, float, double, char, boolean
        /cuando se convierte un tipo de dato a otro ,como uno mas grande a uno mas pequeño o viceberza  para convertir se pone
         nombre de la variable (tipo) nombre de variable a convertir ejemplo:
        int a = 1;
        double b = 2.5;

        b = a;
        a = (int) b;
        /se puede convertir el int a double sin problema, pero al hacer lo contrario al dauble ser con decimal hay perdida de datos
        si se trata de convertir a int se le llama casting a la conversion

        System.out.println("el valor de a es : " + b);
        System.out.println("el valor de b ,but no completo : " + a);*/

        //EJEMPLO2
        int codigo = 97; //un codigo de java

        char codigoASCII = (char) codigo;

        System.out.println("El char es: " + codigoASCII); //el codigo a
    }
}
