/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author David
 */
public class Nodo {
    int coordenadaX;
    int coordenadaY;
    int indice;

    public Nodo() {
    }
    
    public Nodo(int coordenadaX, int coordenadaY, int indice) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.indice = indice;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Nodo{" + "coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", indice=" + indice + '}';
    }
    
    
}
