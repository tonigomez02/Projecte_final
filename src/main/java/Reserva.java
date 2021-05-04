import java.beans.BeanInfo;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Reserva {

    private Libro libro;
    private LocalDateTime fecha;

    @Override
    public String toString() {
        return
                "\n" + libro + "\n" +
                "Fecha: " + fecha + "\n";
    }

    public Reserva(Libro libro, LocalDateTime fecha) {
        this.libro = libro;
        this.fecha = fecha;
    }

    public Reserva() {
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public static void reservarLibro() {
        Scanner scanner = new Scanner(System.in);
        boolean verificacio = false;
        Integer isbn = 0;
        Integer ayuda = 0;

        System.out.println("Bienvenido a la reserva de libros");
        System.out.println("Solicitar telefono del usuario");
        Integer telefono = scanner.nextInt();
        System.out.println("Solicitar correo electronico");
        String correoElec = scanner.next();
        System.out.println("Datos recogidos");

        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
            if (Biblioteca.getLista_usuarios().get(i).getTelefono().equals(telefono) && Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(correoElec)) {
                System.out.println("ISBN del libro");
                isbn = scanner.nextInt();
                verificacio = true;
            }else {

            }
        }

        if (verificacio) {
            for (int j = 0; j < Biblioteca.getLista_libros().size(); j++) {
                if (Biblioteca.getLista_libros().get(j).getISBN().equals(isbn) && !Biblioteca.getLista_libros().get(j).getNº_copias_disponibles().equals(0)
                        && !Biblioteca.getLista_libros().get(j).isReserva()) {
                    System.out.println(Biblioteca.getLista_libros().get(j).toString());
                    Reserva reserva = new Reserva();
                    reserva.setLibro(Biblioteca.getLista_libros().get(j));
                    reserva.setFecha(LocalDateTime.now());
                    Biblioteca.getLista_libros().get(j).setNº_copias_disponibles(Biblioteca.getLista_libros().get(j).getNº_copias_disponibles() - 1);
                    Biblioteca.getLista_libros().get(j).setReserva(true);
                    Usuario.añadirReserva(reserva);
                    System.out.println("Reserva realizada");

                } else {
                    ayuda += 1;
                }
            }
        } else {
            System.out.println("No está registrado en nuestra base de datos o credenciales incorrectas");
        }

        if (ayuda == Biblioteca.getLista_libros().size()){
            System.out.println("No se ha podido realizar la reserva");
        }

    }

    public static void devolverLibro() {
        Scanner scanner = new Scanner(System.in);
        boolean verificacio = false;
        Integer isbn = 0;
        Integer ayuda = 0;

        System.out.println("Bienvenido a la devolución de libros");
        System.out.println("Solicitar telefono del usuario");
        Integer telefono = scanner.nextInt();
        System.out.println("Solicitar correo electronico");
        String correoElec = scanner.next();
        System.out.println("Datos recogidos");

        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
            if (Biblioteca.getLista_usuarios().get(i).getTelefono().equals(telefono) && Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(correoElec)) {
                System.out.println("ISBN del libro");
                isbn = scanner.nextInt();
                verificacio = true;
            }else {

            }
        }

        if (verificacio) {
            for (int j = 0; j < Biblioteca.getLista_libros().size(); j++) {
                if (Biblioteca.getLista_libros().get(j).getISBN().equals(isbn) && Biblioteca.getLista_libros().get(j).isReserva()) {
                    Biblioteca.getLista_libros().get(j).setNº_copias_disponibles(Biblioteca.getLista_libros().get(j).getNº_copias_disponibles() + 1);
                    Biblioteca.getLista_libros().get(j).setReserva(false);
                    for (int i = 0; i < Usuario.getLista_reservas().size(); i++) {
                        if (Usuario.getLista_reservas().get(i).getLibro().getISBN().equals(isbn)){
                            Usuario.getLista_reservas().remove(i);
                        }
                    }
                    System.out.println(Biblioteca.getLista_libros().get(j).toString());
                    System.out.println("Devolución realizada");

                } else {
                    ayuda += 1;
                }
            }
        } else {
            System.out.println("No está registrado en nuestra base de datos o credenciales incorrectas");
        }

        if (ayuda == Biblioteca.getLista_libros().size()){
            System.out.println("No se ha podido realizar la devolución");
        }

    }

    public static void mostrarReservas() {
        for (int i = 0; i < Usuario.getLista_reservas().size(); i++) {
            System.out.println(Usuario.getLista_reservas().get(i).toString());
        }
    }
}



