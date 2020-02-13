package br.com.ifba.mili.funcionario.view;


import br.com.ifba.mili.fornecedor.view.TelaCadastroFornecedor;
import br.com.ifba.mili.infrastructure.view.TelaVerificarEstoque;

/**
 *
 * @author lab02
 */

public class TelaGerente extends javax.swing.JFrame {
    private final TelaCadastroFuncionario cFuncionario;
    private final TelaCadastroFornecedor cFornecedor;
    private final PesquisarFuncionario pFuncionario;
    private final TelaVerificarEstoque vEstoque;
    
    public TelaGerente() {
        initComponents();
        
        cFuncionario = new TelaCadastroFuncionario();
        cFornecedor = new TelaCadastroFornecedor();
        pFuncionario = new PesquisarFuncionario();
        vEstoque = new TelaVerificarEstoque(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBTPesquisarFuncionario = new javax.swing.JButton();
        jBTCadastrarFuncionario = new javax.swing.JButton();
        jBTCadastrarFornecedor = new javax.swing.JButton();
        jBTVerificarEstoque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBTSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Gerente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBTPesquisarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        jBTPesquisarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/funcionarios.png"))); // NOI18N
        jBTPesquisarFuncionario.setText("Pesquisar Funcionário");
        jBTPesquisarFuncionario.setMaximumSize(new java.awt.Dimension(111, 35));
        jBTPesquisarFuncionario.setMinimumSize(new java.awt.Dimension(111, 35));
        jBTPesquisarFuncionario.setPreferredSize(new java.awt.Dimension(111, 35));
        jBTPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTPesquisarFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(jBTPesquisarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 220, -1));

        jBTCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        jBTCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/novoFuncionario.png"))); // NOI18N
        jBTCadastrarFuncionario.setText("Cadastrar Funcionário");
        jBTCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(jBTCadastrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, -1));

        jBTCadastrarFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jBTCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fornecedores.png"))); // NOI18N
        jBTCadastrarFornecedor.setText("Cadastrar Fornecedor");
        jBTCadastrarFornecedor.setMaximumSize(new java.awt.Dimension(111, 35));
        jBTCadastrarFornecedor.setMinimumSize(new java.awt.Dimension(111, 35));
        jBTCadastrarFornecedor.setPreferredSize(new java.awt.Dimension(111, 35));
        jBTCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCadastrarFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(jBTCadastrarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 220, -1));

        jBTVerificarEstoque.setBackground(new java.awt.Color(255, 255, 255));
        jBTVerificarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VerEstoque.png"))); // NOI18N
        jBTVerificarEstoque.setText("Verificar Estoque");
        jBTVerificarEstoque.setMaximumSize(new java.awt.Dimension(111, 35));
        jBTVerificarEstoque.setMinimumSize(new java.awt.Dimension(111, 35));
        jBTVerificarEstoque.setPreferredSize(new java.awt.Dimension(111, 35));
        jBTVerificarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTVerificarEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(jBTVerificarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modulo do Gerente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gerente.png"))); // NOI18N

        jBTSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBTSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        jBTSair.setText("Sair");
        jBTSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(jBTSair)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBTSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBTSairActionPerformed

    private void jBTCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCadastrarFuncionarioActionPerformed
        cFuncionario.setLocationRelativeTo(null);
        cFuncionario.setVisible(true);
    }//GEN-LAST:event_jBTCadastrarFuncionarioActionPerformed
    
    private void jBTCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCadastrarFornecedorActionPerformed
        cFornecedor.setLocationRelativeTo(null);
        cFornecedor.setVisible(true);
    }//GEN-LAST:event_jBTCadastrarFornecedorActionPerformed

    private void jBTPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTPesquisarFuncionarioActionPerformed
        pFuncionario.setLocationRelativeTo(null);
        pFuncionario.setVisible(true);
    }//GEN-LAST:event_jBTPesquisarFuncionarioActionPerformed
    
    private void jBTVerificarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTVerificarEstoqueActionPerformed
        vEstoque.setLocationRelativeTo(null);
        vEstoque.setVisible(true);
    }//GEN-LAST:event_jBTVerificarEstoqueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCadastrarFornecedor;
    private javax.swing.JButton jBTCadastrarFuncionario;
    private javax.swing.JButton jBTPesquisarFuncionario;
    private javax.swing.JButton jBTSair;
    private javax.swing.JButton jBTVerificarEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}