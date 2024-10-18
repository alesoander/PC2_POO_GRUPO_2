/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint1;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public abstract class Figura {
    
  
    protected String color;
    protected int grosorLinea;

    public Figura(String color, int grosorLinea) {
        this.color = color;
        this.grosorLinea = grosorLinea;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGrosor(int grosor) {
        this.grosorLinea = grosor;
    }

    public abstract void dibujar();
    public abstract void mover(int x, int y);
    public abstract void redimensionar(int nuevoTamaño);
}
    
   
   

