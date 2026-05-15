package ni.edu.uam.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Primer_ejercicio {
    public static void main(String[] args) {
        // El ArrayList debe estar afuera para que conserve los datos entre vueltas del menú
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean continuar = true;

        String menu = "MENÚ DE INSERCION DE NUMEROS \n" +
                "1. Agregar Numeros\n" +
                "2. Ver Numeros\n" +
                "3. Salir\n" + // Añadimos opción de salida limpia
                "Seleccione una opción:";
        while (continuar) {
            String opcionStr = JOptionPane.showInputDialog(menu);
            if (opcionStr == null) {
                break;
            }
            try {
                int opcion = Integer.parseInt(opcionStr);
                switch (opcion) {
                    case 1:
                        int cantidad = 5;
                        int i = 0;
                        while (i < cantidad) {
                            String numeroStr = JOptionPane.showInputDialog(
                                    "Ingrese el numero " + (i + 1) + " de " + cantidad);
                            if (numeroStr == null) {
                                JOptionPane.showMessageDialog(null, "Inserción cancelada.");
                                break;
                            }
                            try {
                                int numero = Integer.parseInt(numeroStr);
                                numeros.add(numero);
                                i++;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "¡Error! Ingrese solo números enteros.");
                            }
                        }
                        if (i == cantidad) {
                            JOptionPane.showMessageDialog(null, "Numeros agregados correctamente");
                        }
                        break;
                    case 2:
                        if (numeros.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "La lista está vacía actualmente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista actual: " + numeros);
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                        continuar = false; // Rompe el bucle principal
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número de opción válido.");
            }
        }
    }
}