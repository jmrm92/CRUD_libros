package com.curso.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.model.Libro;
import com.curso.demo.service.LibrosServiceImpl;

@RestController
public class LibrosController {
@Autowired
LibrosServiceImpl service;

@GetMapping(value="libros", produces=MediaType.APPLICATION_JSON_VALUE)
public List<Libro> libros(){
return service.libros();
}

@GetMapping(value="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
public Libro buscarLibro(@PathVariable("isbn") String isbn) {
return service.obtenerLibro(isbn);
}
@PostMapping(value="libro", consumes=MediaType.APPLICATION_JSON_VALUE)
public void agregar(Libro libro) {
service.crearLibro(libro);
}
@PutMapping(value="libro", consumes=MediaType.APPLICATION_JSON_VALUE)
public void actualizar(String isbn, Libro libro) {
service.actualizarLibro(isbn, libro);
}

@DeleteMapping(value="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
public void eliminar(@PathVariable("isbn") String isbn){
        service.eliminarLibro(isbn);
    }
}
