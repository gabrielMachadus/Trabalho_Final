/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.Endereco;
/**
 *
 * @author Gabriel.Machado
 */
public class ControllerPessoa {
    public static ArrayList<Pessoa> cadastrarPessoa(ArrayList<Pessoa> clientes){
        Pessoa p = new Pessoa();
        Endereco end1 = new Endereco();
        p.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente:",p.getNome()));
        end1.setRua(JOptionPane.showInputDialog("Digite a rua:",end1.getRua()));
        end1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número:",end1.getNumero())));
        end1.setCidade(JOptionPane.showInputDialog("Digite a cidade:",end1.getCidade()));
        end1.setCep(JOptionPane.showInputDialog("Digite o CEP:",end1.getCep()));
        p.setRg(JOptionPane.showInputDialog("Digite o RG:",p.getRg()));
        p.setCpf(JOptionPane.showInputDialog("Digite o CPF:",p.getCpf()));
        p.setTelefone(JOptionPane.showInputDialog("Digite o telefone:",p.getTelefone()));
        clientes.add(p);
        return clientes;
    }
    
    public static ArrayList<Pessoa> AlterarPessoa(ArrayList<Pessoa> clientes,int indice){
        Pessoa p = new Pessoa();
        p = clientes.get(indice);
        Endereco end1 = p.getEndereco();
        p.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente:",p.getNome()));
        end1.setRua(JOptionPane.showInputDialog("Digite a rua:",end1.getRua()));
        end1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número:",end1.getNumero())));
        end1.setCidade(JOptionPane.showInputDialog("Digite a cidade:",end1.getCidade()));
        end1.setCep(JOptionPane.showInputDialog("Digite o CEP:",end1.getCep()));
        clientes.add(indice,p);
        return clientes;
    }
    
     public  ArrayList<Pessoa> RemoverPessoa(ArrayList<Pessoa> clientes){
        Pessoa p = new Pessoa();
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(mostrarLista(clientes)));
        p = clientes.get(codigo);
        clientes.remove(p);
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
     
     
     
     public  ArrayList<Pessoa> preencherLista(){
         ArrayList<Pessoa> lista = new ArrayList<>();
         Endereco end1 = new Endereco("Rua X,", 1523, "123.123.000-63", "S/C", "POA - RS");
         Pessoa p0 = new Pessoa("João Bernardo dos Santos", "025.162.410-85", "74455541559", "login1", "(51)342-999-999",end1);
         Pessoa p1 = new Pessoa("João Bernardo dos Santos", "025.162.410-85", "74455541559", "login2", "(51)342-999-999",end1);
         Pessoa p2 = new Pessoa("João Bernardo dos Santos", "025.162.410-85", "74455541559", "login3", "(51)342-999-999",end1);
         Pessoa p3 = new Pessoa("João Bernardo dos Santos", "025.162.410-85", "74455541559", "login4", "(51)342-999-999",end1);
         Pessoa p4 = new Pessoa("João Bernardo dos Santos", "025.162.410-85", "74455541559", "login5", "(51)342-999-999",end1);
        
         lista.add(p0);
         lista.add(p1);
         lista.add(p2);
         lista.add(p3);
         lista.add(p4);
         return lista;
     }
    
}
