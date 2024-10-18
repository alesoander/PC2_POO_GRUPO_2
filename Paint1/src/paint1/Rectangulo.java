/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint1;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
 class Rectangulo extends Figura {
    
 
    private int alto;
    private int ancho;

    public Rectangulo(String color, int grosorLinea, int alto, int ancho) {
        super(color, grosorLinea);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de color " + color + ", alto: " + alto + ", ancho: " + ancho);
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("Moviendo el rectángulo a la posición (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(int nuevoTamaño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
    
    
    
    
    

