package questao4;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ4 extends Panel {
    
    @Override
    public void paint(Graphics g) {
        BinaryTree bt = new BinaryTree(10);
        bt.add(5);
        bt.add(7);
        bt.add(4);
    
        bt.paint(g);
    }
}
