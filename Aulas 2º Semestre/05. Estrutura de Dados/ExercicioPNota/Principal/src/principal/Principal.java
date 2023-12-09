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
       ListaLigada lista1 = new ListaLigada();
       
       lista1.adicionar(5);
       lista1.adicionar(2, TipoOrdenacao.CRESCENTE);

       
          

       
    }
    
}
