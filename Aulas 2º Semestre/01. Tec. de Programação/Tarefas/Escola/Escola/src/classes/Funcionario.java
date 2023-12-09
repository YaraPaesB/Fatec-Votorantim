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
public abstract class Funcionario extends Pessoa {
    protected float salarioBase;
    
    
    public Funcionario(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Funcionario(String nome, String genero, int idade, float salarioBase) {
        super(nome, genero, idade);
        this.salarioBase = salarioBase;
    }   
        
    
    public abstract double calculaSalario();
    
    @Override
    public String getNome() {
        if(super.getGenero().equals("masculino")) return "Sr. " + super.nome;
        else return "Sra. " + super.nome;
    }
}
