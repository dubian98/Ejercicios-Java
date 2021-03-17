/*Escriba un programa que permita ingresar N números enteros y que para cada número 
muestre: 
     Cuantos dígitos tiene el número
     La suma de sus dígitos.

IPORTANTE!!!!!!!!!!!!!!!!!!!!!!!!
Parte de la solucion la saque de este video : https://www.youtube.com/watch?v=8aKFU4GRjHA
*/
package taller_1;

import javax.swing.JOptionPane;

public class ejercicio_4 {
    public static void main(String[] args) {
        /*Variables*/
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int copia_numero = numero;
        int cifras [] = new int[10];
        int i = 0, contador = 0, acumulador = 0;
        
        while(numero > 0){
            cifras[i] = numero % 10;
            numero = numero / 10;
            i++;
        }
        
        for(int x = i-1; x >= 0; x-- ){
            System.out.println(cifras[x]);
            contador++;
            acumulador = acumulador + cifras[x];
        }
       
        JOptionPane.showMessageDialog(null,"Resultados: " + "\nNumero: " + copia_numero + "\nCifras: " + contador + "\nSuma de las cifras: " + acumulador);
    }  
}
