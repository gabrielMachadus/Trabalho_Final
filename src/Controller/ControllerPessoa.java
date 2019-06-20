/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ArquivoDeDados;
import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.Endereco;
import View.vCadPessoa;
/**
 *
 * @author Gabriel.Machado
 */
public class ControllerPessoa {
    ArrayList<Pessoa> clientes;
    public  ArrayList<Pessoa> cadastrarPessoa(vCadPessoa frm){
        Pessoa p = new Pessoa();
        Endereco end1 = new Endereco();
        clientes = frm.getClientes();
        JOptionPane.showMessageDialog(frm, "entrei cadastrar!!");
        p.setNome(frm.getjTextFieldNome().getText());
        end1.setRua(frm.getjTextFieldRua().getText());
        end1.setNumero(Integer.parseInt(frm.getjTextFieldNumero().getText()));
        end1.setCidade(frm.getjTextFieldCidade().getText());
        end1.setCep(frm.getjFormattedTextFieldCep().getText());
        p.setRg(frm.getjFormattedTextFieldRg().getText());
        p.setCpf(frm.getjFormattedTextFieldCpf().getText());
        p.setTelefone(frm.getjFormattedTextFieldTelefone().getText());
        p.setLogin(frm.getjTextFieldUsuario().getText());
        p.setSenha(String.valueOf(frm.getjPasswordField().getPassword()));
        clientes.add(p);
        ArquivoDeDados arq = new ArquivoDeDados();
        arq.gravarArquivoDeDados(clientes, "clientes.txt");
        return clientes;
    }
    
    public  ArrayList<Pessoa> AlterarPessoa(vCadPessoa frm,int indice){
        Pessoa p = new Pessoa();
        p = clientes.get(indice);
        Endereco end1 = new Endereco();
        clientes = frm.getClientes();
        JOptionPane.showMessageDialog(frm, "entrei alterar!!");
        p.setNome(frm.getjTextFieldNome().getText());
        end1.setRua(frm.getjTextFieldRua().getText());
        end1.setNumero(Integer.parseInt(frm.getjTextFieldNumero().getText()));
        end1.setCidade(frm.getjTextFieldCidade().getText());
        end1.setCep(frm.getjFormattedTextFieldCep().getText());
        p.setRg(frm.getjFormattedTextFieldRg().getText());
        p.setCpf(frm.getjFormattedTextFieldCpf().getText());
        p.setTelefone(frm.getjFormattedTextFieldTelefone().getText());
        p.setLogin(frm.getjTextFieldUsuario().getText());
        p.setSenha(String.valueOf(frm.getjPasswordField().getPassword()));
        clientes.add(indice,p);
        return clientes;
    }

    
     public  ArrayList<String> mostrarLista(ArrayList<Pessoa> clientes){
        ArrayList<String> dados = new ArrayList<String>();
        int i =0 ;
         for(Pessoa p: clientes){
            dados.add(i +" - "+ p.getNome());
            i++;
        }
        return dados;
     }
     
     
     /***
      Este método serve para preencher a lista com 1 objeto generico de teste
      */
     public   ArrayList<Pessoa> preencherLista(){
         ArrayList<Pessoa> lista = new ArrayList<>();
         Endereco end1 = new Endereco("Rua XYX,", 1523, "123.123.000-63", "S/C", "POA - RS");
         Pessoa p0 = new Pessoa("João Bernardo dos Santos", "025.123.410-12", "74455541559", "adm", "(51)342-999-999",end1);
        lista.add(p0);
        return lista;
     }
    
}
