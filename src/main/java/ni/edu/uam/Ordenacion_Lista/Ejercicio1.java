package ni.edu.uam.Ordenacion_Lista;

// Crear un ArrayList con 5 números y ordenarlos de menor a mayor.

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int valor, opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar datos. \n2. Ver datos. \n3. Ordenar datos. \n4. Salir."));
                switch (opcion) {
                    case 1:
                        for (int i = 1; i <= 5; i++) {
                            try {
                                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número " + i + ":"));
                                numeros.add(valor);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico.");
                            }
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Datos ingresados: " + numeros);
                        break;
                    case 3:
                        Collections.sort(numeros);
                        JOptionPane.showMessageDialog(null, "Números ordenados: " + numeros);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
            }
        } while (opcion != 4);
    }
}
