/*
    Ejercicio

    Una empresa tiene N trabajadores, se pide escribir un programa que permita ingresar nombre, horas trabajadas y el valor pagado por hora, y que muestre:

    El nombre y pago de cada trabajador
    El total pagado por la empresa
    El salario promedio por trabajador.
    La suma de todas las letras de los nombres de los trabajadores

    Nota tenga en cuenta que, si el trabajador labora más de 48 horas, se le reconoce un recargo del 25 % por cada hora de más.
*/

package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public static void main(String[] args) {
        
        /**/
        int cantidad_trabajadores;
        cantidad_trabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores a calcular: "));
        
        /**/
        String nombre[] = new String[cantidad_trabajadores];
        int horas_trabajadas[] = new int[cantidad_trabajadores];
        double valor_hora[] = new double[cantidad_trabajadores];
        
        /**/
        double total_pago,recargo, promedio_salario = 0, acumulador = 0, acumulador_letras = 0;
        boolean r;
        
        /**/
        for(int i = 0; i < cantidad_trabajadores; i++){
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del trabajador " + i +": ");
            horas_trabajadas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas de " + nombre[i] +": "));
            valor_hora[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor por hora para " + nombre[i] +": "));
            
            if(horas_trabajadas[i] >= 48){
                recargo = valor_hora[i] * 0.25;
                valor_hora[i] = valor_hora[i] + recargo;
                
                total_pago = valor_hora[i] * horas_trabajadas[i];
                
                r = true;
            }else{
                total_pago = valor_hora[i] * horas_trabajadas[i];
                
                r = false;
            }
            
            acumulador = acumulador + total_pago;
            promedio_salario = acumulador / cantidad_trabajadores;
            
            acumulador_letras = acumulador_letras + nombre[i].length();
            
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre[i] + "\n Horas Trabajadas: " + horas_trabajadas[i] +
            "\n Valor por hora: " + valor_hora[i] + "\n\n" + "Total a pagar: " + total_pago + "\nRecargo: " + r
            );
        }
    
        JOptionPane.showMessageDialog(null, "Promedio de salario: " + promedio_salario + "\nTotal pagado por la empresa : " + acumulador +
        "\nTotal de letras de los nombres: " + acumulador_letras);
        
    }
}
