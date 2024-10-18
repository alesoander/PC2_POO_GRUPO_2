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
        System.out.println("Dibujando una línea de color " + color + ", longitud: " + longitud);
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("Moviendo la línea a la posición (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(int nuevaLongitud) {
        this.longitud = nuevaLongitud;
        System.out.println("Redimensionando la línea a longitud: " + nuevaLongitud);
    }
}

