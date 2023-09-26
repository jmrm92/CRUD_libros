package com.curso.demo.model;

public class Libro {
    
        private String isbn;
        private String titulo;
        private int edicion;
    
        public Libro(String isbn, String titulo, int edicion) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.edicion = edicion;
        }

        public String getIsbn() {
            return isbn;
        }
    
        public String getTitulo() {
            return titulo;
        }
    
        public int getEdicion() {
            return edicion;
        }
    
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
    
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        public void setEdicion(int edicion) {
            this.edicion = edicion;
        }
    }

