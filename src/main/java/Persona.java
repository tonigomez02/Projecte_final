import java.util.Scanner;

public abstract class  Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private static boolean salidaLogInUsuario = true;
    private static boolean salidaLogInBibliotecario = true;

    public Persona(String nombre, String apellido1, String apeellido2, Integer edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apeellido2;
        this.edad = edad;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApeellido2() {
        return apellido2;
    }

    public void setApeellido2(String apeellido2) {
        this.apellido2 = apeellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public static boolean isSalidaLogInUsuario() {
        return salidaLogInUsuario;
    }

    public static void setSalidaLogInUsuario(boolean salidaLogInUsuario) {
        Persona.salidaLogInUsuario = salidaLogInUsuario;
    }

    public static boolean isSalidaLogInBibliotecario() {
        return salidaLogInBibliotecario;
    }

    public static void setSalidaLogInBibliotecario(boolean salidaLogInBibliotecario) {
        Persona.salidaLogInBibliotecario = salidaLogInBibliotecario;
    }

    public static void cambiarContraseña(Integer opcion) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean contraCorrecta = true;
        boolean telefonoCorrecto = true;
        boolean entrada = false;
        Integer index = 0;

        if (opcion.equals(1)) {

            System.out.println("Bienvenido al cambio de contraseña de bibliotecario");
            System.out.println("Escriba el NIF del biobliotecario que quiere cambiar su contraseña");
            String nif = scanner1.nextLine();
            for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
                if (Biblioteca.getBibliotecarios().get(i).getNIF().equals(nif)) {
                    index = Biblioteca.getBibliotecarios().indexOf(Biblioteca.getBibliotecarios().get(i));
                    entrada = true;

                }

            }
            if (entrada) {
                while (contraCorrecta) {
                    System.out.println("Escriba la nueva contraseña");
                    String contraseña1 = scanner2.nextLine();
                    System.out.println("Escribe de nuevo la contraseña");
                    String contraseña2 = scanner2.nextLine();
                    if (contraseña1.equals(contraseña2)) {
                        Biblioteca.getBibliotecarios().get(index).setContraseña(contraseña1);
                        System.out.println("Contraseña cambiada");
                        contraCorrecta = false;
                    } else {
                        System.out.println("Escribe bien la contraseña");

                    }
                }

            } else {
                System.out.println("Bibliotecario no encontrado o credenciales incorrectas");
            }

        } else if (opcion.equals(2)) {

            System.out.println("Bienvenido al cambio de telefono de usuario");
            System.out.println("Escriba el correo electronico del usuario al que quiere cambiar su telefono");
            String correoElec = scanner1.nextLine();
            for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
                if (Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(correoElec)) {
                    index = Biblioteca.getLista_usuarios().indexOf(Biblioteca.getLista_usuarios().get(i));
                    entrada = true;
                }

            }
            if (entrada) {
                while (telefonoCorrecto) {
                    System.out.println("Escribe el nuevo telefono");
                    Integer telefono1 = scanner2.nextInt();
                    System.out.println("Escribe de nuevo el telefono");
                    Integer telefono2 = scanner2.nextInt();
                    if (telefono1.equals(telefono2)) {
                        Biblioteca.getLista_usuarios().get(index).setTelefono(telefono1);
                        System.out.println("Telefono cambiado");
                        telefonoCorrecto = false;
                    } else {
                        System.out.println("Escriba bien el telefono");

                    }
                }

            } else {
                System.out.println("Bibliotecario no encontrado o credenciales incorrectas");
            }

        }
    }

    public static void eliminarPersonal() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner tipoPersonal = new Scanner(System.in);
        Integer index = 0;
        boolean entradaBibliotecario = false;
        boolean entradaUsuario = false;

        System.out.println("1- Para eliminar bibliotecarios");
        System.out.println("2- Para eliminar usuarios");
        Integer opcion = tipoPersonal.nextInt();


        if (opcion.equals(1)) {
            System.out.println("NIF del bibliotecario");
            String nif = scanner1.nextLine();
            for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
                if (Biblioteca.getBibliotecarios().get(i).getNIF().equals(nif)) {
                    index = Biblioteca.getBibliotecarios().indexOf(Biblioteca.getBibliotecarios().get(i));
                    entradaBibliotecario = true;
                }

            }
            if (entradaBibliotecario) {
                if (!(Biblioteca.getBibliotecarios().size() == 1)){
                    Biblioteca.getBibliotecarios().remove(Biblioteca.getBibliotecarios().get(index));
                    System.out.println("Bibliotecario elimando correctamente");
                }else {
                    System.out.println("No se pudo eliminar al bibliotecario");
                }

            } else {
                System.out.println("Bibliotecario no encontrado o credenciales incorrectas");
            }

        } else if (opcion.equals(2)) {
            System.out.println("Correo del usuario");
            String correoElec = scanner2.nextLine();
            for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
                if (Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(correoElec)) {
                    index = Biblioteca.getLista_usuarios().indexOf(Biblioteca.getLista_usuarios().get(i));
                    entradaUsuario = true;
                }

            }
            if (entradaUsuario) {
                Biblioteca.getLista_usuarios().remove(Biblioteca.getLista_usuarios().get(index));
                System.out.println("Usuario elimando correctamente");
            } else {
                System.out.println("Usuario no encontrado o credenciales incorrectas");
            }
        }

    }

    public static void solicitarDatosPersona() {
        Scanner tipoPersonal = new Scanner(System.in);

        System.out.println("1- Crear un nuevo bibliotecario");
        System.out.println("2- Crear un nuevo usuario");
        Integer opcion = tipoPersonal.nextInt();

        if (opcion.equals(1)) {

            Scanner recogidaDatos = new Scanner(System.in);
            Bibliotecario bibliotecario = new Bibliotecario();

            System.out.println("Crear nuevos bibliotecarios");
            System.out.println("Nombre del bibliotecario:");
            String nombre = recogidaDatos.nextLine();
            bibliotecario.setNombre(nombre);
            System.out.println("Primer apellido del bibliotecario:");
            String apellido1 = recogidaDatos.nextLine();
            bibliotecario.setApellido1(apellido1);
            System.out.println("Segundo apellido del bibliotecario:");
            String apellido2 = recogidaDatos.nextLine();
            bibliotecario.setApeellido2(apellido2);
            System.out.println("Edad del usuario:");
            Integer edad = Integer.valueOf(recogidaDatos.nextLine());
            bibliotecario.setEdad(edad);
            System.out.println("NIF del bibliotecario (con letra):");
            String nif = recogidaDatos.nextLine();
            bibliotecario.setNIF(nif);
            System.out.println("Contraseña del bibliotecario:");
            String contraseña = recogidaDatos.nextLine();
            bibliotecario.setContraseña(contraseña);
            System.out.println("Puesto de trabajo: ");
            String puestoTrabajo = recogidaDatos.nextLine();
            bibliotecario.setPuesto_de_trabajo(puestoTrabajo);
            Biblioteca.añadirBibliotecario(bibliotecario);

        } else if (opcion.equals(2)) {

            Scanner recogidaDatos = new Scanner(System.in);
            Usuario usuario = new Usuario();

            System.out.println("Crear nuevos usuarios");
            System.out.println("Nombre del usuario:");
            String nombre = recogidaDatos.nextLine();
            usuario.setNombre(nombre);
            System.out.println("Primer apellido del usuario:");
            String apellido1 = recogidaDatos.nextLine();
            usuario.setApellido1(apellido1);
            System.out.println("Segundo apellido del usuario:");
            String apellido2 = recogidaDatos.nextLine();
            usuario.setApeellido2(apellido2);
            System.out.println("Edad del usuario:");
            Integer edad = Integer.valueOf(recogidaDatos.nextLine());
            usuario.setEdad(edad);
            System.out.println("Telefono del usuario:");
            Integer telefono = Integer.valueOf(recogidaDatos.nextLine());
            usuario.setTelefono(telefono);
            System.out.println("Dirección del usuario:");
            String direccion = recogidaDatos.nextLine();
            usuario.setDirección(direccion);
            System.out.println("Codigo postal del usuario:");
            Integer codiPostal = recogidaDatos.nextInt();
            usuario.setCodigo_postal(codiPostal);
            System.out.println("Correo electronico del usuario:");
            String codiElec = recogidaDatos.nextLine();
            usuario.setCorreo_electronico(codiElec);
            Biblioteca.añadirUsuario(usuario);
        }
    }

    public static void logInPersona(Integer opcion){

        if (opcion.equals(1)){

            Scanner recogidaDatos = new Scanner(System.in);
            Scanner recogidaDatos2 = new Scanner(System.in);
            Integer ayuda = 0;
            Integer output = 0;
            Integer index = 0;

            while (Bibliotecario.isSalidaLogInBibliotecario() && ayuda == 0) {
                System.out.println("1- Para salir");
                System.out.println("2- Log in");
                output = recogidaDatos.nextInt();

                switch (output) {

                    case 1:
                        ayuda = 1;
                        break;

                    //refactorizar
                    case 2:
                        System.out.println("NIF: ");
                        String nif = recogidaDatos2.nextLine();
                        System.out.println("Contrasenya: ");
                        String contrasenya = recogidaDatos2.nextLine();

                        for (int i = 0; i < Biblioteca.getBibliotecarios().size(); i++) {
                            if (Biblioteca.getBibliotecarios().get(i).getNIF().equals(nif)
                                    && Biblioteca.getBibliotecarios().get(i).getContraseña().equals(contrasenya)) {
                                index = Biblioteca.getBibliotecarios().indexOf(Biblioteca.getBibliotecarios().get(i));

                            } else {
                                ayuda += 1;
                            }
                        }
                        if (ayuda == Biblioteca.getBibliotecarios().size()) {
                            System.out.println("Log in incorrecto");
                        } else {
                            System.out.println("Log in completado");
                            Biblioteca.setBibliotecarioActual(Biblioteca.getBibliotecarios().get(index));
                            setSalidaLogInBibliotecario(false);

                        }

                        break;
                }


            }

        }else if (opcion.equals(2)){

            Scanner recogidaDatos = new Scanner(System.in);
            Scanner recogidaDatos2 = new Scanner(System.in);
            Integer ayuda = 0;
            Integer output = 0;
            Integer index = 0;

            while (isSalidaLogInUsuario() && ayuda == 0) {
                System.out.println("1- Para salir");
                System.out.println("2- Log in");
                output = recogidaDatos.nextInt();

                switch (output) {

                    case 1:
                        ayuda = 1;
                        break;

                    //refactorizar
                    case 2:
                        System.out.println("Correo electrónico: ");
                        String correo_elec = recogidaDatos2.nextLine();
                        System.out.println("Telefono: ");
                        Integer telefono = recogidaDatos2.nextInt();

                        for (int i = 0; i < Biblioteca.getLista_usuarios().size(); i++) {
                            if (Biblioteca.getLista_usuarios().get(i).getCorreo_electronico().equals(correo_elec)
                                    && Biblioteca.getLista_usuarios().get(i).getTelefono().equals(telefono)) {
                                index = Biblioteca.getLista_usuarios().indexOf(Biblioteca.getLista_usuarios().get(i));

                            } else {
                                ayuda += 1;
                            }
                        }
                        if (ayuda == Biblioteca.getLista_usuarios().size()) {
                            System.out.println("Log in incorrecto");
                        } else {
                            System.out.println("Log in completado");
                            setSalidaLogInUsuario(false);
                            Biblioteca.setUsuarioActual(Biblioteca.getLista_usuarios().get(index));
                        }

                        break;
                }


            }

        }

    }

}

