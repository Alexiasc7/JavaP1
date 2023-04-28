
package Arreglos;
import java.util.ArrayList;
public class Arreglos {
    public static void main(String[] args) {
       /* int arreglo[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int total = 0;
        for (int numero : arreglo) { //for sencillo sin uso de contador
            total += numero;
        }
        System.out.println("La sumatoria total del arreglo es: " +total );*/
//ARRAYLIST CLASE DEL API DE JAVA
        ArrayList< String > array = new ArrayList<String>();
        array.add("rojo");
        array.add("azul");
        array.add("verde");
        for(String elemento : array){
            System.out.println("Valor: " + elemento);
        }
        if(array.contains("verde")){
            System.out.println("Si tengo el elemento verde");
        }

        if(array.contains("amarillo")){
            System.out.println("Si contiene un elemento amarillo");
        }
        else{
            System.out.println("no tiene amarillo");
        }

        System.out.println("El array está vacío? " + array.isEmpty());

        array.clear();

        System.out.println("El array está vacío ahora? " + array.isEmpty());

    }
}