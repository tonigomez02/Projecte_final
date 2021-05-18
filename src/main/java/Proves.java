import java.lang.reflect.Array;
import java.util.Arrays;

public class Proves {

    public static void main(String[] args) {

        Utils.inicializar();
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setNIF("Nig");
        Biblioteca.getBibliotecarios().add(bibliotecario);
        Integer contador = 0;

        for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
            if (Biblioteca.getBibliotecarios().get(i).getNIF().equals("12345678A")) {
                contador = Biblioteca.getBibliotecarios().indexOf(Biblioteca.getBibliotecarios().get(i) );
            }

        }

        if (contador == 0) {
            Biblioteca.getBibliotecarios().get(0).setPuesto_de_trabajo("Carpinteria");
        }

        System.out.println(contador);
    }

    /*
    * A realizar:
    * Enseñar nombre biblioteca
    * Eliminar
    *
    * */
}
