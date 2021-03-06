/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributionEnterpriseAdmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class DistributionEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributionEnterpriseAdminJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public DistributionEnterpriseAdminJPanel(JPanel userProcessContainer, Enterprise enterprise) {
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

        btnManageDistribution = new javax.swing.JButton();
        btnManageRetail = new javax.swing.JButton();
        btnManageHome = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 111, 96));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageDistribution.setBackground(new java.awt.Color(204, 255, 255));
        btnManageDistribution.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManageDistribution.setText("Manage Distribution Units");
        btnManageDistribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDistributionActionPerformed(evt);
            }
        });
        add(btnManageDistribution, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 180, 303, 163));

        btnManageRetail.setBackground(new java.awt.Color(204, 255, 255));
        btnManageRetail.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManageRetail.setText("Manage Retail Delivery Man");
        btnManageRetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRetailActionPerformed(evt);
            }
        });
        add(btnManageRetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 163));

        btnManageHome.setBackground(new java.awt.Color(204, 255, 255));
        btnManageHome.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManageHome.setText("Manage Home Delivery Man");
        btnManageHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHomeActionPerformed(evt);
            }
        });
        add(btnManageHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 410, -1, 163));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Manage Manager");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 301, 163));

        jPanel3.setBackground(new java.awt.Color(171, 0, 13));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 57, 53), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Distribution Enterprise Admin");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 53));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDistributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDistributionActionPerformed
        // TODO add your handling code here:
        ManageDistributionUnitJPanel manageDistributionUnitJPanel = new ManageDistributionUnitJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageDistributionUnitJPanel", manageDistributionUnitJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageDistributionActionPerformed

    private void btnManageRetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRetailActionPerformed
        // TODO add your handling code here:
        ManageRetailDeliveryManJPanel manageRetailDeliveryManJPanel = new ManageRetailDeliveryManJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageRetailDeliveryManJPanel", manageRetailDeliveryManJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRetailActionPerformed

    private void btnManageHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHomeActionPerformed
        // TODO add your handling code here:
        ManageHomeDeliveryJPanel manageHomeDeliveryJPanel = new ManageHomeDeliveryJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageHomeDeliveryJPanel", manageHomeDeliveryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageManagerJPanel manageManagerJPanel = new ManageManagerJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageManagerJPanel", manageManagerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDistribution;
    private javax.swing.JButton btnManageHome;
    private javax.swing.JButton btnManageRetail;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
