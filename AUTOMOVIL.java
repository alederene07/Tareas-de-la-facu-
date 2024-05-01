/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

class Registro {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String numeroChasis;
    private String color;

    public Registro(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarRegistro() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de Chasis: " + numeroChasis);
        System.out.println("Color: " + color);
    }
}

public class Main {
    private static ArrayList<Registro> registros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println(" Menú Principal ");
        System.out.println("1. Crear un Registro");
        System.out.println("2. Buscar un Registro");
        System.out.println("3. Editar un Registro");
        System.out.println("4. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                crearRegistro();
                break;
            case 2:
                buscarRegistro();
                break;
            case 3:
                editarRegistro();
                break;
            case 4:
                System.out.println("Saliendo");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida.");
                mostrarMenuPrincipal();
                break;
        }
    }

    private static void crearRegistro() {
        System.out.println("Ingrese el ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la Marca:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el Modelo:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese el Año:");
        int año = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el Tipo:");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese el Número de Chasis:");
        String numeroChasis = scanner.nextLine();

        System.out.println("Ingrese el Color:");
        String color = scanner.nextLine();

        Registro nuevoRegistro = new Registro(id, marca, modelo, año, tipo, numeroChasis, color);

        registros.add(nuevoRegistro);

        System.out.println("Registro creado exitosamente.");

        mostrarMenuPrincipal();
    }

    private static void buscarRegistro() {
        System.out.println("Ingrese el ID del registro a buscar:");
        int idBuscado = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getId() == idBuscado) {
                registro.mostrarRegistro();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Registro no encontrado.");
        }

        mostrarMenuPrincipal();
    }

    private static void editarRegistro() {
        System.out.println("Ingrese el ID del registro a editar:");
        int idEditar = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getId() == idEditar) {
                System.out.println("Ingrese la nueva Marca:");
                registro.setMarca(scanner.nextLine());

                System.out.println("Ingrese el nuevo Modelo:");
                registro.setModelo(scanner.nextLine());

                System.out.println("Ingrese el nuevo Año:");
                registro.setAño(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Ingrese el nuevo Tipo:");
                registro.setTipo(scanner.nextLine());

                System.out.println("Ingrese el nuevo Número de Chasis:");
                registro.setNumeroChasis(scanner.nextLine());

                System.out.println("Ingrese el nuevo Color:");
                registro.setColor(scanner.nextLine());

                System.out.println("Registro editado exitosamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Registro no encontrado.");
        }

        mostrarMenuPrincipal();
    }
}

