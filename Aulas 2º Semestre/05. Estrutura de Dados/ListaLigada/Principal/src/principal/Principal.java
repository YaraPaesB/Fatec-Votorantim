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
        ListaLigada lista = new ListaLigada();
        
        lista.adicionar(1); // indice 0
        lista.adicionar(2); // indice 1
        lista.adicionar(3); // indice 2
        
        System.out.println(lista.exibirLista());
        
        lista.adicionar("x", 2);
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());

    }
    
}
