package ni.edu.uam.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Segundo_ejercicio {
    public static void main(String[] args) {
        // Creamos el ArrayList para almacenar cadenas de texto (nombres)
        ArrayList<String> estudiantes = new ArrayList<>();
        boolean continuar = true;

        String menu = "MENÚ DE ESTUDIANTES\n" +
                "1. Agregar Estudiante\n" +
                "2. Eliminar Estudiante\n" +
                "3. Ver Lista Actualizada\n" +
                "4. Salir\n" +
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
                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                        estudiantes.add(nuevoNombre);
                        JOptionPane.showMessageDialog(null, "¡Estudiante agregado con éxito!");

                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción numérica válida.");
            }
        }
    }
}
