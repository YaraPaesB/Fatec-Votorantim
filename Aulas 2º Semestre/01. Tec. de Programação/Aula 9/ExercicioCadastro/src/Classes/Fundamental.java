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
public final class Fundamental extends Aluno {
       
    public Fundamental(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Fundamental(String nome, String genero, int idade, float nota) {
        super(nome, genero, idade, nota);
    }
    
    
    public void setNota(String nota) {
        if(Integer.parseInt(nota) >= 0 && Integer.parseInt(nota) <= 10) {
            super.nota = Float.parseFloat(nota);
        }
        else super.nota = 0;
    }
    
    @Override
    public String getNota() {
        if (nota <= 5) return "D";
        if (nota >= 6) return "C";
        if (nota >= 8) return "B";
        if (nota > 9) return "A";
        else return "Nota não cadastrada.";
    }
    
}
