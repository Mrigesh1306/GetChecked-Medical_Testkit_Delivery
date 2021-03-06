/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributionEnterpriseAdmin;

import Business.Distribution.Distribution;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ManageDistributionUnitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDistributionUnitJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Distribution distribution;
    
    public ManageDistributionUnitJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateDistributionTable();
    }
    
    
    private void populateDistributionTable(){
        DefaultTableModel model = (DefaultTableModel) tblDistribution.getModel();
        model.setRowCount(0);
        
        for ( Distribution dist : enterprise.getDistributionDirectory().getDistributions()) {
            Object[] row = new Object[1];
            row[0] = dist;
            System.out.println(dist.getDistributionName()+" ---- name");
            System.out.println(dist+" ----- obj");
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        txtDistributionName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDistribution = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 111, 96));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmit.setBackground(new java.awt.Color(204, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 383, 100, 40));

        txtDistributionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistributionNameActionPerformed(evt);
            }
        });
        add(txtDistributionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 309, 229, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Distribution Unit Name: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 311, -1, -1));

        tblDistribution.setBackground(new java.awt.Color(255, 204, 204));
        tblDistribution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Distribution Unit Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDistribution);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 126, -1, 146));

        btnModify.setBackground(new java.awt.Color(204, 255, 255));
        btnModify.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 126, 100, 40));

        btnDelete.setBackground(new java.awt.Color(204, 255, 255));
        btnDelete.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 232, 100, 40));

        jPanel1.setBackground(new java.awt.Color(171, 0, 13));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 57, 53), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Distribution Unit");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 30, 530, 53));

        btnBack.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String name = txtDistributionName.getText();

        Distribution dist = this.enterprise.createDustributionUnit(name);

        
        txtDistributionName.setText("");
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
        populateDistributionTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributionEnterpriseAdminJPanel manetn = (DistributionEnterpriseAdminJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDistributionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistributionNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistributionNameActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        //btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
        btnSubmit.setEnabled(true);
        int selectedRowIndex = tblDistribution.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, "Please select a row to Modify", "Warning", JOptionPane.WARNING_MESSAGE);
            btnModify.setEnabled(true);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDistribution.getModel();
        Distribution dist = (Distribution)model.getValueAt(selectedRowIndex, 0);
        txtDistributionName.setText(dist.getDistributionName());
        
        this.enterprise.getDistributionDirectory().deleteDistributionUnit(dist);
        distribution = dist;
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDistribution.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        // DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Distribution dis = (Distribution)tblDistribution.getValueAt(selectedRowIndex, 0);

        String name = dis.getDistributionName();

        this.enterprise.getDistributionDirectory().deleteDistributionUnit(dis);

        populateDistributionTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDistribution;
    private javax.swing.JTextField txtDistributionName;
    // End of variables declaration//GEN-END:variables
}
