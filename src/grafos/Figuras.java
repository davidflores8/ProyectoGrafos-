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
import java.awt.RenderingHints;

/**
 *
 * @author David
 */
public class Figuras {

    public Figuras() {
    }
    
    public void dibujarCirculo(Graphics g, int x, int y, String nombre){
        ((Graphics2D)g).setColor(Color.RED);
        ((Graphics2D)g).setStroke(new BasicStroke(2));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
        ((Graphics2D)g).setColor(Color.BLUE);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(nombre, x, y);
    }
    
    public void dibujarLinea (Graphics g, int x1, int y1, int x2, int y2){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);   
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
    }
    
    public void dibujarCamino (Graphics g, int x1, int y1, int x2, int y2){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);    
        ((Graphics2D)g).setColor(Color.GREEN);
        ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
    }
    
    
}


