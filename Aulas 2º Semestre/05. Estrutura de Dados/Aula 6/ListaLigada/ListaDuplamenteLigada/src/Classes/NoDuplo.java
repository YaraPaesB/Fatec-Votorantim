/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class NoDuplo {
    private Object info;
    private NoDuplo proximo;
    private NoDuplo anterior;
    
    public NoDuplo(Object info, NoDuplo proximo, NoDuplo anterior){
        this.info=info;
        this.proximo=proximo;
        this.anterior = anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public Object getInfo() {
        return info;
    }

    public NoDuplo getProximo() {
        return proximo;
    }
}
