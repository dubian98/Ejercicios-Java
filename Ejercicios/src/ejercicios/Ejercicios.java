package ejercicios;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.length;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicios {

    public static void main(String[] args) {
        
        /*Definicion de variables*/
        String nombre;
        int edad, tamaño_nombre;
        double estatura;

        /*Ingreso de datos por el usuario.*/
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura: "));

        /*Calculo de metros a milimetros*/
        estatura = estatura * 1000;
        
        /*Metodo para saber el tamaño del nombre (saber cantidad de caracteres)*/
        tamaño_nombre = nombre.length();
        
        /*Salidade datos procesados con diferentes metodos:
            toUpperCase() -> Convierte un string en mayuscula sostenida
            Math.pow() -> Eleva un numero a una potencia
            Math.cbrt() -> Raiz cubica de un numero
            length() -> Tamaño de una cadena de caracteres.
            charAt() -> De vuelve el caracter de una posicion especifica en una cadena de caracteres
        */
        JOptionPane.showMessageDialog(null, " Nombre: " + toUpperCase(nombre) + 
                "\n Edad: " + Math.pow(edad, 3) + 
                "\n Estatura: " + estatura + "mm" + 
                "\n Raiz Cubica edad: " + Math.cbrt(edad)+
                "\n Letras del nombre: " + length(nombre)+ 
                "\n Primera Letra: " + nombre.charAt(0) +
                "\n Ultima letra: "+ nombre.charAt(tamaño_nombre-1));
    }
    
}
