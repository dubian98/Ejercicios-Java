/*Para un grupo de N personas, escriba un programa que permita ingresar por cada una 
de ellas el nombre y la edad y que muestre: el nombre y un mensaje diciendo si es 
adulta, joven o niño y además contar cantidad adultos y la cantidad de niños. NOTA: Es 
adulta si es mayor de 25 años, es niño si tiene 15 años o menos.*/
package taller_1;

import javax.swing.JOptionPane;

public class Ejercicio_2 {


    public void edadPersonas() {
        /*Variables*/
        int cantidad_personas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas: "));
        int niños = 0, jovenes = 0, adultos = 0;

        /*Vectores*/
        String nombre[] = new String[cantidad_personas];
        int edad[] = new int[cantidad_personas];

        for(int i = 0; i < cantidad_personas; i++){
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre para la persona #" + i +": ");
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad para " + nombre[i] +": "));

            if(edad[i] >= 0 && edad[i] <= 15){
                JOptionPane.showMessageDialog(null,nombre[i] + " - Es niño");
                niños++;
            }else if(edad[i] > 15 && edad[i] < 25){
                JOptionPane.showMessageDialog(null,nombre[i] + " - Es joven");
                jovenes++;
            }else{
                JOptionPane.showMessageDialog(null,nombre[i] + " - Es adulto(a)");
                adultos++;
            }
        }

        JOptionPane.showMessageDialog(null,"Resultados: "+"\nNiños: "+ niños +"\nJovenes: " + jovenes + "\nAdultos: " + adultos );

    }

}
