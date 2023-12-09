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
public class FilaPrioridade {
    private List<Object> fila; //list é uma interface, define os metodos obrigatorios
    
    //construtor
    public FilaPrioridade() {
        fila = new ArrayList<Object>();
    }
    
    //metodos
    
    public void adiciona(Object item) {
        //os itens serao adicionados em ordem crescente 
        //valores menores no inicio e maiores no final
        boolean adicionado=false;
        if (fila.isEmpty()) {
            this.fila.add(item);    
        } else {
            for (int i = 0; i < fila.size(); i++) {
                if (Integer.parseInt(fila.get(i).toString()) 
                        > Integer.parseInt(item.toString()) ) {
                    fila.add(i, item);
                    adicionado=true;
                    break;
                }
            }
            if (adicionado==false) {
                fila.add(item);
            }
        }
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

    

