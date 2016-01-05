package questao3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ3 extends Panel {
    
    Graphics g;

    protected int nodox = 250;
    protected int nodoy = 100;


    public PanelQ3() {
        addKeyListener(new EventoMovimentaNodo(this));
    }
    
    @Override
    public void paint(Graphics g) {     
        System.out.println("Metodo paint \n"+nodox+"\n"+nodoy);
        this.desenhaNodo(g, 80, nodox, nodoy);
        
    }
    
    void desenhaNodo(Graphics g, int key, int x, int y) {
        //substitua este metodo pelo metodo que voce criou na questao1
           //g.setColor(new Color(125,100,200));
             g.drawOval(x, y, 80, 80);
    }
    
}
