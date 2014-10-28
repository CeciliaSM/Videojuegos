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
import java.applet.*;
import javax.imageio.ImageIO;
/**
 *
 * @author servkey
 */
public class CanvasDib extends Canvas {
    
    private int x = 40;
    private int y = 490;
    private BufferedImage sample;
    private BufferedImage fondo;
    private BufferedImage cubo1,cubo2,cubo3;
    private FrmGame fr;
    private AudioClip sonido;
    //private String [] teclapres;
    private java.awt.event.KeyEvent evt;
   
    public CanvasDib(){
    	fondo = cargarImagen("./images/fondoJu.png");
    	cubo1 = cargarImagen("./images/cubo.png");    	
    	cubo2 = cargarImagen("./images/cubo1.png");
    	cubo3 = cargarImagen("./images/cubo2.png");    	
    	sonido = java.applet.Applet.newAudioClip(getClass().getResource("./images/sonido.wav"));    	
    	sonido.play();
    }
    
    
    
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
    	g.drawImage(fondo, 0000, 000, this);    	
    	g.drawImage(cubo1, 210, 505, this);
    	//cubo1 = cargarImagen("./images/cubo.png");
    	g.drawImage(cubo1, 450, 505, this);
    	//cubo1 = cargarImagen("./images/cubo.png");
    	g.drawImage(cubo1, 730, 505, this);
        if (sample == null) sample = cargarImagen("./images/caballo.png");
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
