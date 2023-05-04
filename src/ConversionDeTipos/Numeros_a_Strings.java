package ConversionDeTipos;

public class Numeros_a_Strings {
    public static void main (String[]arg){
        //números a cadenas de caracteres
        int i = 5;
        byte b = 10;
        short s = 60;
        double d = 25.4;
        float f = 9.63f;
        long l = 452545l;

        String sInt = ""+i;
        String sByte = Byte.toString(b);
        String sShort = Short.toString(s);
        String sDouble = String.valueOf(d);
        String sFloat = String.valueOf(f);
        String sLong = String.valueOf(l);

        //de cadenas de caracteres a número
        String numero1 = "265";
        String numero2 = "25.36";

        int num1 = Integer.parseInt(numero1);

        double num2 = Double.parseDouble(numero2);

        Integer num3 =Integer.valueOf(numero1);

        Double num4 = Double.valueOf(numero2);

        short num5 = Short.parseShort("125");

        byte num6 = Byte.parseByte("1");
    }
}
