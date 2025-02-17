/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ao.sga.login;

import ao.sga.dashboard.DashboardProf;
import ao.sga.janela.caadastro.CadastroProf;
import ao.sga.janela.init.Main;
import ao.sga.modelo.Prof;
import ao.sga.modelo.Turma;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author man-tung
 */
public class LoginProfessor extends javax.swing.JFrame {

        ArrayList<Turma> turmas = null;
        JFrame janela = null;

    /**
     * Creates new form LoginProfessor
     */
    public LoginProfessor() {
        initComponents();
    }
    
    public LoginProfessor(ArrayList<Turma> turmas, JFrame janela) {
        initComponents();
        this.janela = janela;
        this.turmas = turmas;
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
        jLabel3 = new javax.swing.JLabel();
        usernameProfessor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordProfessor = new javax.swing.JTextField();
        btnLogarAdmin = new javax.swing.JButton();
        btnInicioAdmin = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Login como Professor ");

        jLabel3.setText("Username");

        usernameProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameProfessorActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        btnLogarAdmin.setText("Logar");
        btnLogarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarAdminActionPerformed(evt);
            }
        });

        btnInicioAdmin.setText("Inicio");
        btnInicioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(btnInicioAdmin)
                            .addComponent(usernameProfessor)
                            .addComponent(passwordProfessor)
                            .addComponent(btnLogarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicioAdmin)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameProfessorActionPerformed

    private void btnLogarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarAdminActionPerformed
            int rs = 0;
            Prof prof = null;

            ArrayList<ao.sga.modelo.Prof> profs = new ArrayList<ao.sga.modelo.Prof>();
            turmas.forEach((t) -> {
                t.getDisc().forEach((d) -> {
                    profs.addAll(d.getProf());
                });
            });
          
            for (Prof p : profs) {
                if(p.getUsername().equals(usernameProfessor.getText()) &&
                    p.getPassword().equals(passwordProfessor.getText()))
                {
                    JOptionPane.showMessageDialog(rootPane, "LOGADO!");
                    DashboardProf telaCProf = new DashboardProf(turmas, this, p);
                    System.out.println(">>>>>>>>: "+p.getTurma().get(0).getName());
                    telaCProf.setVisible(true);
                    this.setVisible(false);
                    return ;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "NAO LOGADO!");
            usernameProfessor.setText("");passwordProfessor.setText("");
    }//GEN-LAST:event_btnLogarAdminActionPerformed

    private void btnInicioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioAdminActionPerformed
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioAdminActionPerformed

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
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicioAdmin;
    private javax.swing.JButton btnLogarAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField passwordProfessor;
    private javax.swing.JTextField usernameProfessor;
    // End of variables declaration//GEN-END:variables
}
