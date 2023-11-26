/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastros;
import com.mycompany.instrumentosdao.ClientesDao;
import com.mycompany.instrumentosdao.ProdutosDao;
import com.mycompany.lojadeinstrumentos.SistemaDaFirma;
import com.mycompany.models.Produtos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.asteixeira1
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeCadastro = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        lblCorCadastro = new javax.swing.JLabel();
        txtCorCadastro = new javax.swing.JTextField();
        lblEstoqueCadastro = new javax.swing.JLabel();
        lblCorCadastro1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtQtdEstoque = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Tela Cadastro Produtos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Tela Cadastro Produtos");

        lblNomeCadastro.setText("Nome:");

        txtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastroActionPerformed(evt);
            }
        });

        lblCorCadastro.setText("Cor:");

        txtCorCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorCadastroActionPerformed(evt);
            }
        });

        lblEstoqueCadastro.setText("Quantidade em Estoque:");

        lblCorCadastro1.setText("Preço:");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtQtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdEstoqueActionPerformed(evt);
            }
        });
        txtQtdEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdEstoqueKeyTyped(evt);
            }
        });

        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });
        txtPrecoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoProdutoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCadastro)
                                    .addComponent(txtNomeCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblCorCadastro)
                                .addComponent(txtCorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCorCadastro1)
                                .addComponent(lblEstoqueCadastro)))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblNomeCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCorCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstoqueCadastro)
                .addGap(6, 6, 6)
                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCorCadastro1)
                .addGap(12, 12, 12)
                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadastroActionPerformed

    private void txtCorCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorCadastroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomeProduto = txtNomeCadastro.getText();
        String corProduto = txtCorCadastro.getText();
        int estoqueProduto = Integer.parseInt(txtQtdEstoque.getText());
        int precoProduto = Integer.parseInt(txtPrecoProduto.getText());
        
        String mensagemErro = "";
        
        if (nomeProduto.isEmpty() || corProduto.isEmpty() || estoqueProduto <= 0
                || precoProduto <= 0){
           
            //ciclo repetitivo caso tenha algum vazio
        
            txtNomeCadastro.setBackground(Color.white);
            txtCorCadastro.setBackground(Color.white);
            txtQtdEstoque.setBackground(Color.white);
            txtPrecoProduto.setBackground(Color.white);

            if (nomeProduto.isEmpty()) {
                mensagemErro = mensagemErro + "\n Digite um nome válido";
                txtNomeCadastro.requestFocus();
                txtNomeCadastro.setBackground(Color.red);
            }
            if (corProduto.isEmpty()) {
                mensagemErro = mensagemErro + "\n Digite uma cor válida";
                txtCorCadastro.requestFocus();
                txtCorCadastro.setBackground(Color.red);
            }
            if (estoqueProduto <= 0) {
                mensagemErro = mensagemErro + "\n Digite um número no estoque válido";
                txtQtdEstoque.setBackground(Color.red);
            }
            if (precoProduto <= 0) {
                mensagemErro = mensagemErro + "\n Digite um valor correto para o preço";
                txtPrecoProduto.setBackground(Color.red);
            }
            JOptionPane.showMessageDialog(rootPane, mensagemErro);
        } else {
            Produtos produto = new Produtos(nomeProduto, corProduto, estoqueProduto, precoProduto);
            boolean retorno = ProdutosDao.SalvarProdutos(produto);
            if (retorno) {
                JOptionPane.showMessageDialog(rootPane, "Sucesso");
                SistemaDaFirma x = new SistemaDaFirma();
                x.setVisible(true);
                this.setVisible(false);
            } else {
            JOptionPane.showMessageDialog(rootPane, "Falha");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtQtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdEstoqueActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void txtQtdEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdEstoqueKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE))
        {
        evt.consume();
        }
        if(txtQtdEstoque.getText().length()>=10){
        evt.consume();
        JOptionPane.showMessageDialog(this,"Máximo de 10 caracteres atingido!");
    }
    }//GEN-LAST:event_txtQtdEstoqueKeyTyped

    private void txtPrecoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoProdutoKeyTyped
        char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE))
        {
        evt.consume();
        }
        if(txtPrecoProduto.getText().length()>=7){
        evt.consume();
        JOptionPane.showMessageDialog(this,"Máximo de 7 caracteres atingido!");
        }
    }//GEN-LAST:event_txtPrecoProdutoKeyTyped

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCorCadastro;
    private javax.swing.JLabel lblCorCadastro1;
    private javax.swing.JLabel lblEstoqueCadastro;
    private javax.swing.JLabel lblNomeCadastro;
    private javax.swing.JTextField txtCorCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables
}
