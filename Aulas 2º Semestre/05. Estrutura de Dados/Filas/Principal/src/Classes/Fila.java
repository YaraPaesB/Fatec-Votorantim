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
public class Fila {
    private List<Object> fila; //list é uma interface, define os metodos obrigatorios
    
    //construtor
    public Fila() {
        fila = new ArrayList<Object>();
    }
    
    //metodos
    
    public void adiciona(Object item) {
        this.fila.add(item);
    }
    
    public Object remover() {
        if (!fila.isEmpty()) {
            return this.fila.remove(0);
        } else {
            return null;
        }
    }
        
    
    public Object exibirInicio() {
        return this.fila.get(0);
    }
    
    public int tamanho() {
        return this.fila.size();
    }
    
    
}
