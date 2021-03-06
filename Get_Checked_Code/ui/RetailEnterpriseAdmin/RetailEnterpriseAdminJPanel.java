/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RetailEnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class RetailEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetailEnterpriseAdminJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    
    public RetailEnterpriseAdminJPanel(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 246, 189));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(250, 163, 7));
        jButton1.setFont(new java.awt.Font("Devanagari MT", 1, 18)); // NOI18N
        jButton1.setText("Retail Store");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 187, 120));

        jButton2.setBackground(new java.awt.Color(250, 163, 7));
        jButton2.setFont(new java.awt.Font("Devanagari MT", 1, 18)); // NOI18N
        jButton2.setText("Retailer Admin");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 187, 120));

        jPanel1.setBackground(new java.awt.Color(250, 163, 7));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Retail Store ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 497, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 90));

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 18)); // NOI18N
        jLabel2.setText("Choose option to Manage :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManageRetailerJPanel manageRetJPanel=new ManageRetailerJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageRetailerJPanel",manageRetJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManageRetailerAdminJPanel manageRetAdminJPanel=new ManageRetailerAdminJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageRetailerAdminJPanel",manageRetAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
