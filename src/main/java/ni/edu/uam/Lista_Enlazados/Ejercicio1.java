package ni.edu.uam.Lista_Enlazados;

import javax.swing.*;
import java.util.LinkedList;

public class Ejercicio1 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        int valor;
        try {
            do {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número (0 para terminar): "));
                if (valor != 0) {
                    numeros.add(valor);
                }
            } while (valor != 0);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");
        }
        JOptionPane.showMessageDialog(null, "Valores ingresados: " + numeros);
    }
}
