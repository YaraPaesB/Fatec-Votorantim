/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import com.sun.corba.se.spi.copyobject.CopyobjectDefaults;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    String nome;
    String cpf;
    String telefone;
    String endereco;
    
    
    //construtores
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    public Pessoa(String nome, String cpf, String telefone){
        this(nome, cpf);
        this.telefone = telefone;
    }
    
    public Pessoa(String nome, String cpf, String telefone, String endereco) {
        this(nome, cpf, telefone);
        this.endereco = endereco;
    }
    
    
    //metodos get e set para todos os atributos
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone){ 
            this.telefone = telefone;
    }
    
    public void setEendereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    
}
