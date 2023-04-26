
//--practicas sentencias en Java--//
/*public class Main {

    public static void main(String[] args) {
-- Uso de las sentencias if, else if--//
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
            JOptionPane.showMessageDialog(null, "Edad: " + persona.getEdad());*/

/*--Uso de las sentencias switch--//

            String eleccion = JOptionPane.showInputDialog("selecciona un numero de mes");
            int elec = Integer.parseInt(eleccion);

            switch(elec){
                case 1:
                    JOptionPane.showMessageDialog(null,"Enero");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"febrero");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Marzo");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Abril");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Mayo");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Junio");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Julio");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Agosto");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Septiembre");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null,"Octubre");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null,"Noviembre");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null,"Diciembre  ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Número de mes valido");
            }
        System.out.println("¿Hola, cuál es tu género?");
        //nextLine se utiliza cuando intentamos leer cadenas de caracteres desde el teclado.
        Scanner sc = new Scanner(System.in);
        String genero = sc.nextLine();

        switch (genero){
            case "femenino" :
            System.out.println("Eres mujer");
        break;
            case "masculino":
            System.out.println("Eres hombre");
        }

        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }
        else if (edad < 18){
            System.out.println("Eres menor de edad");
        }

        System.out.println("Hola,eres " + genero + " de " + edad + " años ");
    */
        /* int i=0; //uso de while
    while(i<100){
        System.out.println("el  valor de i es:" +i);
            i =i+1;
    }
    System.out.println("Terminacion del ciclo");

//--Uso de sentencia do while--//

        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor = teclado.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                    System.out.println("Tiene 1 dígito.");
                }
            }
        } while (valor!=0);
        //Uso del for(inicializador;condicion;incremento){}
        for(int i = 0; i <=10; i++){
            System.out.println("El valor de i es: "+ i);
        }

//--Uso de la sentencia Break--//

        int cuenta; //La variable de control tambiénse usa cuando termina el ciclo

        for(cuenta = 1; cuenta <= 10; cuenta++ ) //itera 10 veces
        {
            if (cuenta == 5) //Si cuenta es igual a 5
            {
                break; //Termina el ciclo
            }

            System.out.println("Cuenta es: " + cuenta);
        }// fin del for
        System.out.println("Salio del ciclo en cuenta = " + cuenta);

//--Uso de sentencia continue--//

        for (int cuenta = 1; cuenta <= 10; cuenta++) {
            if(cuenta == 5) { //Si cuenta es cinco
                continue;  //omite el resto del código en el ciclo
            }
            if(cuenta == 6){
                continue;
            }
            System.out.println("La cuenta es: " + cuenta);
            System.out.println("Impresion después del valor");
        }
        System.out.println("Se uso continue para omitir imprimir el 5 y 6");
    }
}*/

