package modelo;

import java.util.List;

public class Libro {
    private String nombre;
    private List<String> autores;
    private int anoEdicion;
    private boolean edicionDeLujo;
    private String nombreColeccion;
    private int numeroEnColeccion;

    public Libro(String nombre, List<String> autores, int anoEdicion, boolean edicionDeLujo) {
        this.nombre = nombre;
        this.autores = autores;
        this.anoEdicion = anoEdicion;
        this.edicionDeLujo = edicionDeLujo;
        this.nombreColeccion = null;
        this.numeroEnColeccion = 0;
    }

    public Libro(String nombre, List<String> autores, int anoEdicion, boolean edicionDeLujo,
                 String nombreColeccion, int numeroEnColeccion) {
        this.nombre = nombre;
        this.autores = autores;
        this.anoEdicion = anoEdicion;
        this.edicionDeLujo = edicionDeLujo;
        this.nombreColeccion = nombreColeccion;
        this.numeroEnColeccion = numeroEnColeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getAutores() {
        return autores;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public boolean isEdicionDeLujo() {
        return edicionDeLujo;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public int getNumeroEnColeccion() {
        return numeroEnColeccion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro: ").append(nombre).append("\n");
        sb.append("Autor(es): ");
        if (autores.size() > 2) {
            sb.append(autores.get(0)).append(" y otros");
        } else {
            sb.append(String.join(", ", autores));
        }
        sb.append("\nAño de edición: ").append(anoEdicion).append("\n");
        sb.append("Edición de lujo: ").append(edicionDeLujo).append("\n");
        if (nombreColeccion != null) {
            sb.append("Colección: ").append(nombreColeccion).append("\n");
            sb.append("Número en la colección: ").append(numeroEnColeccion).append("\n");
        }
        return sb.toString();
    }
}


