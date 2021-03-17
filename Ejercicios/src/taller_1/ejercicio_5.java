/*Escriba un programa que muestre los cuadrados de los números enteros desde 1 hasta 
N, calculándolos solamente con sumas como las que se proponen a continuación.
    Número suma cuadrado
     1 1 1
     2 1+3 4
     3 1+3+5 9
     4 1+3+5+7 16*/

package taller_1;

import javax.swing.JOptionPane;

public class ejercicio_5 {
    public static void main(String[] args) {
        
        /*Variables*/
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int contador = 1, resultado = 0;
        
        for(int i = 1; i <= numero; i++){
            resultado = resultado + contador;
            contador = contador + 2;
            System.out.println("El cuadrado de "+ i + " es: " + resultado);
        }
        
    }  
}
