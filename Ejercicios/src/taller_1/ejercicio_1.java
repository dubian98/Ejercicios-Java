/*Escriba un programa que permita ingresar los nombres y las notas de N estudiantes y
que muestre un mensaje que diga si este puede habilitar o si perdió definitivamente la 
asignatura, sólo habilita el que tenga 2 o más pero menos que 3. Imprima cuantos 
pueden habilitar y cuantos ganaron.*/

package taller_1;

import javax.swing.JOptionPane;

public class ejercicio_1 {
    public static void main(String[] args) {
        /*Variables*/
        int cantidad_estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a calcular: "));
        int ganan = 0, habilitan = 0, pierden = 0;
        
        /*Vectores*/
        String nombre_estudiantes[] = new String[cantidad_estudiantes];
        double notas_estudiantes[] = new double[cantidad_estudiantes];
        
        for(int i = 0; i < cantidad_estudiantes; i++){
            nombre_estudiantes[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante #" + i +": ");
            notas_estudiantes[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota para " + nombre_estudiantes[i] + ": "));
            
            if(notas_estudiantes[i] >= 0 && notas_estudiantes[i] < 2){
                JOptionPane.showMessageDialog(null,"Perdio la materia");
                pierden++;
            }else if(notas_estudiantes[i] >= 2 && notas_estudiantes[i] <= 2.9){
                JOptionPane.showMessageDialog(null,"Puede habilitar la materia");
                habilitan++;
            }else{
                JOptionPane.showMessageDialog(null,"Gano la materia");
                ganan++;
            }
        }
        
        JOptionPane.showMessageDialog(null,"Resultados: "+"\nPierden: "+ pierden +"\nHabilitan: " + habilitan + "\nGanan: " + ganan );
        
    }
}
