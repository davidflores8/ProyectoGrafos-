/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author David
 */
public class Figuras {

    public Figuras() {
    }
    
    public void dibujarCirculo(Graphics g, int x, int y, String nombre){
        ((Graphics2D)g).setColor(Color.blue);
        ((Graphics2D)g).setStroke(new BasicStroke(2));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 20, 20);
        ((Graphics2D)g).setColor(Color.ORANGE);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(nombre, x, y);
    }
    
    
}


