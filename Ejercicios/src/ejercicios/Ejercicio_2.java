package ejercicios;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
        int edad, año;
        String nombre;
        float estatura;
        
        Calendar fecha = Calendar.getInstance();
        año = fecha.get(Calendar.YEAR);
        
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su estatura: "));
        
        if(edad >= 18){
            nombre = nombre.toUpperCase();
            estatura = estatura * 1000;
            
            JOptionPane.showMessageDialog(null, "");
        }else if(edad < 18 && edad >= 0){
            nombre = nombre.toLowerCase();
            System.out.println(año);
        }else{
           System.out.println("Error"); 
        }


    }
}
