package Classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class  Controle implements Serializable {
    
    //Atributos
    
    private ArrayList<Object> listaPessoas;
    private ArrayList<Object> listaAux;
    private Pessoa usuarioLogado=null;
    
    public Controle(){
        listaPessoas=new ArrayList<>();
    }
    
    //Métodos
    
    public void addUsuario(String nome, String cpf, String email, String login, String senha, String tipoPessoa) throws Exception {
        // Adicione um novo usuário à lista.
        listaPessoas.add(new Pessoa (nome, cpf, email, login, senha, tipoPessoa ));
    }
    
    public void addProfissional(String crp, String nome, String cpf, String email, String login, String senha, String tipoPessoa) throws Exception {
        // Adicione um novo profissional à lista.
        listaPessoas.add(new Profissional(crp, nome, cpf, email, login, senha));
    }

    // Permite obter um objeto "Pessoa"
    public Pessoa getListaPessoas(int indice){
        if(indice< listaPessoas.size())
            return (Pessoa)listaPessoas.get(indice);
        else
            return null;
    }
    
    public Pessoa getPessoa(int indice){
        //Retorna a pessoa da listaPessoa indica pela listaAux
        return (Pessoa)listaPessoas.get(listaPessoas.indexOf(listaAux.get(indice)));
    }
    
    public void removerPessoa(int indice){
        //Remove a pessoa da listaPessoa indica pela listaAux
        listaPessoas.remove(listaAux.get(indice));
    }
        
    // Permite editar uma pessoa em uma lista
    public void editarPessoa(int indice, String nome, String cpf, String email, String senha, Date dataNascimento) throws Exception {
        Pessoa aux = (Pessoa) listaAux.get(indice);
        aux.setNome(nome);
        aux.setCpf(cpf);
        aux.setEmail(email);
        aux.setSenha(senha);
    }

    public ArrayList<Object> getListaPessoas(){
        return listaPessoas;
    }
    
    public int getListaTamanho(){
        return listaPessoas.size();
    }
    
    // Ppesquisar e formatar uma lista de pessoas com base no tipo de classe
    public List<String> pesquisaListaPessoas(Class<?> tipoClasse) {
        Pessoa pessoa;
        String aux;
        List<String> lista = new ArrayList<>();  // Lista para armazenar informações formatadas
        listaAux = new ArrayList<>();  // Lista auxiliar para armazenar referências a objetos Pessoa

        // Itera sobre a lista de pessoas
        for (int i = 0; i < getListaTamanho(); i++) {
            aux = "";  // String auxiliar para armazenar informações sobre a pessoa
            pessoa = getListaPessoas(i);  // Obtém a pessoa da lista

            // Verifica se a classe da pessoa é compatível com o tipoClasse fornecido
            if (tipoClasse == null || tipoClasse.isAssignableFrom(pessoa.getClass())) {
                aux += formatarTipoPessoa(pessoa);  // Formata as informações com base no tipo de pessoa
                lista.add(aux);  // Adiciona a informação formatada à lista
                listaAux.add(pessoa);  // Adiciona a referência da pessoa à lista auxiliar
            }
        }
        return lista;  // Retorna a lista de informações formatadas
    }

    // Classificar o tipo de pessoa
    private String formatarTipoPessoa(Pessoa pessoa) {
        // Verifica o tipo da pessoa e retorna uma string formatada correspondente
        if (pessoa.getClass() == Usuario.class) {
            return "<Usuário> " + pessoa.getNome();
        } else if (pessoa.getClass() == Profissional.class) {
            return "<Profissional> " + pessoa.getNome();
        } else {
            return "";  // Lógica para outros tipos, se necessário
        }
    }
    
    //Controlar o login
    public String login(String email, String senha) {
        for (Object pessoaObj : listaPessoas) {
            if (pessoaObj instanceof Pessoa) {
                Pessoa usuarioOuProfissional = (Pessoa) pessoaObj;
                if (usuarioOuProfissional.getEmail().equals(email) && usuarioOuProfissional.getSenha().equals(senha)) {
                    usuarioLogado = usuarioOuProfissional;
                    return "Login bem-sucedido";
                }
            }
            // Adicione lógica para outros tipos de pessoa, se necessário
        }

        return "Login falhou";
    }
    
    //Controlar o logout
    public String logout(){
                 
        if(usuarioLogado.getClass().equals(Usuario.class)){
            Usuario usuario=(Usuario)usuarioLogado;
            usuarioLogado=null;
            return usuario.logout();  
        }
        else if(usuarioLogado.getClass().equals(Profissional.class)){
            Profissional profissional=(Profissional)usuarioLogado;
            usuarioLogado =null;
            return profissional.logout();
        }
        
        else{
            return "Usuario não possui acesso para Logout!";
        }
    }
    
    //Visualizar o user atual logado
    public String getUsuarioLogado(){
        return usuarioLogado.getNome();
    }
    
    //Manipulação de Arquivos: Salvar
    public void salvar(String endereco) throws IOException{
        Serializador.gravar(endereco, listaPessoas);            
    }
    
    //Manipulação de Arquivos: Abrir
    public void abrir(String endereco) throws IOException, FileNotFoundException, ClassNotFoundException{
        Object arquivo;        
        arquivo=Serializador.ler(endereco);
        listaPessoas = (ArrayList) arquivo;    
    }
    
    
}

