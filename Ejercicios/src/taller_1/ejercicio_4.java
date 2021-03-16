/*Escriba un programa que permita ingresar N números enteros y que para cada número 
muestre: 
     Cuantos dígitos tiene el número
     La suma de sus dígitos.*/

package taller_1;

import javax.swing.JOptionPane;
import java.lang.*;

public class ejercicio_4 {
    public static void main(String[] args) {
        /*Variables*/
        int cantidad_numeros =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a trabajar: "));
        int suma, digitos;   
        String numero;
        
        
        for(int i = 0; i < cantidad_numeros; i++ ){
            numero = JOptionPane.showInputDialog("Ingrese un numero: ");
        
            digitos = numero.length();
            
            JOptionPane.showMessageDialog(null,"Resultados: " + "\nNumero: " + numero + "\nCantidad de digitos: " + digitos + "\nSuma");
        }
        
    }  
}
