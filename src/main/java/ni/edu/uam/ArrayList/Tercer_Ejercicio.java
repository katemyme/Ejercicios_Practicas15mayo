package ni.edu.uam.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Tercer_Ejercicio {

    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        boolean continuar = true;

        String menu = "MENÚ DE PRODUCTOS\n" +
                "1. Agregar producto\n" +
                "2. Mostrar productos\n" +
                "3. Mostrar cantidad de productos\n" +
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

                        String producto = JOptionPane.showInputDialog(
                                "Ingrese el nombre del producto:"
                        );

                        productos.add(producto);

                        JOptionPane.showMessageDialog(null,
                                "Producto agregado correctamente.");

                        break;

                    case 2:

                        if (productos.isEmpty()) {

                            JOptionPane.showMessageDialog(null,
                                    "No hay productos registrados.");

                        } else {

                            String lista = "Lista de productos:\n";

                            for (String p : productos) {

                                lista += "- " + p + "\n";
                            }

                            JOptionPane.showMessageDialog(null, lista);
                        }

                        break;

                    case 3:

                        JOptionPane.showMessageDialog(null,
                                "Cantidad de productos registrados: "
                                        + productos.size());

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