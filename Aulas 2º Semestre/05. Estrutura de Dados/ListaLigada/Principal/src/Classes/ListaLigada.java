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
public class ListaLigada {
    private No primeiroNo, ultimoNo;
    private int qtdNo;
    
    
    public ListaLigada() {
        primeiroNo = null;
        ultimoNo = null;
        qtdNo = 0;
    }
    
    public void adicionar(Object info) {
        No novoNo;
        if (primeiroNo == null) {
            //Estou iniciando a lista
            novoNo = new No(info, null);
            primeiroNo = ultimoNo = novoNo;
            qtdNo++;
        } else {
            //Adiciona no final da lista
            novoNo = new No(info, null);
            ultimoNo.setProximo(novoNo);
            ultimoNo = novoNo;
            qtdNo++;
        }        
    }
    
    public No percorrer(int indice) {
        if (indice >= 0 && indice < qtdNo) {
            No aux = primeiroNo;
            for (int i=0; i<indice; i++) {
                aux = aux.getProximo();
            }
            return aux;
        } else {
            return null;
        }
    }
    
    public void adicionar(Object info, int indice) {
        //adiciona um novo no na posiçao definida pelo indice
        No novoNo;
        if (indice >= qtdNo - 1) {
            //adiciona um nó a ultima posição da lista
            adicionar(info);
        } else if (indice == 0) {
            /*para adicionar o no na primeira posição 
            O novo nó precisa apontar para o primeiro nó
            e a referencia para o primeiro nó precisa ser atualizada*/
            novoNo = new No(info, primeiroNo);
            primeiroNo = novoNo;
            qtdNo++;
        } else {
            //todos os casos onde sera adicionado no meio da lista
            //aux recebe ref. para o nó de indice - 1
            No aux = percorrer(indice-1);
            //novoNo é criado com a ref. para o proximo nó, como aux=>proximoNo
            novoNo = new No(info, aux.getProximo());
            //aux atualiza a ref. para o proximo nó, atribuindo o Novo nó.
            aux.setProximo(novoNo);
            qtdNo++;
        }
    }
    
    public String exibirLista() {
        //Percorre toda a lista retornando uma string com o info de todos
        String retorno = "Lista: ";
        No aux = primeiroNo;
        while(aux.getProximo() != null) {
            retorno += aux.getInfo() + " ";
        }
        retorno += aux.getInfo();            
        return retorno;
    }
    
    public String getLista(int indice) {
        return percorrer(indice).getInfo().toString();
    }
    
    public void remover(int indice) {
        No aux = percorrer(indice-1);
        
        if (indice == 0) {
            //remove da primeira posição da lista
            primeiroNo = primeiroNo.getProximo();
            qtdNo--;
        } else if (indice == qtdNo-1) {
            //remove da ultima posição da lista
            aux = percorrer(indice-1);
            aux.setProximo(null);
            ultimoNo=aux;
            qtdNo--;
        } else {
            //remove de qualquer posição da lista
            aux = percorrer(indice-1);
            aux.setProximo(aux.getProximo().getProximo());
            qtdNo--;
        }
    }
    
    public void addOrdenado() {
        
    }
}
