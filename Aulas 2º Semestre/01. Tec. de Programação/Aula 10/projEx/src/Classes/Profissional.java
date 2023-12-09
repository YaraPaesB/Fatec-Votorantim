package Classes;

import java.util.Date;

public class Profissional extends Pessoa {
// Atributo específico do profissional
    private String especialidade;

    // Construtor
    public Profissional(String nome, Date dataNascimento, String cpf, String email, String senha, String especialidade) {
        super(nome, dataNascimento, cpf, email, senha);
        this.especialidade = especialidade;
    }

    // Getter e Setter específico do profissional
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    // Sobrescreve o método login específico para a classe Profissional
    @Override
    public String login() {
        return "Login específico do Profissional";
    }

    // Método específico para ação após o login de um Profissional
    public String criarArtigo() {
        return "Artigo criado com sucesso!";
    }
    
    // Sobrescreve o método login específico para a classe Profissional
    @Override
    public String logout(){
        return "Logout específico do Profissional";
    }
}