/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cadastros;

import com.mycompany.instrumentosdao.ClientesDao;
import com.mycompany.lojadeinstrumentos.SistemaDaFirma;
import com.mycompany.models.Clientes;
import java.awt.Color;
import java.math.BigInteger;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hssilva28
 */
public class TelaDeCadastro extends javax.swing.JFrame {

    Clientes obj = null;
    public TelaDeCadastro() {
        initComponents();
        lblID.setText("");
    }
    
    public TelaDeCadastro(Clientes clienteAlterar) {
        initComponents();
        this.obj = clienteAlterar;
        
        String sexo = obj.getSexoCliente();
        String estado = obj.getEstadoCliente();
        
        lblID.setText("ID: " + String.valueOf(obj.getIdCliente()));
        txtNome.setText(String.valueOf(obj.getNomeCliente()));
//        jTextField1.setText(String.valueOf(obj.getDataCliente()));
        dcNascimento.setDate(clienteAlterar.getDataCliente());

        if (sexo.equals("Masculino")) {
            jrbM.doClick();
        } else {
            jrbF.doClick();
        }
        if (estado.equals("Casado(a)")){
            jcbEstadoCivil.setSelectedIndex(1);
        } else if (estado.equals("Solteiro(a)")){
            jcbEstadoCivil.setSelectedIndex(2);
        } else if (estado.equals("Viúvo(a)")){
            jcbEstadoCivil.setSelectedIndex(3);
        } else if (estado.equals("Divorciado(a)")){
            jcbEstadoCivil.setSelectedIndex(4);
        }
        txtCPF.setText(String.valueOf(obj.getCpfCliente().replaceAll("[\\D]", "")));
        txtCEP.setText(String.valueOf(obj.getCepCliente()));
        txtEndereco.setText(String.valueOf(obj.getEndCliente()));
        txtEmail.setText(String.valueOf(obj.getEmailCliente()));
        txtTelefone.setText(String.valueOf(obj.getTelCliente().substring(4)));
        txtDDD.setText(String.valueOf(obj.getTelCliente().substring(0, 4)));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bntconcluir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jrbF = new javax.swing.JRadioButton();
        jrbM = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jcbEstadoCivil = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEC = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtDDD = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        lblID = new javax.swing.JLabel();
        dcNascimento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("* Nome:");

        jLabel2.setText("* Sexo:");

        jLabel3.setText("* Telefone:");

        jLabel4.setText("* CEP:");

        jLabel5.setText("* Email:");

        bntconcluir.setText("Concluir");
        bntconcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntconcluirActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel9.setText("* CPF:");

        jLabel10.setText("* Endereço:");

        jLabel11.setText("* Estado Civil:");

        jLabel12.setText("* Data Nasc.:");

        jrbF.setBackground(new java.awt.Color(255, 255, 255));
        btgSexo.add(jrbF);
        jrbF.setText("F");

        jrbM.setBackground(new java.awt.Color(255, 255, 255));
        btgSexo.add(jrbM);
        jrbM.setText("M");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Cadastro Cliente");

        jcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado(a)", "Solteiro(a)", "Viúvo(a)", "Divorciado(a)" }));
        jcbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoCivilActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtEC.setForeground(new java.awt.Color(255, 255, 255));
        txtEC.setText("Campo Obrigatório *");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblID.setText("ID: ");

        dcNascimento.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNome)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbM))
                                    .addComponent(dcNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntconcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42)
                                .addComponent(txtEmail)))))
                .addGap(344, 344, 344))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(dcNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbF)
                    .addComponent(jrbM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void bntconcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntconcluirActionPerformed
        
        if(obj == null) {
            String nomeCliente = txtNome.getText();
            String cpfCliente = txtCPF.getText();
            String endCliente = txtEndereco.getText();
            String telCliente = txtDDD.getText() + txtTelefone.getText();
            String emailCliente = txtEmail.getText();
            String sexoCliente = "";
            if (jrbF.isSelected()) {
                sexoCliente = "F";
            }
            if (jrbM.isSelected()) {
                sexoCliente = "M";
            }
            String estadoCliente = jcbEstadoCivil.getSelectedItem().toString();
            Date dataCliente = dcNascimento.getDate();
            System.out.print(dataCliente);
            String cepCliente = txtCEP.getText();

            String mensagemErro = "";

            if ( (!(jrbM.isSelected() || jrbF.isSelected())) || txtNome.getText().isEmpty() || cpfCliente.equals("   .   .   -  ")
                  || txtCEP.getText().equals("     -   ") || txtEndereco.getText().isEmpty() || telCliente.isEmpty() || txtEmail.getText().isEmpty() 
                  || jcbEstadoCivil.getSelectedItem().equals("Selecione") || txtDDD.getText().equals("(  )")) {
                txtEC.setForeground(Color.white);
                jrbM.setForeground(Color.black);
                jrbF.setForeground(Color.black);
                txtNome.setBackground(Color.white);
                //jTextField1.setBackground(Color.white);
                txtCPF.setBackground(Color.white);
                txtCEP.setBackground(Color.white);
                txtEndereco.setBackground(Color.white);
                txtTelefone.setBackground(Color.white);
                txtEmail.setBackground(Color.white);

                //ciclo condicional pra checagem
                if (nomeCliente.isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um nome válido";
                    txtNome.requestFocus();
                    txtNome.setBackground(Color.red);
                }
//                if (jTextField1.getText().equals("  /  /    ")) {
//                    mensagemErro = mensagemErro + "\n Digite uma data válida";
//                    jTextField1.requestFocus();
//                    jTextField1.setBackground(Color.red);
//                }
                if (!(jrbF.isSelected()) && !(jrbM.isSelected())) {
                    mensagemErro = mensagemErro + "\n Selecione um Sexo";
                    jrbF.setForeground(Color.red);
                    jrbM.setForeground(Color.red);
                }
                if (jcbEstadoCivil.getSelectedItem().toString().equals("Selecione")) {
                    mensagemErro = mensagemErro + "\n Selecione um Estado Civil";
                    txtEC.setForeground(Color.red);
                }
                if (txtCPF.getText().equals("   .   .   -  ")) {
                    mensagemErro = mensagemErro + "\n Digite um CPF Válido";
                    txtCPF.requestFocus();
                    txtCPF.setBackground(Color.red);
                }
                if (txtCEP.getText().equals("     -   ")) {
                    mensagemErro = mensagemErro + "\n Digite um CEP válido";
                    txtCEP.requestFocus();
                    txtCEP.setBackground(Color.red);
                }
                if (txtEndereco.getText().isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um Endereço válido";
                    txtEndereco.requestFocus();
                    txtEndereco.setBackground(Color.red);
                }
                if (emailCliente.isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um E-mail válido";
                    txtEmail.requestFocus();
                    txtEmail.setBackground(Color.red);
                }
                if (txtDDD.getText().equals("(  )")) {
                    mensagemErro = mensagemErro + "\n Digite um DDD válido";
                    txtDDD.requestFocus();
                    txtDDD.setBackground(Color.red);
                }
                if (txtTelefone.getText().isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um Telefone válido";
                    txtTelefone.requestFocus();
                    txtTelefone.setBackground(Color.red);
                }
                JOptionPane.showMessageDialog(rootPane, mensagemErro);
            } else {
                Clientes cliente = new Clientes(nomeCliente, cpfCliente, endCliente, telCliente, emailCliente, sexoCliente, estadoCliente, dataCliente, cepCliente);
                boolean retorno = ClientesDao.SalvarCliente(cliente);
                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Sucesso");
                    SistemaDaFirma x = new SistemaDaFirma();
                    x.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha");
                }
            }
        } else {
            String nomeCliente = txtNome.getText();
            String cpfCliente = txtCPF.getText();
            String endCliente = txtEndereco.getText();
            String telCliente = txtDDD.getText() + txtTelefone.getText();
            String emailCliente = txtEmail.getText();
            String sexoCliente = "";
            if (jrbF.isSelected()) {
                sexoCliente = "F" ;
            }
            if (jrbM.isSelected()) {
                sexoCliente = "M";
            }
            String estadoCliente = jcbEstadoCivil.getSelectedItem().toString();
            Date dataCliente = dcNascimento.getDate();
            String cepCliente = txtCEP.getText();

            String mensagemErro = "";

            if ( (!(jrbM.isSelected() || jrbF.isSelected())) || txtNome.getText().isEmpty() || cpfCliente.equals("   .   .   -  ")
                  || txtCEP.getText().equals("     -   ") || txtEndereco.getText().isEmpty() || telCliente.isEmpty() || txtEmail.getText().isEmpty() 
                  || jcbEstadoCivil.getSelectedItem().equals("Selecione") || txtDDD.getText().equals("(  )")) {
                txtEC.setForeground(Color.white);
                jrbM.setForeground(Color.black);
                jrbF.setForeground(Color.black);
                txtNome.setBackground(Color.white);
//                jTextField1.setBackground(Color.white);
                txtCPF.setBackground(Color.white);
                txtCEP.setBackground(Color.white);
                txtEndereco.setBackground(Color.white);
                txtTelefone.setBackground(Color.white);
                txtEmail.setBackground(Color.white);

                //ciclo condicional pra checagem
                if (nomeCliente.isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um nome válido";
                    txtNome.requestFocus();
                    txtNome.setBackground(Color.red);
                }
                if (!(jrbF.isSelected()) && !(jrbM.isSelected())) {
                    mensagemErro = mensagemErro + "\n Selecione um Sexo";
                    jrbF.setForeground(Color.red);
                    jrbM.setForeground(Color.red);
                }
                if (jcbEstadoCivil.getSelectedItem().toString().equals("Selecione")) {
                    mensagemErro = mensagemErro + "\n Selecione um Estado Civil";
                    txtEC.setForeground(Color.red);
                }
                if (txtCPF.getText().equals("   .   .   -  ")) {
                    mensagemErro = mensagemErro + "\n Digite um CPF Válido";
                    txtCPF.requestFocus();
                    txtCPF.setBackground(Color.red);
                }
                if (txtCEP.getText().equals("     -   ")) {
                    mensagemErro = mensagemErro + "\n Digite um CEP válido";
                    txtCEP.requestFocus();
                    txtCEP.setBackground(Color.red);
                }
                if (txtEndereco.getText().isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um Endereço válido";
                    txtEndereco.requestFocus();
                    txtEndereco.setBackground(Color.red);
                }
                if (emailCliente.isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um E-mail válido";
                    txtEmail.requestFocus();
                    txtEmail.setBackground(Color.red);
                }
                if (txtDDD.getText().equals("(  )")) {
                    mensagemErro = mensagemErro + "\n Digite um DDD válido";
                    txtDDD.requestFocus();
                    txtDDD.setBackground(Color.red);
                }
                if (txtTelefone.getText().isEmpty()) {
                    mensagemErro = mensagemErro + "\n Digite um Telefone válido";
                    txtTelefone.requestFocus();
                    txtTelefone.setBackground(Color.red);
                }
                JOptionPane.showMessageDialog(rootPane, mensagemErro);
            } else {
                obj.setCepCliente(cepCliente);
                obj.setCpfCliente(cpfCliente);
                obj.setDataCliente(dataCliente);
                obj.setEmailCliente(emailCliente);
                obj.setEndCliente(endCliente);
                obj.setEstadoCliente(estadoCliente);
                obj.setNomeCliente(nomeCliente);
                obj.setSexoCliente(sexoCliente);
                obj.setTelCliente(telCliente);
                
                boolean retorno = ClientesDao.AlterarCliente(obj);
                
                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente alterado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha");
                }
            }
        }
    }//GEN-LAST:event_bntconcluirActionPerformed
    
    private void jcbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoCivilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntconcluir;
    private javax.swing.ButtonGroup btgSexo;
    private com.toedter.calendar.JDateChooser dcNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbEstadoCivil;
    private javax.swing.JRadioButton jrbF;
    private javax.swing.JRadioButton jrbM;
    private javax.swing.JLabel lblID;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDDD;
    private javax.swing.JLabel txtEC;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}