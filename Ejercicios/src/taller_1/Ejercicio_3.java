/*En un curso de 30 estudiantes, se realizan 4 evaluaciones con los siguientes 
porcentajes: 25%, 20%, 25% 30% respectivamente. Por cada estudiante se ingresan 
cuatro notas. Hacer un algoritmo que muestre la nota definitiva de cada estudiante, la 
nota promedio del grupo y el porcentaje de perdedores.*/
package taller_1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static int contador_perdedores;
    static int porcentaje_perdedores;

    public void notasEstudiantes() {
        /*Constantes*/
        final int estudiantes = 5;

        /*Variables*/
        double acumulador = 0, promedio = 0;



        /*Formato para solo imprimir 2 numeros decimales*/
        DecimalFormat formato = new DecimalFormat("#.00");

        /*Vectores*/
        double nota1[] = new double[estudiantes];
        double nota2[] = new double[estudiantes];
        double nota3[] = new double[estudiantes];
        double nota4[] = new double[estudiantes];
        double definitiva[] = new double[estudiantes];

        for(int i = 0; i < estudiantes; i++){
            nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #1 para el estudiante " + i));
            nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #2 para el estudiante " + i));
            nota3[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #3 para el estudiante " + i));
            nota4[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #4 para el estudiante " + i));

            definitiva[i] = (nota1[i] * 0.25) + (nota2[i] * 0.2) + (nota3[i] * 0.25) + (nota4[i] * 0.3);

            if(definitiva[i] < 3.0){
                contador_perdedores += 1;
            }

            acumulador = acumulador + definitiva[i];

            JOptionPane.showMessageDialog(null,"La nota definitiva para el estudiante #" + i + " es de: " + formato.format(definitiva[i]));

            /*Centinela*/
            System.out.println(contador_perdedores);

        }

        promedio = acumulador / estudiantes;

        /*CORREGIR!!!!!!!!!!!!!!!! No funciona, retorna 0*/



        //porcentaje_perdedores = Double.parseDouble(contador_perdedores / estudiantes);
        /*Centinela*/
        System.out.println(contador_perdedores);
        /*-------------------------------------------------*/

        /*Centinela 2*/
        System.out.println(" centinela 2 " + porcentaje_perdedores);

        JOptionPane.showMessageDialog(null,"Resultados:" + "\nNota promedio: " + promedio + "\nPorcentaje Perdedores: " + porcentaje_perdedores + "%");

    }



}
