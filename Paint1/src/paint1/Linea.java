/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint1;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */

    
    
    class Linea extends Figura {
    private int longitud;

    public Linea(String color, int grosorLinea, int longitud) {
        super(color, grosorLinea);
        this.longitud = longitud;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una l�nea de color " + color + ", longitud: " + longitud);
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("Moviendo la l�nea a la posici�n (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(int nuevaLongitud) {
        this.longitud = nuevaLongitud;
        System.out.println("Redimensionando la l�nea a longitud: " + nuevaLongitud);
    }
}

