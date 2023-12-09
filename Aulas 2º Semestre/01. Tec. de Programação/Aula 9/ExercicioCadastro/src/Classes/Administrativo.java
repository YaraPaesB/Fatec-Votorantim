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
public final class Administrativo extends Funcionario {
    
    public Administrativo(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    
    @Override
    public double calculaSalario(){
        return super.salarioBase;
    }
}
