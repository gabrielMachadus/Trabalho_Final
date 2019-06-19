/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Gabriel Machado
 */
public class Anuncio implements Serializable{
    private String caminho_imagem;
    private Produto produto;
    private String login_cadastrador_anuncio;

    public String getCaminho_imagem() {
        return caminho_imagem;
    }

    public void setCaminho_imagem(String caminho_imagem) {
        this.caminho_imagem = caminho_imagem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getLogin_cadastrador_anuncio() {
        return login_cadastrador_anuncio;
    }

    public void setLogin_cadastrador_anuncio(String login_cadastrador_anuncio) {
        this.login_cadastrador_anuncio = login_cadastrador_anuncio;
    }

    public Anuncio(String caminho_imagem, Produto produto) {
        this.caminho_imagem = caminho_imagem;
        this.produto = produto;
    }

    public Anuncio() {
    }
    
    
}
