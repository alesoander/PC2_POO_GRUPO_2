/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint1;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
class Circulo extends Figura {
    private int radio;

    public Circulo(String color, int grosorLinea, int radio) {
        super(color, grosorLinea);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + color + ", radio: " + radio);
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("Moviendo el círculo a la posición (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(int nuevoRadio) {
        this.radio = nuevoRadio;
        System.out.println("Redimensionando el círculo a radio: " + nuevoRadio);
    }
}
