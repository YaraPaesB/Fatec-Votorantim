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
public final class Colegial extends Aluno {
    
    
    public Colegial(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Colegial(String nome, String genero, int idade, float nota) {
        super(nome, genero, idade, nota);
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public void setNota(String nota) {
        if(Integer.parseInt(nota) >= 0 && Integer.parseInt(nota) <= 10) {
            super.nota = Float.parseFloat(nota);
        }
        else super.nota = 0;
    }
    
    @Override
    public String getNota() {
        return String.valueOf(super.nota);
    }
}
