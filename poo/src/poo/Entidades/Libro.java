/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Entidades;

import java.util.Scanner;

/**
 *
 * @author Mrp
 */
public class Libro {
    Scanner reader = new Scanner(System.in);
   public int isbn;
   public String titulo;
   public String autor;
   public int numPagina;

    public Libro() {
    }
    
    public Libro(int isbn, String titulo, String autor, int numPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
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
    
//    metodo para registrar los libros
    
    public Libro nuevoLibro(){
        Libro  regLibro= new Libro(reader.nextInt(), reader.next(),reader.next(), reader.nextInt());
    return regLibro;    
    
//    
    }
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + '}';
    }

   

    
    
    
    
}
