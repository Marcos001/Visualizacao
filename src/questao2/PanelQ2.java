package questao2;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ2 extends Panel {

    /**
     * Esta classe deve ser modificada para realizar o desenho da arvore binaria
     * solicitada na questao 01
     * @param g - contexto grafico
     */
    @Override
    public void paint(Graphics g) {
        // desenhe a arvore aqui
      
        
        g.drawOval(270, 50, 50, 50);
        g.drawString("5", 290, 80);//5
        
       
    
        
        g.drawOval(200, 150, 50, 50); //2
        g.drawString("2", 220, 180);//2
        
           g.drawOval(340, 150, 50, 50); // 18
           g.drawString("18", 358, 180);//18
        
                g.drawOval(140, 250, 50, 50); // -4
                g.drawString("-4", 155, 280);//-4
                
                    g.drawOval(260, 250, 50, 50); // 3
                    g.drawString("3", 280, 280);//3
                    
                     
                     g.drawLine(280, 96, 230, 150); // 5 a 2
                     g.drawLine(310, 96, 360, 150); // 5 a 18
                     g.drawLine(220, 200, 170, 250); // 2 a -4
                     g.drawLine(230, 200, 280, 250); // 2 a 3
                     
                    
        
    }
    
}
