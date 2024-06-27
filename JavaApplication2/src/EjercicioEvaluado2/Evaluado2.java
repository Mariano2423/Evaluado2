/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioEvaluado2;

/**
 *
 * @author maria
 */
public class Evaluado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // Se crea la información de la canción 
    Cancion cancion1 = new Cancion("01","Le pido a dios","Feid",2.45,2022);
    
    // Se muestra la información de la canción
    System.out.println("ID: " + cancion1.getId());
    System.out.println("Título: " + cancion1.getTitulo());
    System.out.println("Autor: " + cancion1.getAutor());
    System.out.println("Duración: " + cancion1.getDuracion());
    System.out.println("Año de cración: " + cancion1.getAnioCreacion());
    

    }
}
