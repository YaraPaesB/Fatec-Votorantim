/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Classes.*;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila filaPessoa = new Fila();
        
        
        filaPessoa.adiciona("Maria");
        filaPessoa.adiciona("Pedro");
        filaPessoa.adiciona("João");
        filaPessoa.adiciona("Alice");
        
        for(int i=filaPessoa.tamanho(); i > 0; i--) {
            System.out.println("Remover: " + filaPessoa.remover().toString());
        }
        
        FilaPrioridade filaNumeros = new FilaPrioridade();
        filaNumeros.adiciona(1);
        filaNumeros.adiciona(2);
        filaNumeros.adiciona(7);
        filaNumeros.adiciona(30);
        filaNumeros.adiciona(4);
        
        
        for(int i=filaNumeros.tamanho(); i > 0; i--) {
            System.out.println("A ordem é: " + filaNumeros.remover().toString());        
        }
        
    }
    
}
