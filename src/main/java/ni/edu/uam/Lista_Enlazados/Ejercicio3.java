package ni.edu.uam.Lista_Enlazados;

// Crear un LinkedList de productos y eliminar un producto específico.

import javax.swing.*;
import java.util.LinkedList;

public class Ejercicio3 {
    public static void main(String[] args) {
        LinkedList<String> productos = new LinkedList();
        int opcion = 0;
        String producto, productoEliminar;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar Producto. \n2. Ver Productos. \n3. Eliminar Producto. \n4. Salir. \nDigite una opción: "));
                switch (opcion) {
                    case 1:
                        producto = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto: ");
                        productos.add(producto);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Productos ingresados: " + productos);
                        break;
                    case 3:
                        productoEliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a eliminar: ");
                        if (productos.contains(productoEliminar)) {
                            productos.remove(productoEliminar);
                            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                        }else{
                            JOptionPane.showMessageDialog(null, "El producto no existe en la lista.");
                            break;
                        }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida.");
            }
        } while (opcion != 4);
    }
}
