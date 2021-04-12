import java.util.Date;

public class Reserva {
    private Libro libro;
    private Date fecha;

    public Reserva(Libro libro, Date fecha) {
        this.libro = libro;
        this.fecha = fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Reserva(){}
}


