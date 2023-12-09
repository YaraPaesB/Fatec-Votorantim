/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class Exemplo1 {
    private JFrame janela;
    
    public Exemplo1() {
        janela = new JFrame("Primeira Janela");
        janela.setSize(400, 300);
        janela.setVisible(true); //Define que a janela estara visivel
    }
    
    public static void main(String[] args) {
        Exemplo1 p = new Exemplo1();
    }
    
}
