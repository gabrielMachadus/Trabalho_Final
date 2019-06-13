/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPessoa;
import Model.Pessoa;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Gabriel Machado
 */
public class vCadPessoa extends javax.swing.JFrame {

    /**
     * Creates new form vCadPessoa
     */
    public vCadPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListClientes = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setAlwaysOnTop(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("RG");

        jLabel4.setText("Telefone");

        jLabel5.setText("Endereço");

        jFormattedTextFieldCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCpfFocusGained(evt);
            }
        });

        jFormattedTextFieldTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldTelefoneFocusGained(evt);
            }
        });
        jFormattedTextFieldTelefone.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jFormattedTextFieldTelefoneComponentShown(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastro de Cliente");

        jListClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListClientes);

        jLabel7.setText("Lista de Cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldTelefone)
                                    .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(10, 10, 10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextFieldCpf)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(88, 88, 88))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAlterar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfFocusGained
       
    }//GEN-LAST:event_jFormattedTextFieldCpfFocusGained

    private void jListClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListClientesMouseClicked
        int indice = jListClientes.getSelectedIndex();
        Pessoa p = clientes.get(indice);
        carregaPessoaTela(p);        
        jButtonAlterar.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jListClientesMouseClicked

    private void jFormattedTextFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneFocusGained
       
    }//GEN-LAST:event_jFormattedTextFieldTelefoneFocusGained

    private void jFormattedTextFieldTelefoneComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefoneComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         //Faz formatação do campo CPF
        try {
                jFormattedTextFieldCpf.setFormatterFactory(new DefaultFormatterFactory(
                        new MaskFormatter("###.###.###-##")));
                
        } catch (ParseException e) {
                e.printStackTrace();
        }
        
         //Faz formatação do campo CPF
        try {
                jFormattedTextFieldTelefone.setFormatterFactory(new DefaultFormatterFactory(
                        new MaskFormatter("(##)###-###-###")));
                
        } catch (ParseException e) {
                e.printStackTrace();
        }
        
          //Faz formatação do campo RG
        try {
                jFormattedTextFieldRg.setFormatterFactory(new DefaultFormatterFactory(
                        new MaskFormatter("###########")));
                
        } catch (ParseException e) {
                e.printStackTrace();
        }
        geraPessoaGenericaTela();
        bloqueiaComponentes();
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        preencheJListGenerica();
    }//GEN-LAST:event_formComponentShown

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if(jButtonCadastrar.getText().equals("Salvar")){
            jButtonCadastrar.setText("Cadastrar");           
            bloqueiaComponentes();
            jListClientes.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Dados cadastrados!!");
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }else if(jButtonCadastrar.getText().equals("Cadastrar")){
            jButtonCadastrar.setText("Salvar");
            geraPessoaGenericaTela();
            liberaComponentes();      
            jListClientes.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int codigoExcluir = jListClientes.getSelectedIndex();
        if(codigoExcluir!=-1){
            Pessoa p = clientes.get(codigoExcluir);
            //0-sim 1-não 2-cancelar x-1
            int x = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o cliente " + p.getNome()+" ? ");
            if(x==0){
                clientes.remove(codigoExcluir);
                atualizaJList();
                geraPessoaGenericaTela();
            }    
        }else{
            JOptionPane.showMessageDialog(this, "Lista vazia ou item não selecionado");
        }
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        bloqueiaBtnJList();
        liberaComponentes();
        jButtonCadastrar.setText("Salvar");
        jButtonCadastrar.setEnabled(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

   void geraPessoaGenericaTela(){
       Pessoa p = new Pessoa();
       jTextFieldNome.setText(p.getNome());
       jFormattedTextFieldCpf.setText(p.getCpf());
       jFormattedTextFieldTelefone.setText(p.getTelefone());
       jFormattedTextFieldRg.setText(p.getRg());
       jTextFieldEndereco.setText(p.getEndereco());
   }
   
   void carregaPessoaTela(Pessoa p){
       jTextFieldNome.setText(p.getNome());
       jFormattedTextFieldCpf.setText(p.getCpf());
       jFormattedTextFieldTelefone.setText(p.getTelefone());
       jFormattedTextFieldRg.setText(p.getRg());
       jTextFieldEndereco.setText(p.getEndereco());
   }
   
   
   void bloqueiaComponentes(){
       jTextFieldNome.setEnabled(false);
       jFormattedTextFieldCpf.setEnabled(false);
       jFormattedTextFieldTelefone.setEnabled(false);
       jFormattedTextFieldRg.setEnabled(false);
       jTextFieldEndereco.setEnabled(false);
     
   }
   
    void liberaComponentes(){
       jTextFieldNome.setEnabled(true);
       jFormattedTextFieldCpf.setEnabled(true);
       jFormattedTextFieldTelefone.setEnabled(true);
       jFormattedTextFieldRg.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       
    }
    //alterar metodo para carregar dados de arquivo de texto
    void preencheJListGenerica(){
        Controller.ControllerPessoa cp = new ControllerPessoa();
        clientes = cp.preencherLista();
        ArrayList<String> nomes =  cp.mostrarLista(clientes);
        DefaultListModel model = new DefaultListModel();
        for (String s : nomes) {
            jListClientes.setModel(model);
            model.addElement(s);
        }
    }
    
    void atualizaJList(){
        ArrayList<String> nomes =  cp.mostrarLista(clientes);
        DefaultListModel model = new DefaultListModel();
        if(nomes.size()>0){
            JOptionPane.showMessageDialog(this, "Tamanho Lista:"+nomes.size());
            
            for (String s : nomes) {
                jListClientes.setModel(model);
                model.addElement(s);
            }
        }else{
            jListClientes.setModel(model);
            model.addElement("");
            bloqueiaBtnJList();
        }
    }
    
    void bloqueiaBtnJList(){
        jListClientes.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }
    
    private ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();
    private Controller.ControllerPessoa cp = new ControllerPessoa();
    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Pessoa> clientes) {
        this.clientes = clientes;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}