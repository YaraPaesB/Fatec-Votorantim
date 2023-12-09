/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import sun.security.krb5.internal.rcache.AuthList;

/**
 *
 * @author Alunos
 */
public class No {
    private Object info;
    private No proximo;
    
    
    public No(Object info, No proximo) {
        this.info = info;
        this.proximo = proximo;
    }

    public Object getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    
}
