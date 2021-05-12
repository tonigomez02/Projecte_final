import java.time.LocalDateTime;
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
        boolean entrada = false;
        Scanner scanner = new Scanner(System.in);
        Integer isbn = 0;
        Integer index = 0;
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
            } else {
                ayuda += 1;
            }
        }

        for (int z = 0; z < Biblioteca.getLista_libros().size(); z++) {
            if (Biblioteca.getLista_libros().get(z).getISBN().equals(isbn)) {
                index = Biblioteca.getLista_libros().indexOf(Biblioteca.getLista_libros().get(z));
                entrada = true;
            }

        }

        if (entrada) {
            if (!Biblioteca.getLista_libros().get(index).getNº_copias_disponibles().equals(0)) {

                Reserva reserva = new Reserva();
                reserva.setLibro(Biblioteca.getLista_libros().get(index));
                reserva.setFecha(LocalDateTime.now());
                Biblioteca.getLista_libros().get(index).setNº_copias_disponibles(Biblioteca.getLista_libros().get(index).getNº_copias_disponibles() - 1);
                Biblioteca.getLista_libros().get(index).setReserva(true);
                Usuario.añadirReserva(reserva);
                System.out.println(Biblioteca.getLista_libros().get(index).toString());
                System.out.println("\n" + "Reserva realizada");

            } else {
                System.out.println("No hay copias disponibles");
            }

        } else {
            System.out.println("Libro no encontrado");
        }

        if (ayuda.equals(Biblioteca.getLista_usuarios().size())) {
            System.out.println("No registrado en nuestra base de datos o credenciales incorrectas");
        }

    }


    public static void devolverLibro() {
        boolean entrada = false;
        Scanner scanner = new Scanner(System.in);
        Integer isbn = 0;
        Integer index = 0;
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
            } else {
                ayuda += 1;
            }
        }

        for (int z = 0; z < Biblioteca.getLista_libros().size(); z++) {
            if (Biblioteca.getLista_libros().get(z).getISBN().equals(isbn)) {
                index = Biblioteca.getLista_libros().indexOf(Biblioteca.getLista_libros().get(z));
                entrada = true;
            }

        }

        if (entrada) {
            if (Biblioteca.getLista_libros().get(index).isReserva()) {

                Biblioteca.getLista_libros().get(index).setNº_copias_disponibles(Biblioteca.getLista_libros().get(index).getNº_copias_disponibles() + 1);
                Biblioteca.getLista_libros().get(index).setReserva(false);
                for (int i = 0; i < Usuario.getLista_reservas().size(); i++) {
                    if (Usuario.getLista_reservas().get(i).getLibro().getISBN().equals(isbn)) {
                        Usuario.getLista_reservas().remove(i);
                    }
                }
                System.out.println(Biblioteca.getLista_libros().get(index).toString());
                System.out.println("Devolución realizada");

            } else {
                System.out.println("Este libro no estaba reservado, no se puede devolver");
            }

        }else {
            System.out.println("Libro no encontrado");
        }

        if (ayuda.equals(Biblioteca.getLista_usuarios().size())) {
            System.out.println("No registrado en nuestra base de datos o credenciales incorrectas");
        }

    }

    public static void mostrarReservas() {
        for (int i = 0; i < Usuario.getLista_reservas().size(); i++) {
            System.out.println(Usuario.getLista_reservas().get(i).toString());
        }
    }
}



