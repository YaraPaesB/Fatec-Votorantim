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
public final class Professor extends Funcionario {
    private float salarioHora, qtdHoras;
    
    public Professor(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }
    
    public Professor(String nome, String genero, int idade, float salarioHora, float qtdHoras) {
        super(nome, genero, idade);
        this.salarioHora = salarioHora;
        this.qtdHoras = qtdHoras;
    }
    
    @Override
    public double calculaSalario() {
        return super.salarioBase + (salarioHora * qtdHoras);
    }
    
    @Override
    public String getNome() {
        if (super.getGenero().equals("masculino"))
            return "Professor" + super.nome;
        else 
            return "Professora" + super.nome;
    }
    
    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    public void setQtdHoras(float qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
}
