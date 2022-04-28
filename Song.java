package taller.de.buenas.prácticas.de.poo;

import java.util.Scanner;

/**
 * Clase tipo Song
 * @author edwin
 */

public class Song {
    /**
     * Definicion del scaner
     */
    Scanner input = new Scanner(System.in); 
    /**
     * Id de la cancion
     */
    public int identificador;
    /**
     * Titulo de la cancion
     */
    public String title;
    /**
     * Año que se lanzo la cancion
     */
    public int year;
    /**
     * Duracion de la cancion
     */
    public double duration;
    /**
     * genero de la cancion
     */
    public String gener;
    /**
     * Posee o no caratula la cancion
     */
    public boolean caratula;
    /**
     * Descripcion de la cancion
     */
    public String description;
    /**
     * Constructor de la clase
     */

    public Song() {
        this.identificador = identificador;
        this.title = title;        
        this.year = year;
        this.duration = duration;
        this.gener = gener;
        this.caratula = caratula;
        this.description = description;
    }
    /**
     * Metodo para capturar el titulo
     */
    public void capturarTitulo(){
        System.out.println("Ingrese el nombre de la cancion");
        title=input.nextLine();
    }
    /**
     * Metodo para capturar el Id
     */
    public void capturarIdentificador(int identificador){
        this.identificador = identificador;
    }
    /**
     * Metodo para capturar el año de lanzamiento
     */
    public void capturarAño(){
        System.out.println("Ingrese el año al cual pertenece la cancion");
        year=input.nextInt();
        input.skip("\n");
    }
    /**
     * Metodo para capturar la duracion de la cancion
     */
    public void capturarDuracion(){
        System.out.println("Ingrese la duracion de la cancion (6,25)");
        duration=input.nextDouble();
    }
    /**
     * Metodo para capturar el genero
     */
    public void capturarGenero(){
        System.out.println("Ingrese el genero de la cancion");
        gener=input.nextLine();
    }
    /**
     * Metodo para capturar si existe caratula
     */
    public void capturarCaratula(){
        System.out.println("Ingrese si true si posee una caratula");
        caratula=input.nextBoolean();
    }
    /**
     * Metodo para capturar la descripcion
     */
    public void capturarDescripcion(){
        System.out.println("Agregue una breve descripcion de la cancion");
        description=input.nextLine();
    }   
    
    @Override
    public String toString() {
        return "Song{" + "identificador=" + identificador + ", title=" + title + ", year=" + year + ", duration=" + duration + ", gener=" + gener + ", caratula=" + caratula + ", description=" + description + '}';
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getDuration() {
        return duration;
    }

    public String getGener() {
        return gener;
    }

    public boolean isCaratula() {
        return caratula;
    }

    public String getDescription() {
        return description;
    }
    /**
     * Metodo para capturar el titulo en la PlayLyst
     */
    public void capturarTitulo2(String titulo){
        this.title = titulo;  
    }
    /**
     * Metodo para capturar el Id en la PlayLyst
     */
    public void capturarIdentificador2(int identificador){
        this.identificador = identificador;
    }
    /**
     * Metodo para capturar el año en la PlayLyst
     */
    public void capturarAño2(int año){
        this.year = año;
    }
    /**
     * Metodo para capturar la duracion en la PlayLyst
     */
    public void capturarDuracion2(double Duracion){
        this.duration = Duracion;
    }
    /**
     * Metodo para capturar el genero en la PlayLyst
     */
    public void capturarGenero2(String genero){
        this.gener = genero;
    }
    /**
     * Metodo para capturar si posee caratula, en la PlayLyst
     */
    public void capturarCaratula2(boolean caratula){
        this.caratula = caratula;
    }
    /**
     * Metodo para capturar la descripcion en la PlayLyst
     */
    public void capturarDescripcion2(String Descrip){
        this.description = Descrip;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setCaratula(boolean caratula) {
        this.caratula = caratula;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
