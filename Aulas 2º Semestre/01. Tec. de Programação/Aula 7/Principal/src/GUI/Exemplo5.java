/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/**
 *
 * @author Alunos
 */
public class Exemplo5 implements ActionListener {
    private JFrame janela;
    private JButton jb, jb2;
    
    //Construtor
    public Exemplo5() {
        janela = new JFrame("Quinta Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
        jb = new JButton("Ok");
        jb.addActionListener(this);
        
        jb2 = new JButton("Botão 2");
        jb2.addActionListener(this);
        
        Container c = janela.getContentPane();
        c.add(jb);
        c.add(jb2);
       
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Exemplo5 p = new Exemplo5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb) {
            JOptionPane.showMessageDialog(janela, "Ok"); 

        } else if (e.getSource()==jb2) {
            JOptionPane.showMessageDialog(janela, "Botão 2"); 
        }
        
    }
}
