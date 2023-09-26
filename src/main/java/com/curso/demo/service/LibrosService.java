package com.curso.demo.service;

import java.util.List;
import com.curso.demo.model.Libro;

public interface LibrosService {
    
        List<Libro> libros();
        Libro crearLibro(Libro libro);
        Libro obtenerLibro(String isbn);
        List<Libro> obtenerTodosLibros();
        Libro actualizarLibro(String isbn, Libro libro);
        void eliminarLibro(String isbn);
    
}
