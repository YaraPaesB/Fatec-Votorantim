/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.*;

/**
 *
 * @author Alunos
 */
public class PilhaInteger {
    private List<Integer>pilha = new ArrayList<Integer>();
    
    //metodos
    
    public void empilhar(Integer item) {
        pilha.add(item);
    }
    
    public Integer desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.remove(pilha.size()-1);
        }else return null;
    }
    
    public boolean pilhaVazia() {
        return pilha.isEmpty();
    }
    
    public Integer exibirTopo() {
        if (!pilha.isEmpty()) {
            return pilha.get(pilha.size()-1);
        } else return null;
    }
}
