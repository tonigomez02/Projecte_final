import java.util.Scanner;

public class Bibliotecario extends Persona {
    private String NIF;
    private String contraseña;
    private String puesto_de_trabajo;

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "NIF='" + NIF + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", puesto_de_trabajo='" + puesto_de_trabajo + '\'' +
                '}';
    }

    public Bibliotecario() {
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        boolean salida = true;
        Scanner scanner = new Scanner(System.in);
        while (salida) {
            if (contraseña.length() >= 8) {
                this.contraseña = contraseña;
                salida = false;
            } else {
                System.out.println("Escribe una contraseña correcta, mínimo 8 caracteres");
                contraseña = scanner.nextLine();
            }
        }

    }


    public Bibliotecario(String nombre, String apellido1, String apeellido2, Integer edad, String NIF, String contraseña, String puesto_de_trabajo) {
        super(nombre, apellido1, apeellido2, edad);
        this.NIF = NIF;
        this.contraseña = contraseña;
        this.puesto_de_trabajo = puesto_de_trabajo;
    }

    public String getPuesto_de_trabajo() {
        return puesto_de_trabajo;
    }

    public void setPuesto_de_trabajo(String puesto_de_trabajo) {
        this.puesto_de_trabajo = puesto_de_trabajo;
    }

    public static void mostrarBibliotecarios(){

        if (Biblioteca.getBibliotecarios().isEmpty()){
            System.out.println("No hay bibliotecarios registrados");
        }else {
            for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
                System.out.println(Biblioteca.getBibliotecarios().get(i).toString());
            }
        }

    }

}
