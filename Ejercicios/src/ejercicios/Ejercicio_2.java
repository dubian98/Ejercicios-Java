package ejercicios;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
        int edad, año;
        String nombre;
        float estatura;
        boolean flag = false;
        
        Calendar fecha = Calendar.getInstance();
        año = fecha.get(Calendar.YEAR);
        
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su estatura: "));
        
        
        while(flag == false){
        if(edad >= 18){
            nombre = nombre.toUpperCase();
            estatura = estatura * 1000;
            flag = true;
            
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre + " Estatura: " + estatura);

        }else if(edad < 18 && edad >= 0){
            nombre = nombre.toLowerCase();
            flag = true;
                         
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre + " Año: " + año);
        }else{
            flag = false;
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es valido.", "Error", JOptionPane.WARNING_MESSAGE);
        }

        }
    }
}
