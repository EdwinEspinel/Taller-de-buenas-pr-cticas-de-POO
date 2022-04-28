package taller.de.buenas.prácticas.de.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Clase tipo PlayList
 * @author edwin
 */
public class PlayList implements IOrder{
    /**
     * Nombre de la lista
     */
    private String name;
    /**
     * Lista de canciones dentro de la lista
     */
    private ArrayList<Song> misCancionesPlay;
    /**
     * Definicion del scaner
     */
    Scanner input = new Scanner(System.in);
    /**
     * Id de la cancion que desea ser agregada
     */
    public int identificador;
    /**
     * Constructor de la clase PlayList
     */
    public PlayList() {
        this.name = name;
        this.misCancionesPlay = misCancionesPlay;
    }
    /**
     * Agregar canciones a la libreria de canciones
     * @param misCanciones 
     */

    public void AgregarCanciones(Iterable<Song> misCanciones) {
        int cant2;
        for (Song iteSong : misCanciones) {
            iteSong.toString();
        }
        System.out.println("Cuantas canciones desea agregar a la lista");
        cant2 = input.nextInt();
        for (int i = 0; i < cant2; i++) {
            System.out.println("Id de la cancion numero " + i + "  que desea agregar");
            identificador = input.nextInt();
            for (Song iteSong : misCanciones) {
                if (iteSong.identificador == identificador) {
                    Song newCanciones = new Song();
                    newCanciones.capturarTitulo2(iteSong.getTitle());
                    newCanciones.capturarIdentificador2(i);
                    newCanciones.capturarAño2(iteSong.getYear());
                    newCanciones.capturarDuracion2(iteSong.getDuration());
                    newCanciones.capturarGenero2(iteSong.getGener());
                    newCanciones.capturarCaratula2(iteSong.isCaratula());
                    newCanciones.capturarDescripcion2(iteSong.getDescription());
                    misCancionesPlay.add(newCanciones);                         
                }
            }
            int eleccion;
            System.out.println("Desea ordenar las canciones por:");
            System.out.println("1... Duracion");
            System.out.println("2... Fecha");
            eleccion = input.nextInt();
            if(eleccion==1){
                orderByDuration();
            }
            if(eleccion==2){
                orderByDate();
            }
            if(eleccion!=1 && eleccion!=2){
                System.out.println("Eleccion incorrecta");
            }
        }
        
    }
    /**
     * Metodo definido en la interface IOrder para ordenar por duracion
     */
    @Override
    public void orderByDuration() {
        int identificadorAux;
        String titleAux;
        int yearAux;
        double durationAux;
        String generAux;
        boolean caratulaAux;
        String descriptionAux;
        double durationTemp;        
        for(Song iteSong : misCancionesPlay){
            durationTemp=iteSong.getDuration();
            for(Song iteSong2 : misCancionesPlay){
                if(iteSong2.getDuration()>durationTemp){
                    identificadorAux=iteSong2.getIdentificador();
                    titleAux=iteSong2.getTitle();
                    generAux=iteSong2.getGener();
                    caratulaAux=iteSong2.isCaratula();
                    yearAux=iteSong2.getYear();
                    durationAux=iteSong2.getDuration();
                    descriptionAux=iteSong2.getDescription();
                    
                    iteSong2.setCaratula(iteSong.isCaratula());
                    iteSong2.setTitle(iteSong.getTitle());
                    iteSong2.setIdentificador(iteSong.getIdentificador());
                    iteSong2.setGener(iteSong.getGener());
                    iteSong2.setYear(iteSong.getYear());
                    iteSong2.setDuration(iteSong.getDuration());
                    iteSong2.setDescription(iteSong.getDescription());
                    
                    iteSong.setCaratula(caratulaAux);
                    iteSong.setTitle(titleAux);
                    iteSong.setIdentificador(identificadorAux);
                    iteSong.setGener(generAux);
                    iteSong.setYear(yearAux);
                    iteSong.setDuration(durationAux);
                    iteSong.setDescription(descriptionAux);
                }
            }
        }        
    }
    /**
     * Metodo definido en la interface IOrder para ordenar por año
     */

    @Override
    public void orderByDate() {
        int identificadorAux;
        String titleAux;
        int yearAux;
        double durationAux;
        String generAux;
        boolean caratulaAux;
        String descriptionAux;
        int añoTemp;  
        for(Song iteSong : misCancionesPlay){
            añoTemp=iteSong.getYear();
            for(Song iteSong2 : misCancionesPlay){
                if(iteSong2.getYear()>añoTemp){
                    identificadorAux=iteSong2.getIdentificador();
                    titleAux=iteSong2.getTitle();
                    generAux=iteSong2.getGener();
                    caratulaAux=iteSong2.isCaratula();
                    yearAux=iteSong2.getYear();
                    durationAux=iteSong2.getDuration();
                    descriptionAux=iteSong2.getDescription();
                    
                    iteSong2.setCaratula(iteSong.isCaratula());
                    iteSong2.setTitle(iteSong.getTitle());
                    iteSong2.setIdentificador(iteSong.getIdentificador());
                    iteSong2.setGener(iteSong.getGener());
                    iteSong2.setYear(iteSong.getYear());
                    iteSong2.setDuration(iteSong.getDuration());
                    iteSong2.setDescription(iteSong.getDescription());
                    
                    iteSong.setCaratula(caratulaAux);
                    iteSong.setTitle(titleAux);
                    iteSong.setIdentificador(identificadorAux);
                    iteSong.setGener(generAux);
                    iteSong.setYear(yearAux);
                    iteSong.setDuration(durationAux);
                    iteSong.setDescription(descriptionAux);
                }
            }
        }
    }
}
