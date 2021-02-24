/*
Escribir un programa que permita ingresar las notas de un grupo de 20 estudiantes y que muestre:

    La cantidad de ganadores
    La cantidad de perdedores
    La nota mayor
    La nota menor
 */
package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_3 {
    public static void main(String[] args) {
        
        int notas [] = new int[20];
        int contador_ganadores = 0, contador_perdedores = 0, mayor = notas[0], menor = notas[0];
        
        for(int i=0; i<20; i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i +": "));
            
            if(notas[i] >= 3){
                contador_ganadores = contador_ganadores + 1;
            }else if(notas[i] < 3 && notas[i] >= 0){
                contador_perdedores = contador_perdedores + 1;
            }
            
            if(notas[i] > mayor){
                mayor = notas[i];
            }
            
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Ganadores: " + contador_ganadores + " Perdedores: " + contador_perdedores + "\n"
        + "Nota Mayor: " + mayor + " Nota Menor: " + menor);
    }
}
