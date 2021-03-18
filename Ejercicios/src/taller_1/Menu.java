package taller_1;

import javax.swing.*;

public class Menu  {


    public static void main(String[] args) {     
        
        Ejercicio_1 notasAsignatura = new Ejercicio_1();
        Ejercicio_2 edadPersonas = new Ejercicio_2();
        Ejercicio_3 notasEstudiantes = new Ejercicio_3();
        Ejercicio_4 digitosNumeros = new Ejercicio_4();
        Ejercicio_5 cuadrado = new Ejercicio_5();

        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion entre 1 y 5"));

        switch (opcion ) {
            case 1:
                notasAsignatura.notasAsignatura();
                break;
            case 2:
                edadPersonas.edadPersonas();
                break;
            case 3:
                notasEstudiantes.notasEstudiantes();
                break;
            case 4:
                digitosNumeros.digitosNumeros();
                break;
            case 5:
                cuadrado.cuadradoNumero();
                break;
            default:
                System.out.println("Error, opcion digitada incorrecta... ");
        }

    }

}
