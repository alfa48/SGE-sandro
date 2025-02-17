/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ao.sga.dashboard;

import ao.sga.janela.caadastro.CadastroAluno;
import ao.sga.janela.caadastro.CadastroDisciplica;
import ao.sga.janela.caadastro.CadastroProf;
import ao.sga.janela.caadastro.CadastroTurma;
import ao.sga.janela.init.Main;
import ao.sga.modelo.Disc;
import ao.sga.modelo.Turma;
import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author man-tung
 */
public class DashboardAdmin extends javax.swing.JFrame {
            ArrayList<Turma> turmas = null;
            JFrame janela = null;

    /**
     * Creates new form DashboardAdmin
     */
    public DashboardAdmin() {
        initComponents();
    }
    
    public DashboardAdmin(ArrayList<Turma> turmas, JFrame janela) {
        initComponents();
        this.turmas = turmas;
        this.janela = janela;
        System.out.println(">>>>>>>>> ao.sga.dashboard.DashboardAdmin.<init>()");
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
        jLabel2 = new javax.swing.JLabel();
        btnCadastrarProfAdmin = new javax.swing.JButton();
        btnCadastroAlunoAdmin = new javax.swing.JButton();
        btnCadastrarTurmaAdmin = new javax.swing.JButton();
        btnSairAdmin1 = new javax.swing.JButton();
        btnCadastrarDisciplinaAdmin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem Vindo Adminstrador do Sistema");

        jLabel2.setText("SGE-SANDRO");

        btnCadastrarProfAdmin.setText("Cadastrar Professor");
        btnCadastrarProfAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProfAdminActionPerformed(evt);
            }
        });

        btnCadastroAlunoAdmin.setText("Cadastrar Aluno");
        btnCadastroAlunoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroAlunoAdminActionPerformed(evt);
            }
        });

        btnCadastrarTurmaAdmin.setText("Cadastrar Turma");
        btnCadastrarTurmaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTurmaAdminActionPerformed(evt);
            }
        });

        btnSairAdmin1.setText("Sair");
        btnSairAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairAdmin1ActionPerformed(evt);
            }
        });

        btnCadastrarDisciplinaAdmin1.setText("Cadastrar Disciplina");
        btnCadastrarDisciplinaAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDisciplinaAdmin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarProfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastroAlunoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarTurmaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSairAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarDisciplinaAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarProfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroAlunoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarTurmaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarDisciplinaAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSairAdmin1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProfAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProfAdminActionPerformed
        CadastroProf telaCProf = new CadastroProf(turmas, this);
        telaCProf.setVisible(true);
        this.setVisible(false);        
// TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarProfAdminActionPerformed

    private void btnCadastrarTurmaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTurmaAdminActionPerformed
        CadastroTurma telaCTurma = new CadastroTurma(turmas, this);
        telaCTurma.setVisible(true);
        this.setVisible(false);
//this.dispose();
    }//GEN-LAST:event_btnCadastrarTurmaAdminActionPerformed

    private void btnSairAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairAdmin1ActionPerformed
        //CadastroTurma telaCTurma = new CadastroTurma(turmas);
        janela.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnSairAdmin1ActionPerformed

    private void btnCadastroAlunoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroAlunoAdminActionPerformed
        CadastroAluno telaCAluno = new CadastroAluno(turmas, this);
        telaCAluno.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroAlunoAdminActionPerformed

    private void btnCadastrarDisciplinaAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDisciplinaAdmin1ActionPerformed
        CadastroDisciplica telaCDisc = new CadastroDisciplica(turmas, this);
        telaCDisc.setVisible(true);
        this.setVisible(false);
    // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarDisciplinaAdmin1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDisciplinaAdmin1;
    private javax.swing.JButton btnCadastrarProfAdmin;
    private javax.swing.JButton btnCadastrarTurmaAdmin;
    private javax.swing.JButton btnCadastroAlunoAdmin;
    private javax.swing.JButton btnSairAdmin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
