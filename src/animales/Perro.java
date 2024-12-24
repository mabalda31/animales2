/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

public class Perro implements Mamifero {

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau.");
    }

    @Override
    public void amamantar() {
        System.out.println("El perro amamanta a sus cachorros.");
    }
}