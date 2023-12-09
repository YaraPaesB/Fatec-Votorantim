/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        Aluno a1 = new Aluno("Maria");
        
        System.out.println(p1.getNome());
        System.out.println(a1.getNome());
    }
    
}
