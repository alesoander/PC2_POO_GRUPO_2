/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paint1;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class Lienzo {
 int ancho;
 int alto;
 String colorFondo;

    public Lienzo() {
    }

    public Lienzo(int ancho, int alto, String colorFondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    @Override
    public String toString() {
        return "Lienzo{" + "ancho=" + ancho + ", alto=" + alto + ", colorFondo=" + colorFondo + '}';
    }

    
    
 
}
