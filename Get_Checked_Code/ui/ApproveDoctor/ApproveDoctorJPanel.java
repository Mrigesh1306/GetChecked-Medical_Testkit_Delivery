/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ApproveDoctor;

import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ApproveDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApproveDoctorJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Hospital hospital;
    
    public ApproveDoctorJPanel(JPanel userProcessContainer, UserAccount account, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.hospital = hospital;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblTestRequests.getModel();
        model.setRowCount(0);
        
        ArrayList<WorkRequest> wr = hospital.getWorkQueue().getWorkRequestList2();
        
        for(int i=wr.size()-1; i>=0;i--){
            TestRequest req = (TestRequest)wr.get(i);
            
            if(req.getReceiver()!=account){
                continue;
            }
            if(!req.getStatus().equals("Sent to Doctor")){
                continue;
            }
            Object[] row = new Object[4];
            row[0] = req;
            row[2] = req.getCustomer().getEmployee().getName();
            row[1] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
            row[3] = req.getTestResult();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTestRequests = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(216, 243, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTestRequests.setBackground(new java.awt.Color(204, 255, 204));
        tblTestRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Technician Name", "Customer name", "Lab Results"
            }
        ));
        jScrollPane1.setViewportView(tblTestRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 120, 605, 121));

        btnApprove.setBackground(new java.awt.Color(116, 198, 157));
        btnApprove.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnApprove.setText("Approve Test");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 268, -1, 46));

        jPanel1.setBackground(new java.awt.Color(116, 198, 157));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 239, 239), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lab Test Approving Doctor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 510, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 698, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTestRequests.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to process this order");
            return;
        }
        
        TestRequest request = (TestRequest)tblTestRequests.getValueAt(selectedRow, 0);
        request.setStatus("Pending Approval");
        
        DoctorApproveJPanel doctorApproveJPanel = new DoctorApproveJPanel(userProcessContainer, request);
        userProcessContainer.add("DoctorApproveJPanel", doctorApproveJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTestRequests;
    // End of variables declaration//GEN-END:variables
}
