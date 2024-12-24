/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

public class Gato implements Mamifero {

    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau.");
    }

    @Override
    public void amamantar() {
        System.out.println("El gato amamanta a sus gatitos.");
    }
}