package Classes;

public class Usuario extends Pessoa {

    // Atributo específico do usuário
    public String transtorno;

    // Construtor
    public Usuario(String nome, String cpf, String email, String login, String senha, String transtorno) {
        super(nome, cpf, email, login, senha, "Não Profissional");
        this.transtorno = transtorno;
    }

    // Getter e Setter específico do usuário
    public String getTranstorno() {
        return transtorno;
    }

    public void setTranstorno(String transtorno) {
        this.transtorno = transtorno;
    }
    
    // Sobrescreve o método login específico para a classe Usuario
    public String login() {
        return "Login específico do Usuario";
    }

    
    // Sobrescreve o método login específico para a classe Usuario
    public String logout(){
        return "Logout específico do Usuario";
    }
}
