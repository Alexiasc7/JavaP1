package ConversionDeTipos;
import java.util.ArrayList;
public class ClasesEnvoltorio {
    public static void main(String[]arg){
        /*Clases envoltorio o wrappers son clases que permiten envolver un tipo de dato basico en un objeto son 8 tipos
        / los 8 tipos de datos primitivos de Java son:byete, Short, Int, long, float, double, char, boolean
        / los 8 tipos de wrappers de java son (comienzan con mayuscula):
        Byte envuelve byte, short envuelve short, Integer envuelve int, Double envuelve double, Character envuelve char
        Long envuelve long, Float envuelve float, Boolean envuelve boolean
         */
        int comparacion = Double.compare(14.5, 14.9);

        /*los metodos de cada clase se pueden ver en la documentacion de wrappers de java oracle, por ejemplo el de compare de
        este ejemplo su funcion es comparar los parametros  y si es el valor es igual da 0 y si es diferente da 1 o -1
        dependiendo de cual parametro es 1 es izquierda -1 derecha*/

        System.out.println("comparacion: " + comparacion);


    }
}
