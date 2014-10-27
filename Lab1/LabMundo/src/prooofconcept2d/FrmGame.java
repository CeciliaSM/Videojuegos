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
        this.getContentPane().setBackground(Color.blue);
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
    		System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
        	if (e.getKeyCode()==KeyEvent.VK_RIGHT){          	
        		x= c.getX() +10; 
        		c.setX(x);        		    						 
        		c.repaint();// .repaint();        		
        	}
        	if (e.getKeyCode()==KeyEvent.VK_LEFT){
        		x= c.getX() -10;
        		c.setX(x);
        		c.repaint();
        	}
        	if (e.getKeyCode()==KeyEvent.VK_UP){
        		y= c.getY() -10;
        		c.setY(y);
        		c.repaint();
        	}
        	if (e.getKeyCode()==KeyEvent.VK_DOWN){
        		y= c.getY() +10;
        		c.setY(y);
        		c.repaint();
        	}        	        	
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
    }
}
