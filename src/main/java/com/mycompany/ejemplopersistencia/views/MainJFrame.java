/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejemplopersistencia.views;

import com.mycompany.ejemplopersistencia.persistence.PersistenceMySQl;
import com.mycompany.ejemplopersistencia.services.ShowWindows;
import com.sun.tools.javac.Main;
import jakarta.persistence.NoResultException;

import javax.swing.*;

/**
 *
 * @author masu
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        TextFieldUsuario = new javax.swing.JTextField();
        ConexionBoton = new javax.swing.JButton();
        TextFieldContrasegna = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrarseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldUsuario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        TextFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true)));
        getContentPane().add(TextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 350, 50));

        ConexionBoton.setBackground(new java.awt.Color(255, 255, 255));
        ConexionBoton.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        ConexionBoton.setForeground(new java.awt.Color(0, 0, 0));
        ConexionBoton.setText("Conectarse");
        ConexionBoton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        ConexionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConexionBotonActionPerformed(evt);
            }
        });
        getContentPane().add(ConexionBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 170, 40));

        TextFieldContrasegna.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldContrasegna.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldContrasegna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        getContentPane().add(TextFieldContrasegna, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 350, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 120, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YunezChat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 50));

        registrarseButton.setBackground(new java.awt.Color(0, 0, 0));
        registrarseButton.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        registrarseButton.setForeground(new java.awt.Color(255, 255, 255));
        registrarseButton.setText("Registrate");
        registrarseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registrarseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConexionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConexionBotonActionPerformed
        try{
            if (new PersistenceMySQl().findUser(TextFieldUsuario.getText(), TextFieldContrasegna.getText())) {
                ShowWindows.loadMainApp(TextFieldUsuario.getText());
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch (NoResultException e){
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConexionBotonActionPerformed

    private void registrarseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseButtonActionPerformed
        ShowWindows.loadRegisterWindow();
    }//GEN-LAST:event_registrarseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton ConexionBoton;
    private static javax.swing.JPasswordField TextFieldContrasegna;
    private static javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JButton registrarseButton;
    // End of variables declaration//GEN-END:variables
}
