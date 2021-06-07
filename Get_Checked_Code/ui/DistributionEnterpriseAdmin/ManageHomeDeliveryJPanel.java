/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributionEnterpriseAdmin;

import Business.Distribution.Distribution;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.HomeDeliveryManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ManageHomeDeliveryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHomeDeliveryJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public ManageHomeDeliveryJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateJComboBox();
    }
    
    
    private void populateJComboBox() {
        distributionJComboBox.removeAllItems();
        int i = 0;
        for (Distribution distribution : enterprise.getDistributionDirectory().getDistributions()) {
            if (i == 0) {
                populateTable(distribution);
                i++;
                System.out.println(distribution.getDistributionName());
            }
            distributionJComboBox.addItem(distribution);
        }
    }
    
    private void populateTable(Distribution distribution){
        DefaultTableModel model = (DefaultTableModel) tblHomeDelivery.getModel();
        model.setRowCount(0);

        String dm = "Home Delivery Man";

        for (UserAccount us : distribution.getUserAccountDirectory().getUserAccountList()) {
            if (us.getRole().toString().equals(dm)) {
                Object[] row = new Object[2];
                row[0] = us;
                row[1] = us.getEmployee().getName();
                model.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomeDelivery = new javax.swing.JTable();
        distributionJComboBox = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        txtShipPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtShipUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtShipName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 111, 96));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHomeDelivery.setBackground(new java.awt.Color(255, 204, 204));
        tblHomeDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Delivery Man Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHomeDelivery);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 118, 546, 157));

        distributionJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        distributionJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        distributionJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        distributionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        distributionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributionJComboBoxActionPerformed(evt);
            }
        });
        add(distributionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 161, -1));

        btnSubmit.setBackground(new java.awt.Color(204, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 486, 100, 40));
        add(txtShipPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 417, 161, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 419, -1, -1));
        add(txtShipUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 377, 161, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 377, -1, -1));
        add(txtShipName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 339, 161, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Delivery Man Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 341, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Distribution Name :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 306, -1, -1));

        btnModify.setBackground(new java.awt.Color(204, 255, 255));
        btnModify.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 100, 40));

        btnDelete.setBackground(new java.awt.Color(204, 255, 255));
        btnDelete.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 235, 100, 40));

        jPanel1.setBackground(new java.awt.Color(171, 0, 13));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 57, 53), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Home Delivery Man");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 530, 53));

        btnBack.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 92, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void distributionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributionJComboBoxActionPerformed
        // TODO add your handling code here:
        Distribution distribution = (Distribution) distributionJComboBox.getSelectedItem();
        if (distribution != null) {
            populateTable(distribution);
        }
    }//GEN-LAST:event_distributionJComboBoxActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Distribution distribution = (Distribution) distributionJComboBox.getSelectedItem();

        String username = txtShipUsername.getText();
        String password = txtShipPassword.getText();
        String name = txtShipName.getText();
        
        if(username.isEmpty() || name.isEmpty() || password.isEmpty() ){
        
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory");
            return;
        }
        boolean isValid ; 
        
        isValid = name.matches("^[a-zA-Z]+$");
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Name must contains only alphabets");
            txtShipName.setText("");
            return;
        }
        if(distribution.getUserAccountDirectory().checkIfUsernameIsUnique(username) == false){
            JOptionPane.showMessageDialog(this, "User name taken, try another one");
            txtShipUsername.setText("");
            txtShipPassword.setText("");
            return;
        }
        
        isValid = username.matches("^[a-zA-Z0-9]+$");
        
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Username must be Alphanumeric");
            txtShipUsername.setText("");
            return;
        }
        
        isValid = password.matches("^[a-zA-Z0-9]+$$");
        
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Password must be Alphanumeric");
            txtShipPassword.setText("");
            return;
        }

        if(password.length()<6){
            JOptionPane.showMessageDialog(this, "Password too weak, choose a password with a minimum length of 6");
            txtShipPassword.setText("");
            return;
        }

        Employee employee = distribution.getEmployeeDirectory().createEmployee(name);
        UserAccount ua = distribution.getUserAccountDirectory().createUserAccount(username, password, employee, new HomeDeliveryManRole());

        populateTable(distribution);
        txtShipUsername.setText("");
        txtShipPassword.setText("");
        txtShipName.setText("");
        btnDelete.setEnabled(true);
        btnModify.setEnabled(true);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributionEnterpriseAdminJPanel manetn = (DistributionEnterpriseAdminJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        //btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
        btnSubmit.setEnabled(true);
        Distribution dist = (Distribution)distributionJComboBox.getSelectedItem();
        int selectedRowIndex = tblHomeDelivery.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, "Please select a row to Modify", "Warning", JOptionPane.WARNING_MESSAGE);
            btnModify.setEnabled(true);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHomeDelivery.getModel();
        UserAccount us = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        txtShipName.setText(us.getEmployee().getName());
        txtShipPassword.setText(us.getPassword());
        txtShipUsername.setText(us.getUsername());
        dist.getUserAccountDirectory().removeUser(us);
        //this.enterprise.getDistributionDirectory().deleteDistributionUnit(dist);
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Distribution dist = (Distribution)distributionJComboBox.getSelectedItem();
        int selectedRowIndex = tblHomeDelivery.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, "Please select a row to Modify", "Warning", JOptionPane.WARNING_MESSAGE);
            btnModify.setEnabled(true);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHomeDelivery.getModel();
        UserAccount us = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        
        dist.getEmployeeDirectory().deleteEmployee(us.getEmployee());
        dist.getUserAccountDirectory().removeUser(us);
        populateTable(dist);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox distributionJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHomeDelivery;
    private javax.swing.JTextField txtShipName;
    private javax.swing.JTextField txtShipPassword;
    private javax.swing.JTextField txtShipUsername;
    // End of variables declaration//GEN-END:variables
}