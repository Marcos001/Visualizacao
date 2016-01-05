package questao2;

import eventos.FecharJanela;
import javax.swing.JFrame;

public class JanelaQ2 extends JFrame {

    public JanelaQ2() {
        setVisible(true);
        setSize(600, 400);
        setTitle("Desenho arvore binaria: Questão 02");
        addWindowListener(new FecharJanela());
        add(new PanelQ2());
    }
    
    public static void main(String[] args) {
        new JanelaQ2();
    }
    
}
