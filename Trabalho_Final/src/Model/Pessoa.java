/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gabriel2.silva
 */
public class Pessoa {
    private String nome;
    private String cpf = "000.000.000-00";
    private String rg="11234567890";
    private String login;
    private Endereco endereco;
    private String telefone="(00)000-000-000";

    public Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    public Pessoa(String nome,String cpf, String rg, String login, String tel,Endereco endereco) {
        this.nome = nome;
        this.login = login;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = tel;
    }


    
}
