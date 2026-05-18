package ni.edu.uam.Ordenacion_Lista;

// Crear un programa que ordene números en forma descendente.

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int valor, opcion = 0, numero;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar números. \n2. Ver números ingresados. \n3. Ordenar números. \n4. Salir. \nDigite una opción: "));
                switch (opcion) {
                    case 1:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de números a ingresar: "));
                        for (int i = 1; i <= valor; i++) {
                            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor #" + i + ": "));
                            numeros.add(numero);
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Números ingresados: \n" + numeros);
                        break;
                    case 3:
                        Collections.sort(numeros, Collections.reverseOrder());
                        JOptionPane.showMessageDialog(null, "Números ordenados descendentemente: \n" + numeros);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
            }
        } while (opcion != 4);
    }
}
