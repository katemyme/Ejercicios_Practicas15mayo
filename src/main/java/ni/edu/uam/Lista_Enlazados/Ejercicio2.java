package ni.edu.uam.Lista_Enlazados;

// Crear un LinkedList de nombres y agregar un nombre al inicio y otro al final.

import javax.swing.*;
import java.util.LinkedList;

public class Ejercicio2 {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();
        int opcion;
        String nombre;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Añadir nombres. \n2. Añadir nombre al inicio. \n3. Añadir nombre al final. \n4. Ver datos ingresados. \n5. Salir. \nDigite una opción: "));
            switch (opcion) {
                case 1:
                    nombre = JOptionPane.showInputDialog(null, "Introduce un nombre: ");
                    nombres.add(nombre);
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog(null, "Introduce un nombre: ");
                    nombres.addFirst(nombre);
                    break;
                case 3:
                    nombre = JOptionPane.showInputDialog(null, "Introduce un nombre: ");
                    nombres.addLast(nombre);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Nombres ingresados: " + nombres);
                    break;
            }
        } while (opcion != 5);
    }
}
