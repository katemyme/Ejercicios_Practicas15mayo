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