/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Entidades;

/**
 *
 * @author Mrp
 */
public class Libro {
   public int isbn;
   public String titulo;
   public String autor;
   public int numPagina;

    public Libro(int isbn, String titulo, String autor, int numPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }

    public Libro() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + '}';
    }

   

    
    
    
    
}
