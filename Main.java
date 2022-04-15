
package taller.de.buenas.prácticas.de.poo;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static boolean bandera=true;
    private static int opcion;
    public static void main(String[] args) throws IOException{
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }
    private static void menu() {
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Ingresar una cancion");
        System.out.println("2. Filtar las canciones existentes");
        System.out.println("3. Crear una playlist");
        System.out.println("0. Salir del programa");
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
        }
}