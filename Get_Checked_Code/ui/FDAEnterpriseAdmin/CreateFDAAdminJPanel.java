/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FDAEnterpriseAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.FDA.FDA;
import Business.Role.FDAAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class CreateFDAAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFDAAdminJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public CreateFDAAdminJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateJComboBox();
    }
    
    private void populateJComboBox(){
        FDAJComboBox.removeAllItems();
        int i=0;
        for(FDA fda :enterprise.getFdas().getFDA()){
            if(i==0){
                populateTable(fda);
                i++;
                System.out.println(fda.getFDAName());
            }
            System.out.println(fda);
            FDAJComboBox.addItem(fda);
        }
    }
    
    private void populateTable(FDA fda){
        DefaultTableModel model = (DefaultTableModel)tblFDA.getModel();
        model.setRowCount(0);
        
        String dm = "FDA Admin";
        
        for(UserAccount us: fda.getUserAccountDirectory().getUserAccountList()){
            if(us.getRole().toString().equals(dm)){
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
        tblFDA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        FDAJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(234, 248, 218));

        tblFDA.setBackground(new java.awt.Color(187, 222, 249));
        tblFDA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 3, true));
        tblFDA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "FDA admin name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFDA);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Admin Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("FDA Admin Username:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Password:");

        btnSubmit.setBackground(new java.awt.Color(187, 222, 249));
        btnSubmit.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(187, 222, 249));
        btnModify.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(187, 222, 249));
        btnDelete.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        FDAJComboBox.setBackground(new java.awt.Color(187, 222, 249));
        FDAJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        FDAJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        FDAJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FDAJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDAJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Enterprise");

        jPanel1.setBackground(new java.awt.Color(187, 222, 249));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 3, true));

        btnBack.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel5.setText("Create FDA Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jLabel5)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)
                        .addGap(85, 85, 85)
                        .addComponent(FDAJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel3)
                        .addGap(93, 93, 93)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(btnSubmit)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModify)
                            .addComponent(btnDelete))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(FDAJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnSubmit))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FDAEnterpriseAdminJPanel fentadjp = (FDAEnterpriseAdminJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        FDA fda = (FDA) FDAJComboBox.getSelectedItem();
        
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String name = txtName.getText();
        
        if(username.isEmpty() || name.isEmpty() || password.isEmpty() ){
        
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory");
            return;
        }
        boolean isValid ; 
        
        isValid = name.matches("^[a-zA-Z]+$");
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Name must contains only alphabets");
            txtName.setText("");
            return;
        }
        if(fda.getUserAccountDirectory().checkIfUsernameIsUnique(username) == false){
            JOptionPane.showMessageDialog(this, "user name taken, try another one");
            txtUsername.setText("");
            txtPassword.setText("");
            return;
        }
        
        isValid = username.matches("^[a-zA-Z0-9]+$");
        
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Username must be Alphanumeric");
            txtUsername.setText("");
            return;
        }
        
        isValid = password.matches("^[a-zA-Z0-9]+$$");
        
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Password must be Alphanumeric");
            txtPassword.setText("");
            return;
        }

        if(password.length()<6){
            JOptionPane.showMessageDialog(this, "Password too weak, choose a password with a minimum length of 6");
            txtPassword.setText("");
            return;
        }
        
        Employee employee = fda.getEmployeeDirectory().createEmployee(name);
        UserAccount ua = fda.getUserAccountDirectory().createUserAccount(username, password, employee, new FDAAdminRole());
        //System.out.println(hospital.getUserAccountDirectory().getUserAccountList().size()+" ---- aaa");
        populateTable(fda);
        
        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        btnDelete.setEnabled(true);
        btnModify.setEnabled(true);
                
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void FDAJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDAJComboBoxActionPerformed
        // TODO add your handling code here:
        FDA fda = (FDA) FDAJComboBox.getSelectedItem();
        if(fda!=null){
            populateTable(fda);
        }
    }//GEN-LAST:event_FDAJComboBoxActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        FDA fda = (FDA) FDAJComboBox.getSelectedItem();
        int selectedRowIndex = tblFDA.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to Modify");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblFDA.getModel();
        UserAccount us = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        txtUsername.setText(us.getUsername());
        txtPassword.setText(us.getPassword());
        txtName.setText(us.getEmployee().getName());
        fda.getUserAccountDirectory().removeUser(us);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        FDA fda = (FDA) FDAJComboBox.getSelectedItem();

        int selectedRow = tblFDA.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblFDA.getModel();

        UserAccount us = (UserAccount) model.getValueAt(selectedRow, 0);

        fda.getEmployeeDirectory().deleteEmployee(us.getEmployee());
        fda.getUserAccountDirectory().removeUser(us);
        populateTable(fda);
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox FDAJComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFDA;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
