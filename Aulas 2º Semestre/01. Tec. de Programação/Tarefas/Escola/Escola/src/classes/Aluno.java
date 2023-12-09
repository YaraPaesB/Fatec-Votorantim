/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Alunos
 */
public abstract class Aluno extends Pessoa {
    protected float nota;
    
    
    //construtores
    
    public Aluno(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Aluno(String nome, String genero, int idade, float nota) {
        super(nome, genero, idade);
        this.nota = nota;
    }
    
    //metodos
    
    public abstract String getNota();
    
    @Override
    public String getNome() {
        return super.nome;
    }
    
    
}
