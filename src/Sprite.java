
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.io.Serializable;
import javax.swing.ImageIcon;


public class Sprite implements Serializable {
    Point posicion;
    ImageIcon bola;
    

    public Sprite(Point posicion, ImageIcon bola) {
        this.posicion = posicion;
        this.bola = bola;
    }
    
    public void dibujar(Graphics g){
        g.drawImage(bola.getImage(), posicion.x, posicion.y, null);
    }
    
    public void mover(int vx, int vy){
        posicion.x += vx;
        posicion.y += vy;
    }
    
}
