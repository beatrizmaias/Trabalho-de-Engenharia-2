/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Daniel
 */
public class viewInicial extends javax.swing.JFrame {

    /**
     * Creates new form viewSobre
     */
    public viewInicial() {
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

        jPanel1 = new javax.swing.JPanel();
        btConfiguracoes = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btCampeonatos = new javax.swing.JButton();
        btInserirParticipanteEmEvento = new javax.swing.JButton();
        btControleAssociados = new javax.swing.JButton();
        btSobre = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setup.png"))); // NOI18N
        btConfiguracoes.setText("Configurações");
        btConfiguracoes.setPreferredSize(new java.awt.Dimension(150, 60));
        btConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfiguracoesActionPerformed(evt);
            }
        });

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setPreferredSize(new java.awt.Dimension(150, 60));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setPreferredSize(new java.awt.Dimension(150, 60));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btCampeonatos.setBackground(new java.awt.Color(0, 51, 204));
        btCampeonatos.setForeground(new java.awt.Color(0, 51, 204));
        btCampeonatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trofeu.png"))); // NOI18N
        btCampeonatos.setText("Campeonatos");
        btCampeonatos.setAutoscrolls(true);
        btCampeonatos.setPreferredSize(new java.awt.Dimension(150, 60));
        btCampeonatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCampeonatosActionPerformed(evt);
            }
        });

        btInserirParticipanteEmEvento.setBackground(new java.awt.Color(255, 0, 0));
        btInserirParticipanteEmEvento.setForeground(new java.awt.Color(153, 0, 204));
        btInserirParticipanteEmEvento.setText("Participante em evento");
        btInserirParticipanteEmEvento.setAutoscrolls(true);
        btInserirParticipanteEmEvento.setOpaque(false);
        btInserirParticipanteEmEvento.setPreferredSize(new java.awt.Dimension(150, 60));
        btInserirParticipanteEmEvento.setRequestFocusEnabled(false);
        btInserirParticipanteEmEvento.setRolloverEnabled(false);
        btInserirParticipanteEmEvento.setVerifyInputWhenFocusTarget(false);
        btInserirParticipanteEmEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirParticipanteEmEventoActionPerformed(evt);
            }
        });

        btControleAssociados.setText("Controle de associados");
        btControleAssociados.setPreferredSize(new java.awt.Dimension(150, 60));
        btControleAssociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btControleAssociadosActionPerformed(evt);
            }
        });

        btSobre.setText("Sobre");
        btSobre.setPreferredSize(new java.awt.Dimension(150, 60));
        btSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSobreActionPerformed(evt);
            }
        });

        jButton8.setText("Sair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JSoft");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btInserirParticipanteEmEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btControleAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCampeonatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCampeonatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserirParticipanteEmEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btControleAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton8)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewLogin().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSobreActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewSobre().setVisible(true);
    }//GEN-LAST:event_btSobreActionPerformed

    private void btControleAssociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btControleAssociadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btControleAssociadosActionPerformed

    private void btInserirParticipanteEmEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirParticipanteEmEventoActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewCadastroAssociadoCampeonato().setVisible(true);
    }//GEN-LAST:event_btInserirParticipanteEmEventoActionPerformed

    private void btCampeonatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCampeonatosActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewCampeonatos().setVisible(true);
    }//GEN-LAST:event_btCampeonatosActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewBuscar().setVisible(true);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewCadastrar().setVisible(true);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfiguracoesActionPerformed
        // TODO add your handling code here:
        dispose();//fecha  tela atual
        new viewConfigurações().setVisible(true);//abre a nova tela
    }//GEN-LAST:event_btConfiguracoesActionPerformed

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
            java.util.logging.Logger.getLogger(viewInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCampeonatos;
    private javax.swing.JButton btConfiguracoes;
    private javax.swing.JButton btControleAssociados;
    private javax.swing.JButton btInserirParticipanteEmEvento;
    private javax.swing.JButton btSobre;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
