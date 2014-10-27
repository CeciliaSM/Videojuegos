/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prooofconcept2d;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
/**
 *
 * @author servkey
 */
public class CanvasDib extends Canvas {
    
    private int x = 100;
    private int y = 450;
    private BufferedImage sample;
    //private String [] teclapres;
    private java.awt.event.KeyEvent evt;
   
    private BufferedImage cargarImagen(String file){
        BufferedImage img = null;        
        try{
            URL image = getClass().getResource(file);
            img = ImageIO.read(image);
        }catch(Exception e){
        }
         return img;
    }
    
    @Override
    public void paint(Graphics g)
    {       
        // g.setColor(Color.yellow);     //Activa el color amarillo
        // g.fillOval(getX(), getY(), 60, 60); //Dibuja un óvalo
         if (sample == null) sample = cargarImagen("./images/Caballo.png");
         g.drawImage(sample, getX(), getY(), this);        	
         
    }       

    @Override
    public void update(Graphics g)    
    {   
    	
        super.update(g);
        paint(g);         
  		//	g.drawImage(sample, x, y, this);
  			  
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }   
          
    
       
}
