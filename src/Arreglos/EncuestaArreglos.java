package Arreglos;

import javax.swing.JOptionPane;
/*
 * Clase que muestra el análisis de una encuesta.
 *
 * Si pidió a veinte estudiantes que calificaran la calidad de la comida en la cafetería
 * estudiantil en una escala de 1 al 5, en donde 1 significa "pésimo" y 5 significa "excelente.
 * Coloque las 20 respuestas en un arreglo entero y determine la frecuencia de cada calificación.
 */
 public class EncuestaArreglos {
    public static void main(String[] args) {
        //arreglo de respuestas de estudiantes
        int[] respuestas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        //arreglo de contadores de frecuencia.
        int[] frecuencia = new int[6];

        int total = 0;
        // para cada respuesta, selecciona el elemento de respuestas y usa ese valor
        // como índice de frecuencia para determinar el elemento a incrementar.
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            try {
                frecuencia[respuestas[respuesta]] += 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto se saltara la respuesta: " + respuestas[respuesta]);
            }
        }
        System.out.printf("%s %10s\n", "Calificación", "Frecuencia");

        for (int calificacion = 1; calificacion < frecuencia.length; calificacion++) {

            System.out.printf("%6d %10d\n", calificacion, frecuencia[calificacion]);
        }
        System.out.println("El total de alumnos encuestados es : " +respuestas.length );
    }
}
