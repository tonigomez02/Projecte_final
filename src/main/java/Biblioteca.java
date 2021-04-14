
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> lista_libros = new ArrayList<Libro>();
    private List<Persona> lista_personas=new ArrayList<Persona>();

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

    public List<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }

    public List<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(List<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

    public Biblioteca(String nombre, List<Libro> lista_libros, List<Persona> lista_personas) {
        this.nombre = nombre;
        this.lista_libros = lista_libros;
        this.lista_personas = lista_personas;
    }

    public Biblioteca(){

    }

    public void añadirLibro(Libro libro){
        getLista_libros().add(libro);
    }
}
