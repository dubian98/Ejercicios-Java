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
        
        /*Creo variable para almacenar la cantidad de trabajadores y al mismo tiempo pido al user la cantidad*/
        int cantidad_trabajadores;
        cantidad_trabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores a calcular: "));
        
        /*Creo vectores para almacenar el nombre, horas trabajadas, valor hora por trabajador*/
        String nombre[] = new String[cantidad_trabajadores];
        int horas_trabajadas[] = new int[cantidad_trabajadores];
        double valor_hora[] = new double[cantidad_trabajadores];
        
        /*Creo variables para realizar calculos con respecto al salario y cantidad de letras de los nombres*/
        double recargo, promedio_salario = 0, acumulador = 0, acumulador_letras = 0, mayor_salario = 0;
        int indice = 0;
        boolean r;
        
        
        double total_pago[] = new double[cantidad_trabajadores];
        
        /*Ciclo para ingresar, calcular y evaluar los datos*/
        for(int i = 0; i < cantidad_trabajadores; i++){
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del trabajador " + i +": ");
            horas_trabajadas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas de " + nombre[i] +": "));
            valor_hora[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor por hora para " + nombre[i] +": "));
            
            if(horas_trabajadas[i] >= 48){
                recargo = valor_hora[i] * 0.25;
                valor_hora[i] = valor_hora[i] + recargo;
                
                total_pago[i] = valor_hora[i] * horas_trabajadas[i];
                
                r = true;
            }else{
                total_pago[i] = valor_hora[i] * horas_trabajadas[i];
                
                r = false;
            }
            
            if(total_pago[i] > mayor_salario){
                mayor_salario = total_pago[i];
            }
            
            
            acumulador = acumulador + total_pago[i];
            promedio_salario = acumulador / cantidad_trabajadores;
            
            acumulador_letras = acumulador_letras + nombre[i].length();
            
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre[i] + "\n Horas Trabajadas: " + horas_trabajadas[i] +
            "\n Valor por hora: " + valor_hora[i] + "\n\n" + "Total a pagar: " + total_pago[i] + "\nRecargo: " + r
            );
        }
        
        for(int x = 0; x < cantidad_trabajadores; x++){
            if(total_pago[x] == mayor_salario){
                indice = x;
                break;
            }
        }
        
        
    
        JOptionPane.showMessageDialog(null, "Promedio de salario: " + promedio_salario + "\nTotal pagado por la empresa : " + acumulador +
        "\nTotal de letras de los nombres: " + acumulador_letras + "\n Mayor salario : " + mayor_salario + "\n\n" + "Nombre del empleado con mayor salario: "
        + nombre[indice].toUpperCase());
        
    }
}
