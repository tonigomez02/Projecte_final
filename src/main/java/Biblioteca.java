

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private static List<Libro> lista_libros = new ArrayList<Libro>();
    private static List<Persona> lista_personas=new ArrayList<Persona>();
    private static Integer contador=1;

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String lletraNom = String.valueOf(nombre.charAt(0));
        String lletraClau = String.valueOf(nombre.toUpperCase().charAt(0));
        if (lletraNom.equals(lletraClau)){
            this.nombre = nombre;
            System.out.println("Se añadido el nombre correctamente");
        }else {
            System.out.println("El nom es incorrecte. Escriu en majúscula la primera lletra");
        }

    }

    public static List<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List<Libro> lista_libros) {
        Biblioteca.lista_libros = lista_libros;
    }

    public static List<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(List<Persona> lista_personas) {
        Biblioteca.lista_personas = lista_personas;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Biblioteca.contador = contador;
    }

    public Biblioteca(String nombre, List<Libro> lista_libros, List<Persona> lista_personas) {
        this.nombre = nombre;
        Biblioteca.lista_libros = lista_libros;
        Biblioteca.lista_personas = lista_personas;
    }

    public Biblioteca(){

    }

    public static void añadirLibro(Libro libro){
        getLista_libros().add(libro);
    }

    public void mostrarLibros(){
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
            System.out.println(Biblioteca.getLista_libros().get(i).toString());
        }
    }
}
