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
public class Exemplo2 {
    private JFrame janela;
    
    //Construtor
    public Exemplo2() {
        janela = new JFrame("Segunda Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        Exemplo2 p = new Exemplo2();
    }
    
}
