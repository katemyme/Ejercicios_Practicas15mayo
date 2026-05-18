package ni.edu.uam.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Segundo_ejercicio {

    public static void main(String[] args) {

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

                        String nuevoNombre = JOptionPane.showInputDialog(
                                "Ingrese el nombre del estudiante:"
                        );

                        estudiantes.add(nuevoNombre);

                        JOptionPane.showMessageDialog(null,
                                "¡Estudiante agregado con éxito!");

                        break;

                    case 2:

                        if (estudiantes.isEmpty()) {

                            JOptionPane.showMessageDialog(null,
                                    "La lista está vacía.");

                        } else {

                            String nombreEliminar = JOptionPane.showInputDialog(
                                    "Ingrese el nombre a eliminar:"
                            );

                            if (estudiantes.remove(nombreEliminar)) {

                                JOptionPane.showMessageDialog(null,
                                        "Estudiante eliminado correctamente.");

                            } else {

                                JOptionPane.showMessageDialog(null,
                                        "El nombre no existe en la lista.");
                            }
                        }

                        break;

                    case 3:

                        if (estudiantes.isEmpty()) {

                            JOptionPane.showMessageDialog(null,
                                    "No hay estudiantes registrados.");

                        } else {

                            String lista = "Lista de estudiantes:\n";

                            for (String estudiante : estudiantes) {

                                lista += estudiante + "\n";
                            }

                            JOptionPane.showMessageDialog(null, lista);
                        }

                        break;

                    case 4:

                        JOptionPane.showMessageDialog(null,
                                "Saliendo del programa...");

                        continuar = false;

                        break;

                    default:

                        JOptionPane.showMessageDialog(null,
                                "Opción inválida.");
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null,
                        "Ingrese solo números.");
            }
        }
    }
}