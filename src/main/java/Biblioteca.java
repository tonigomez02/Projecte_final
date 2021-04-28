

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private static List<Libro> lista_libros = new ArrayList<>();
    private static List<Usuario> lista_usuarios = new ArrayList<>();
    private static List<Bibliotecario> bibliotecarios = new ArrayList<>();
    private static Integer contador = 1;

    @Override
    public String toString() {
        return "\n" + "Biblioteca " +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public static List<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }

    public static void setLista_usuarios(List<Usuario> lista_usuarios) {
        Biblioteca.lista_usuarios = lista_usuarios;
    }

    public static List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public static void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        Biblioteca.bibliotecarios = bibliotecarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String lletraNom = String.valueOf(nombre.charAt(0));
        String lletraClau = String.valueOf(nombre.toUpperCase().charAt(0));
        if (lletraNom.equals(lletraClau)) {
            this.nombre = nombre;
            System.out.println("Se añadido el nombre correctamente");
            Utils.setSalida(false);
        } else {
            System.out.println("El nom es incorrecte. Escriu en majúscula la primera lletra");
        }

    }

    public static List<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List<Libro> lista_libros) {
        Biblioteca.lista_libros = lista_libros;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Biblioteca.contador = contador;
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public Biblioteca() {

    }

    public static void añadirLibroUnico(Libro libro) {
        //Añadir el primer Libro sin control de ISBN
        getLista_libros().add(libro);
    }

    public static void añadirLibro(Libro libro) {
        boolean entrada = true;
        int ayuda = 0;
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {

            if (entrada) {
                if (Biblioteca.getLista_libros().get(i).getISBN().equals(libro.getISBN())) {
                    Biblioteca.getLista_libros().get(i).setNº_copias(Biblioteca.getLista_libros().get(i).getNº_copias() + 1);
                    Biblioteca.getLista_libros().get(i).setNº_copias_disponibles(Biblioteca.getLista_libros().get(i).getNº_copias_disponibles() + 1);
                    entrada = false;
                } else {
                    ayuda += 1;
                }
            }

        }
        if (ayuda == Biblioteca.getContador()) {
            getLista_libros().add(libro);
            Biblioteca.setContador(Biblioteca.getContador() + 1);
        }
    }

    public static void añadirUsuarioUnico(Usuario usuario) {
        getLista_usuarios().add(usuario);
    }

    public static void añadirUsuario(Usuario usuario) {
        boolean salida = true;
        int ayuda = 0;
        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
            if (salida) {
                if (Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
                    System.out.println("Este usuario ya existe");
                    salida = false;
                } else {
                    ayuda += 1;
                }
            }

        }
        if (ayuda == Biblioteca.getLista_usuarios().size()) {
            getLista_usuarios().add(usuario);
            System.out.println("Usuario registrado correctamente");
        }

    }

    public static void añadirBibliotecarioUnico(Bibliotecario bibliotecario) {
        getBibliotecarios().add(bibliotecario);
    }

    public static void añadirBibliotecario(Bibliotecario bibliotecario) {
        boolean salida = true;
        int ayuda = 0;
        for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
            if (salida) {
                if (Biblioteca.getBibliotecarios().get(i).getNIF().equals(bibliotecario.getNIF())) {
                    System.out.println("Este bibliotecario ya existe");
                    salida = false;
                } else {
                    ayuda += 1;
                }
            }

        }
        if (ayuda == Biblioteca.getBibliotecarios().size()) {
            getBibliotecarios().add(bibliotecario);
            System.out.println("Bibliotecario registrado correctamente");
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
            System.out.println(Biblioteca.getLista_libros().get(i).toString());
        }
    }
}
