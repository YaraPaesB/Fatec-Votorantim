package Classes;

import java.io.Serializable;
import java.util.Date;

public abstract class Pessoa implements Serializable {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String email;
    private String senha;

    // Construtor
    public Pessoa(String nome, Date dataNascimento, String cpf, String email, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha.length() < 8) {
            throw new Exception("A senha deverá ter mais de 8 caracteres");
        } else {
            this.senha = senha;
        }
    }
    
    // Método de login
    public abstract String login();
    
    // Método de logout
    public abstract String logout();
    
}
