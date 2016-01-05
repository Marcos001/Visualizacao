package questao1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import javax.swing.JOptionPane;

public class PanelQ1 extends Panel {

   
    
    public String Digitar(){
    String n;
    n = JOptionPane.showInputDialog("Digite um Valor..: ");
    return n;
    }
    

    
    @Override
    public void paint(Graphics g) {
        this.desenhaNodo(g, 10, 300, 20);
    }
    
    /**
     * Metodo privado para desenho de nodo;
     * utilize este metodo para desenhar um nodo dado um valor e suas coordenadas
     * x e y.
     * @param g contexto grafico
     * @param key valor que ficara no centro do nodo
     * @param x coordenada x da localizacao do nodo
     * @param y coordenada y da localizacao do nodo
     */
    private void desenhaNodo(Graphics g, int key, int x, int y) {
       String valor = Digitar();
       g.drawOval(100, 100, 80, 80);
       g.drawString(valor, 138, 145);
    }
    
}
