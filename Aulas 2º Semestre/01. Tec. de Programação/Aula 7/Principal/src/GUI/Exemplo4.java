/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author Alunos
 */
public class Exemplo4 {
    private JFrame janela;
    
    //Construtor
    public Exemplo4() {
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JLabel label = new JLabel("Label");
        JButton botao = new JButton("Botao");
        JButton botao2 = new JButton("Botao 2");
        JButton botao3 = new JButton("Botao 3");

        
        p1.setBackground(Color.green);
        p1.add(label);
        
        p2.setBackground(Color.red);
        p2.add(botao);
        
        p3.setBackground(Color.BLUE);
        p3.setLayout(new GridLayout(2, 1));
        p3.add(botao2);
        p3.add(botao3);
        
        Container c = janela.getContentPane();
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.SOUTH);
        c.add(p3, BorderLayout.EAST);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Exemplo4 p = new Exemplo4();
    }

}
