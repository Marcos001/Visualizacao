package questao4;

import java.awt.Graphics;
import javax.swing.JOptionPane;

public class BinaryTree {

    private int verificaraiz = 0;
    private int bloco = 50;
    //raiz da arvore
    protected Node root;
    
    //construtor que cria uma arvore com um nodo raiz
    public BinaryTree(int data) {
        root = new Node(data);
    }

    // metodo publico para adicao de nodos
    public void add(int key) {
        this.addNode(this.root, key);
    }
    
    /**
     * metodo privado responsavel por adicionar os nodos na arvore binaria,
     * este e um metodo recursivo, que a partir de um nodo pai, verifica se o valor 
     * a ser adicionado é menor ou maior que o valor do nodo pai, se o valor key
     * for menor que o valor do nodo pai, tenta-se adicionar o valor a esquerda 
     * do nodo pai, se for maior, tenta-se adicionar o valor a direita.
     * @param node - nodo pai, aonde o valor key deve ser adicionado como um de seus nodos filhos
     * @param key  - valor a ser adicionado no nodo
     */
    private void addNode(Node node, int key) {
        if (key < node.getKey()) {
            if (node.getLeft() != null) {
                addNode(node.getLeft(), key);
            } else {
                System.out.println("  Inserido " + key + " para esquerda de "
                        + node.getKey());
                node.setLeft(new Node(key));
            }
        } else if (key > node.getKey()) {
            if (node.getRight() != null) {
                addNode(node.getRight(), key);
            } else {
                System.out.println("  Inserido " + key + " para direita de "
                        + node.getKey());
                node.setRight(new Node(key));
            }
        }
    }

    /**
     * metodo que realiza o desenho da arvore
     * @param g - contexto grafico
     */
    public void paint(Graphics g) {
        this.paintNode(g, root, 300, 10);
    }
    
    /**
     * metodo privado que realizar o desenho da arvore atravez de chamadas recursivas.
     * Cada nodo e desenhado e se houver um nodo a esquerda ou direita, o metodo
     * e chamado novamente para realizar o desenho de todos os nodos.
     * @param g - contexto grafico
     * @param node - nodo a ser desenhado
     * @param x - posicao x aonde o nodo deve ser desenhado
     * @param y - posicao y onde o nodo deve ser desenhado
     */
    private void paintNode(Graphics g, Node node, int x, int y) {
        //implemente o metodo recursivo para desenho dos nodos aqui
        
        JOptionPane.showMessageDialog(null,"Entrando no metodo paintNode\n Info = "+node.toString());
    
    
            if(verificaraiz == 0){            
            JOptionPane.showMessageDialog(null,"Inserindo Raiz");
            
                    verificaraiz =+ 1; 
                    g.drawOval(x, y, bloco, bloco);
                    g.drawString(node.toString(), x+20, y+30);
                    }
                    
            if(node.getLeft()!=null){
             JOptionPane.showMessageDialog(null,"Inserindo Nos Nós Filhos na esquerda");
             int x1 = (x-100);
             int y1 = (y+100);
             g.drawOval(x1, y1, bloco, bloco);
             g.drawString(node.getLeft().toString(),x1+20,y1+30);
             int bx = x + 7;
             int by = y + 43;
             int cx = x1 + 43;
             int cy = y1 + 7;
             g.drawLine(bx, by, cx, cy);
              paintNode(g,node.getLeft(),x1,y1);
            }
            
            
            if(node.getRight()!=null){
             JOptionPane.showMessageDialog(null,"Inserindo Nos Nós Filhos na direita");
             int x1 = (x+100);
             int y1 = (y+100);
             g.drawOval(x1, y1, bloco, bloco);
             g.drawString(node.getRight().toString(),x1+20,y1+30);
             int dx = x + 43;
             int dy = y + 43;
             int ax = x1 + 7;
             int ay = y1 + 7;
             g.drawLine(dx, dy, ax, ay);
            paintNode(g,node.getRight(),x1,y1);
            }
       
           
  
            
    }
    
    /**
     * metodo utilizado para fazer o percorrimento da arvore
     */
    public void traverse() {
        this.printNode(root);
    }
    
    /**
     * metodo privado que realiza o percorrimento da arvore de forma recursiva;
     * @param node - no atual que sera escrito na tela
     */
    private void printNode(Node node) {
        System.out.println(node.getKey());
        if (node.getLeft() != null) {
            printNode(node.getLeft());
        }
        if (node.getRight() != null) {
            printNode(node.getRight());
        }
    }

}
