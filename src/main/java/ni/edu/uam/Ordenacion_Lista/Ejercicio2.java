package ni.edu.uam.Ordenacion_Lista;

// Crear una lista de nombres y ordenarla alfabéticamente.

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        int valor, opcion = 0;
        String nombre;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar nombres. \n2. Ver nombres ingresados. \n3. Ordenar nombres alfabéticamente. \n4. Salir. \nDigite una opción: "));
                switch (opcion) {
                    case 1:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de nombres a ingresar: "));
                        for (int i = 1; i <= valor; i++) {
                            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre #" + i + ": ");
                            nombres.add(nombre);
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Nombres ingresados: " + nombres);
                        break;
                    case 3:
                        Collections.sort(nombres);
                        JOptionPane.showMessageDialog(null, "Nombres ordenados alfabéticamente: \n" + nombres);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
            }
        } while (opcion != 4);
    }
}
