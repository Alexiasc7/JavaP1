

import javax.swing.JOptionPane;
public class Main {
        public static void main(String[] args) {
            String nombre = JOptionPane.showInputDialog("Escribe tu nombre:");
            String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad");
            String altura = JOptionPane.showInputDialog("Escribe tu altura");
            String edad = JOptionPane.showInputDialog("Escribe tu edad: ");

            double alt = Double.parseDouble(altura);
            int edadPersona = Integer.parseInt(edad);

            personas persona = new personas(); //objeto de la clase personas
            persona.setNombre(nombre); //objeto y lo que reresa de la clase y el parametro
            persona.setNacionalidad(nacionalidad);
            persona.setAltura(alt);
            persona.setEdad(edadPersona);

            JOptionPane.showMessageDialog(null, "Nombre: " + persona.getNombre()); //muestra el resultado del objetto y parametro
            JOptionPane.showMessageDialog(null, "Nacionalidad: " + persona.getNacionalidad());
            JOptionPane.showMessageDialog(null, "Altura: " + persona.getAltura());
            JOptionPane.showMessageDialog(null, "Edad: " + persona.getEdad());

        }
//no quiere ayuda porfavor
    }

