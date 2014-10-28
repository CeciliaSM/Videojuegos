/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prooofconcept2d;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JFrame;


/**
 *
 * @author servkey
 */
public class FrmGame extends JFrame{
    private Thread t;
    private CanvasDib c;
    private EscuchaTecla es;
	private int x = 10;
    private int y = 30;
    private BufferedImage sample;
    private BufferedImage fondo;
    
    
    public FrmGame(CanvasDib c){    		
    	KeyListener listener = new EscuchaTecla();
    	addKeyListener(listener);
    	setFocusable(true);
    	
        this.c = c;
        add(c);
        //Iniciar hilo
        t = new Thread(){
              public void run(){
                  updating();                  
              }
        };
        t.start();     
       //this.getContentPane().setBackground(Color.blue);
       
    }
    
    public void updating(){
        while (true){
            try {
                Thread.sleep(100);                
                //c.repaint();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGame.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
    }
    
    public class EscuchaTecla implements KeyListener {
    	
    	public void keyTyped(KeyEvent e){        	
        } 
    	
    	public void keyPressed(KeyEvent e) {	
    		//System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));   
    		if ((c.getX()< 870)){       			
    			//System.out.println("Valor: " +(c.getX()));
    			if (e.getKeyCode()==KeyEvent.VK_RIGHT){          	
        			x= c.getX() +10; 
        			c.setX(x);          			
        				
        			if (x==120){
        				y= c.getY() -85;
            			c.setY(y);   
            			c.repaint();
        			}
        			if (x==270){
        				y= c.getY() +85;
            			c.setY(y);   
            			c.repaint();
        			}
        			if (x==360){
        				y= c.getY() -85;
            			c.setY(y);   
            			c.repaint();
        			}
        			if (x==500){
        				y= c.getY() +85;
            			c.setY(y);   
            			c.repaint();
        			}
        			if (x==650){
        				y= c.getY() -85;
            			c.setY(y);   
            			c.repaint();
        			}
        			if (x==790){
        				y= c.getY() +85;
            			c.setY(y);   
            			c.repaint();
        			}        			
        			c.repaint();// .repaint();        		
        		}
        	}
    		if ((c.getX()>10)){ 
    			if (e.getKeyCode()==KeyEvent.VK_LEFT){
    				x= c.getX() -10;
    				c.setX(x); 
    				//System.out.println("Izquierda : " +c.getX());
    				c.repaint();
    				if (x==790){
        				y= c.getY() -85;
            			c.setY(y);   
            			c.repaint();
        			}
    				if (x==640){
        				y= c.getY() +85;
            			c.setY(y);   
            			c.repaint();
        			}
    				if (x==510){
        				y= c.getY() -85;
            			c.setY(y);   
            			c.repaint();
        			}
    				if (x==360){
        				y= c.getY() +85;
            			c.setY(y);   
            			c.repaint();
        			}
    				if (x==270){
        				y= c.getY() -85;
            			c.setY(y);   
            			c.repaint();
        			}
    				if (x==120){
        				y= c.getY() +85;
            			c.setY(y);   
            			c.repaint();
        			}
        			
    			}
        	}  
    		if ((c.getY()<500)){
    			if (e.getKeyCode()==KeyEvent.VK_DOWN){
        			y= c.getY() +10;
        			c.setY(y);
        			//System.out.println("Valor Y Abajo: " +c.getY());
        			c.repaint();
        		} 
    		}
        	if ((c.getY()>35)){ 
        		if ((e.getKeyCode() == KeyEvent.VK_ENTER)){ // Enter para saltar
        			y= c.getY() -65;
        			c.setY(y);  
        			//System.out.println("Valor Y Arriba: " +c.getY());
        			c.repaint();        			     		
        		}
        	}
        	if ((c.getY()<470)){
        		if (e.getKeyCode() == KeyEvent.VK_SPACE){ // Espacio para bajar del salto
        			y= c.getY() +65;
        			c.setY(y);   
        			//System.out.println("Valor Y : " +c.getY());
        			c.repaint();
        		}
        	}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
    }
}
