/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author alejo
 */
public class Main {
    public static void main(String[] args) {
        Mamifero perro = new Perro();
        Mamifero gato = new Gato();

        System.out.println("Perro:");
        perro.hacerSonido();
        perro.amamantar();

        System.out.println("\nGato:");
        gato.hacerSonido();
        gato.amamantar();
    }
}