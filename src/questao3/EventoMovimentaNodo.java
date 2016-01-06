package questao3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class EventoMovimentaNodo extends KeyAdapter {

    Graphics g;

    PanelQ3 panel;
    
    public EventoMovimentaNodo(PanelQ3 p) {
        this.panel = p;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
                System.out.println(e);//verifica se as teclas foram tecladas
      
  
        if(e.getKeyCode() == 37){
        this.panel.nodox -= 50;
        JOptionPane.showMessageDialog(null,"esq");
        }
        
        else if(e.getKeyCode() == 38){
            this.panel.nodoy -= 50;
            JOptionPane.showMessageDialog(null,"cima");
         }
    
        else if(e.getKeyCode() == 39){
              this.panel.nodox += 50;      
              JOptionPane.showMessageDialog(null,"dir");
         }
            
        else if(e.getKeyCode() == 40){
                this.panel.nodoy += 50; 
                JOptionPane.showMessageDialog(null,"baixo");
        }              
        
         //this.panel.paint(g);
         this.panel.repaint();
   
    }//fim do método
    
}
