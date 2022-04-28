
package taller.de.buenas.prácticas.de.poo;

import java.io.IOException;
import java.util.Scanner;
/**
 * Aplicacion que permite administrar una lista de canciones
 * @author edwin
 */
public class Main {
    /**
     * funcionamiento del menu
     */
    private static boolean bandera=true;
    /**
     * Opcion escogida por el usuario
     */
    private static int opcion;
    /**
     * Lista de objetos de tipo SonLibrary
     */
    private static SongLibrary libreria = new SongLibrary();
    /**
     * Funcionamientos de los metodos dentro de la clase Main
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException{
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
            
        } while (bandera == true);
    }
    /**
     * Menu
     */
    private static void menu() {
        System.out.println("Escoja2. Crear una playlist\" un punto del taller");
        System.out.println("1. Ingresar canciones");
        System.out.println("2. Crear una playlist");
        System.out.println("3. Filtar las canciones existentes");
        System.out.println("0. Salir del programa");
    }
    /**
     * Capturar la opcion ingresada por el usuario
     * @return 
     */
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * Limpia la pantalla
     */
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    /**
     * switch con las opcion que escogio el usuario
     * @param opcion
     * @return
     * @throws IOException 
     */
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {            
            case 1:
                libreria.ingresarCanciones();
                return true;
            case 2:
                PlayList miLista = new PlayList();
                miLista.AgregarCanciones(libreria.misCanciones);
                return true;
            case 3:
                libreria.FiltrarLibreria();
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