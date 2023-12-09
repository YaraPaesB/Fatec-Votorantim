/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.io.Serializable;

/**
 *
 * @author yarap
 */
public class Profissional extends Pessoa implements Serializable{
    public String crp;

    public Profissional(String crp, String nome, String cpf, String email, String login, String senha) {
        super(nome, cpf, email, login, senha, "Profissional");
        this.crp = crp;
    }

      
  

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }
    
    
    public String login() {
        return "Login específico do Profissional";
    }

    // Método específico para ação após o login de um Profissional
    public String criarArtigo() {
        return "Artigo criado com sucesso!";
    }
    
    // Sobrescreve o método login específico para a classe Profissional
    public String logout(){
        return "Logout específico do Profissional";
    }
    
}
