
package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alfredo Giron
 */
public class Lienzo extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        this.setSize(1500, 700);
        this.setBackground(Color.white);
    }
}
