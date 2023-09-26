package com.curso.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.curso.demo.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService {

    private List<Libro> listaLibros;

    public LibrosServiceImpl() {

        listaLibros = new ArrayList<>();

        listaLibros.add(new Libro("1", "Libro 1", 1));
    }

    @Override
    public Libro crearLibro(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    @Override
    public Libro obtenerLibro(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> obtenerTodosLibros() {
        return listaLibros;
    }

    @Override
    public Libro actualizarLibro(String isbn, Libro libro) {
        for (int i = 0; i < listaLibros.size();) {
            if (listaLibros.get(i).getIsbn().equals(isbn)) {
                listaLibros.set(i, libro);
                
            }
            return libro;        
        }
        return null;
    }

    @Override
    public void eliminarLibro(String isbn) {
        listaLibros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    @Override
    public List<Libro> libros() {
        return listaLibros;
    }


}
