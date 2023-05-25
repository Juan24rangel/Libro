package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre del libro (o 'salir' para terminar):");
            String nombre = scanner.nextLine();
            if (nombre.equals("salir")) {
                break;
            }

            System.out.println("Ingrese el nombre del autor o autores (separados por comas):");
            String autoresInput = scanner.nextLine();
            List<String> autores = new ArrayList<>();
            for (String autor : autoresInput.split(",")) {
                autores.add(autor.trim());
            }

            System.out.println("Ingrese el año de edición:");
            int anoEdicion = Integer.parseInt(scanner.nextLine());

            System.out.println("¿Es una edición de lujo? (true/false):");
            boolean edicionDeLujo = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("¿Pertenece a una colección? (true/false):");
            boolean perteneceColeccion = Boolean.parseBoolean(scanner.nextLine());

            if (perteneceColeccion) {
                System.out.println("Ingrese el nombre de la colección:");
                String nombreColeccion = scanner.nextLine();
                System.out.println("Ingrese el número del libro en la colección:");
                int numeroEnColeccion = Integer.parseInt(scanner.nextLine());
                libros.add(new Libro(nombre, autores, anoEdicion, edicionDeLujo, nombreColeccion, numeroEnColeccion));
            } else {
                libros.add(new Libro(nombre, autores, anoEdicion, edicionDeLujo));
            }
        }

        System.out.println("\n--- Libros registrados ---");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

