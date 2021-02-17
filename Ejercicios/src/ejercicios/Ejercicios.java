package ejercicios;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicios {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double estatura;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura: "));

        estatura = estatura * 1000;
        
        JOptionPane.showMessageDialog(null, " Nombre: " + toUpperCase(nombre) + "\n Edad: " + Math.pow(edad, 3) + "\n Estatura: " + estatura + "mm");
    }
    
}
