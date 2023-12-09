/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {
    int RA;
    Pessoa responsavel;
    double mediaFinal;
    
    //construtor de class filha

    public Aluno(String nome) {
        super(nome); //super se refere a classe mae
    }
    
    public Aluno(String nome, int RA) {
        this(nome);
        this.RA = RA;
    }
    
    public Aluno(String nome, int RA, Pessoa responsavel) {
        this(nome, RA);
        this.responsavel = responsavel;
    }
    
    public Aluno(String nome, int RA, Pessoa responsavel, double mediaFinal) {
        this(nome, RA, responsavel);
        this.mediaFinal = mediaFinal;
    }
    
    
    //metodos especificos

    public void setRA(int RA) {
        this.RA = RA;
    }
    
    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }
    
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    
    @Override
    public String getNome() {
        return "Sr " + super.nome;
    }
    
    
    public int getRA() {
        return this.RA;
    }
    
    public Pessoa getResponsavel() {
        return this.responsavel;
    }
    
    public double getMediaFinal() {
        return this.mediaFinal;
    }
    
    
}
