/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prooofconcept2d;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author servkey
 */
public class ProoOfConcept2D {
    /**
     * @param args the command line arguments
     */

	
	
    public static void main(String[] args) {
        CanvasDib canvas = new CanvasDib();
        ProoOfConcept2D tecla = new ProoOfConcept2D();
        FrmGame fr = new FrmGame(canvas);
        fr.setSize(800, 600);      
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }	
    	

}
