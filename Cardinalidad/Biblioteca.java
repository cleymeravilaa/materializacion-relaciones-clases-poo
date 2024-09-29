package Cardinalidad;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public void mostrarLibros(){
        for(Libro libro : libros){
            System.out.println(libro.getNombre());
        }
    }
}
