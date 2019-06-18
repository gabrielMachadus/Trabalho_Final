/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *essa classe grava objetos em arquivos
 * @author Gabriel Machado
 */
public class ArquivoDeDados {
    public  void gravarArquivoDeDados(ArrayList lista,String nome_arquivo){
        try {
            FileOutputStream arquivo = new FileOutputStream(nome_arquivo);
            ObjectOutputStream obj = new ObjectOutputStream(arquivo);
            obj.writeObject(lista);
            obj.flush();
            obj.close();
        } catch (IOException e) {
           System.out.print("Exceção no método gravarArquivoDeDados"+e.toString());
        }
    }
    
    /**
     * 
     * @param nome_arquivo = "arquivo que vai conter os dados a serem lidos"
     * @return = "ArrayList com os dados"
     * @throws ClassNotFoundException 
     */
     public  ArrayList lerArquivoDeDados(String nome_arquivo) throws ClassNotFoundException{
        ArrayList lista = null;
         try {
            FileInputStream arquivo = new FileInputStream(nome_arquivo);
            ObjectInputStream obj = new ObjectInputStream(arquivo);
            lista = (ArrayList)obj.readObject();
            obj.close();           
        } catch (IOException e) {
            System.out.print("Exceção no método lerArquivoDeDados"+e.toString());
        }
        return lista;
    }
}
