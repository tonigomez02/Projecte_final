

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private static List<Libro> lista_libros = new ArrayList<>();
    private static List<Usuario> lista_usuarios = new ArrayList<>();
    private static List<Bibliotecario> bibliotecarios = new ArrayList<>();
    private  static List<Reserva> lista_reservas_biblioteca = new ArrayList<>();
    private static Integer contador = 1;
    private static Bibliotecario bibliotecarioActual;
    private static Usuario usuarioActual;

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
            System.out.println("El nombre es incorrecto, escibre la primera letra en mayúscula");
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

    public static List<Reserva> getLista_reservas_biblioteca() {
        return lista_reservas_biblioteca;
    }

    public static void setLista_reservas_biblioteca(List<Reserva> lista_reservas_biblioteca) {
        Biblioteca.lista_reservas_biblioteca = lista_reservas_biblioteca;
    }

    public static Bibliotecario getBibliotecarioActual() {
        return bibliotecarioActual;
    }

    public static void setBibliotecarioActual(Bibliotecario bibliotecarioActual) {
        Biblioteca.bibliotecarioActual = bibliotecarioActual;
    }

    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(Usuario usuarioActual) {
        Biblioteca.usuarioActual = usuarioActual;
    }

    public static void añadirLibro(Libro libro) {
        Integer index = 0;
        boolean amiga = false;

        for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
            if (Biblioteca.getLista_libros().get(i).getISBN().equals(libro.getISBN())) {
                index = Biblioteca.getLista_libros().indexOf(Biblioteca.getLista_libros().get(i));
                amiga = true;
            }
        }
        if (amiga) {
            Biblioteca.getLista_libros().get(index).setNº_copias(Biblioteca.getLista_libros().get(index).getNº_copias() + 1);
            Biblioteca.getLista_libros().get(index).setNº_copias_disponibles(Biblioteca.getLista_libros().get(index).getNº_copias_disponibles() + 1);
        } else {
            getLista_libros().add(libro);
            Biblioteca.setContador(Biblioteca.getContador() + 1);
        }
    }

    public static void añadirUsuario(Usuario usuario) {
        boolean ayuda = false;

        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
            if (Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
                ayuda = true;
            }
        }

        if (ayuda) {
            System.out.println("Este usuario ya existe, no se ha añadido a la base de datos");
        } else {
            getLista_usuarios().add(usuario);
            System.out.println("Usuario registrado correctamente");
        }

    }

    public static void añadirBibliotecario(Bibliotecario bibliotecario) {
        boolean ayuda = false;

        for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
            if (Biblioteca.getBibliotecarios().get(i).getNIF().equals(bibliotecario.getNIF())) {
                ayuda = true;
            }
        }

        if (ayuda) {
            System.out.println("Este bibliotecario ya existe");
        } else {
            getBibliotecarios().add(bibliotecario);
            System.out.println("Bibliotecario registrado correctamente");
        }
    }

    public void mostrarLibros() {
        if (Biblioteca.getLista_libros().isEmpty()) {
            System.out.println("Lista vacía, no hay libros que mostrar");
        } else {
            for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
                System.out.println(Biblioteca.getLista_libros().get(i).toString());
            }
        }

    }

    public void mostrarLibrosDisponibles(){
        Integer noLibros = 0;

        if (Biblioteca.getLista_libros().isEmpty()) {
            System.out.println("Lista vacía, no hay datos que mostrar");
        } else{
            for (int i = 0; i < Biblioteca.getLista_libros().size(); i++) {
                if (Biblioteca.getLista_libros().get(i).getNº_copias_disponibles() > 0){
                    System.out.println(Biblioteca.getLista_libros().get(i).toString());
                }else {
                    noLibros += 1;
                }

            }
            if (noLibros.equals(Biblioteca.getLista_libros().size())){
                System.out.println("No hay libros disponibles");
            }
        }
    }
}
