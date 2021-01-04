/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata06.apps.swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Raul Vega
 */
public class BlockPanel extends JPanel{
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.black);
        for (int i = 0; i <= 700; i+=100) {
            g.drawLine(0, i, 700, i);
            g.drawLine(i, 0, i, 700);
        }
        g.setColor(Color.red);
        g.fillRect(300, 300, 100, 100);
    }
}
