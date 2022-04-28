package taller.de.buenas.prácticas.de.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase SongLibrary
 * @author edwin
 */

public class SongLibrary implements IFilter{
    /**
     * Lista del objeto tipo Song donde se guardaran todas las canciones
     */
    public List<Song>misCanciones = new ArrayList<>();
    /**
     * Definicion del input
     */
    Scanner input = new Scanner(System.in);
    /**
     * Metodo para agregar canciones a la biblioteca
     */
    public void ingresarCanciones(){
        int cant;
        System.out.println("Cantidad de canciones que desea ingresar");
        cant=input.nextInt();
        for(int i =0; i<cant;i++){
            Song newCanciones = new Song();
            newCanciones.capturarTitulo();
            newCanciones.capturarIdentificador(i);
            newCanciones.capturarAño();
            newCanciones.capturarDuracion();
            newCanciones.capturarGenero();
            newCanciones.capturarCaratula();
            newCanciones.capturarDescripcion();
            misCanciones.add(newCanciones);
            misCanciones.toString();
        }  
        for(Song iteSong: misCanciones){
            iteSong.toString();
        }
    }
    /**
     * Metodo para crear una lista de canciones
     */
    public void CrearPlayList(){        
        PlayList miLista = new PlayList();
        miLista.AgregarCanciones(misCanciones);
    }
    /**
     * Metodo para escoger si filtrar por año o genero
     */
    public void FiltrarLibreria(){
        int a;
        System.out.println("1.  Filtrar por año");
        System.out.println("2.  Filtrar por genero");
        a=input.nextInt();
        if(a==1){
            filterByYear();
        }
        if(a==2){
            filterByGender();
        }
        if(a!=1 && a!=2){
            System.out.println("Opcion incorrecta");
        }
    }
    /**
     * Metodo definido en la interface IFilter para filtrar por año
     */
    @Override
    public void filterByYear() {
        int año;
        System.out.println("Ingrese el año");
            año=input.nextInt();
            for(Song iteSong: misCanciones){
                if(iteSong.getYear()==año){
                    System.out.println(iteSong.toString()); 
                }
            }
    }
    /**
     * Metodo definido en la interface IFilter para ordenar por genero
     */

    @Override
    public void filterByGender() {
        String genero;
        System.out.println("Ingrese el genero");
            genero=input.nextLine();
            for(Song iteSong: misCanciones){
                if(iteSong.getGener().equals(genero)){
                    System.out.println(iteSong.toString()); 
                }
            }
    }

    
}
