/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Alunos
 */
public class Exemplo3 {
    private JFrame janela;
    
    //Construtor
    public Exemplo3() {
        janela = new JFrame("Terceira Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Atribui o container da janela a variavel
        
        Container c = janela.getContentPane();
        JLabel rotulo = new JLabel("Elemento JLabel");
        JButton botao = new JButton("Botão Simples");
        c.add(botao);
        c.add(rotulo);
        c.setLayout(new FlowLayout());
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Exemplo3 p = new Exemplo3();
    }
}
