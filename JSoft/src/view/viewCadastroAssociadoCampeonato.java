/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.AssociadoDAO;
import DAO.EventoDAO;
import DAO.EventoParticipanteDAO;
import conexao.ConectaBanco;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Associado;
import model.Evento;
import model.EventoParticipante;

/**
 *
 * @author Laecio
 */
public class viewCadastroAssociadoCampeonato extends javax.swing.JFrame {

    
    /**
     * Creates new form viewCadastroAssociadoCampeonato
     */
    public viewCadastroAssociadoCampeonato() {
        
        initComponents();

        ArrayList<Evento> eventos = new ArrayList<>();

        jcAssociado.removeAllItems();
        jcEventos.removeAllItems();

        EventoDAO edao = new EventoDAO();
        eventos = edao.retornaTodos();
        
        for(int i=0; i<eventos.size(); i++){
            jcEventos.addItem(""+eventos.get(i).getId());
        }        

    }
    
    public String pegarFaixaCampeonato(int id){
        
        ConectaBanco c = new ConectaBanco();
        
        String results = "";
        
        String cmd = "select faixa from evento where id='"+ id +"'";
        Statement stmt;
        ResultSet dados=null;
        c.conexao();
        try {
            stmt = c.conn.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            while(dados.next()){
                String usuario = dados.getString(1);
                results = usuario;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        
        return results;        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btVoltar10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcEventos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btCarregarAssociados = new javax.swing.JButton();
        btInserirParticipante = new javax.swing.JButton();
        jcAssociado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel12.setBackground(new java.awt.Color(0, 102, 204));
        jPanel12.setPreferredSize(new java.awt.Dimension(811, 226));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Inserir associado");

        jLabel26.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Cadastrar um associado em um campeonato");

        btVoltar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        btVoltar10.setContentAreaFilled(false);
        btVoltar10.setFocusable(false);
        btVoltar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltar10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btVoltar10)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addComponent(btVoltar10))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jcEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcEventos.setFocusable(false);
        jcEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEventosActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Evento");

        btCarregarAssociados.setText("Carregar associados de acordo com a faixa");
        btCarregarAssociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarAssociadosActionPerformed(evt);
            }
        });

        btInserirParticipante.setText("Inserir participante");
        btInserirParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirParticipanteActionPerformed(evt);
            }
        });

        jcAssociado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAssociadoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Associado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCarregarAssociados)
                    .addComponent(btInserirParticipante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btCarregarAssociados))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserirParticipante)
                    .addComponent(jLabel3))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirParticipanteActionPerformed
        // TODO add your handling code here:
        EventoParticipante e = new EventoParticipante(Integer.parseInt(jcEventos.getSelectedItem().toString())
                ,Integer.parseInt(jcAssociado.getSelectedItem().toString()));
        
        EventoParticipanteDAO edao = new EventoParticipanteDAO();
        edao.adiciona(e);
        
    }//GEN-LAST:event_btInserirParticipanteActionPerformed

    private void jcEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEventosActionPerformed

    private void jcAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAssociadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcAssociadoActionPerformed

    private void btCarregarAssociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarAssociadosActionPerformed
        // TODO add your handling code here:
        ArrayList<Associado> associados = new ArrayList<>();

        String faixa = pegarFaixaCampeonato(Integer.parseInt(jcEventos.getSelectedItem().toString()));
        
        jcAssociado.removeAllItems();
        AssociadoDAO adao = new AssociadoDAO();
        associados = adao.retornaTodos();
        
        for(int i=0; i<associados.size(); i++){
            if(faixa.equals("Infantil")){
                
                if(associados.get(i).getFaixa().equals("Branco") || associados.get(i).getFaixa().equals("Azul")){
                    jcAssociado.addItem(""+associados.get(i).getId());
                }
                
            } else if(faixa.equals("Juvenil")){
                
                if(associados.get(i).getFaixa().equals("Branco") || associados.get(i).getFaixa().equals("Azul")
                        || associados.get(i).getFaixa().equals("Amarelo") || associados.get(i).getFaixa().equals("Laranja")){
                    
                    
                    
                    jcAssociado.addItem(""+associados.get(i).getId());
                }
                
            } else if(faixa.equals("Junior")){

                if(associados.get(i).getFaixa().equals("Branco") || associados.get(i).getFaixa().equals("Azul")
                        || associados.get(i).getFaixa().equals("Amarelo") || associados.get(i).getFaixa().equals("Laranja")
                        || associados.get(i).getFaixa().equals("Roxo")){

                    jcAssociado.addItem(""+associados.get(i).getId());
                    
                }
                
            } else{

                jcAssociado.addItem(""+associados.get(i).getId());
                
            }
        }
        
    }//GEN-LAST:event_btCarregarAssociadosActionPerformed

    private void btVoltar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltar10ActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewInicial().setVisible(true);
    }//GEN-LAST:event_btVoltar10ActionPerformed

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
            java.util.logging.Logger.getLogger(viewCadastroAssociadoCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCadastroAssociadoCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCadastroAssociadoCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCadastroAssociadoCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCadastroAssociadoCampeonato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarregarAssociados;
    private javax.swing.JButton btInserirParticipante;
    private javax.swing.JButton btVoltar10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JComboBox<String> jcAssociado;
    private javax.swing.JComboBox<String> jcEventos;
    // End of variables declaration//GEN-END:variables
}
