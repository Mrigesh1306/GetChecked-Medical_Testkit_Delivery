/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ConsultDoctorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class CustomerConsultDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerConsultDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount useraccount;
    Customer customer;
    ArrayList<String> symptoms;
    public CustomerConsultDoctorJPanel(JPanel userProcessContainer, UserAccount useraccount,EcoSystem ecosystem, Customer customer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.useraccount = useraccount;
        this.customer = customer;
        populateJComboBox();
        symptoms = new ArrayList();
        populateSuggestionTable();
        DefaultTableModel model = (DefaultTableModel) tblSymptoms.getModel();
        model.setRowCount(0);
    }
    
    private void populateSuggestionTable(){
        DefaultTableModel model = (DefaultTableModel) tblSuggestion.getModel();
        model.setRowCount(0);
        ArrayList<WorkRequest> wr = useraccount.getWorkQueue().getWorkRequestList3();
        
        for(int i=wr.size()-1;i>=0;i--){
            ConsultDoctorRequest request = (ConsultDoctorRequest) wr.get(i);
//            if(!request.getStatus().equals("Done")){
//                continue;
//            }
            Object[] row = new Object[3];
            row[0] = request.getTest();
            row[2] = request.getStatus();
            row[1] = request.getMessage();
            model.addRow(row);
        }
        
    }
    
    
    private void populateJComboBox(){
        hospitalJComboBox.removeAllItems();
        int ii=0;
        for(Network network:ecosystem.getNetworkList()){
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise.getHospitalDirectory()!=null){
                        System.out.println(enterprise.getHospitalDirectory().getHospitals());
                        for(Hospital hospital: enterprise.getHospitalDirectory().getHospitals()){
                            hospitalJComboBox.addItem(hospital);
                            if(ii==0){
                                ii=1;
                                populateDoctorTable(hospital);
                            }
                        }
                    }
                }
            }
    }
    
    private void populateDoctorTable(Hospital hospital){
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();

        model.setRowCount(0);
        for (UserAccount us : hospital.getUserAccountDirectory().getUserAccountList()) {
            if(us.getRole().toString().equals("Consulting Doctor")){
                Object[] row = new Object[1];
                row[0] = us;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSymptoms = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        hospitalJComboBox = new javax.swing.JComboBox();
        btnConsult = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSymptoms = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSuggestion = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 250, 238));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 2, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 250, 224));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 2, true));

        tblSymptoms.setBackground(new java.awt.Color(241, 250, 238));
        tblSymptoms.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 2, true));
        tblSymptoms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Symptoms"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSymptoms);

        tblDoctor.setBackground(new java.awt.Color(241, 250, 238));
        tblDoctor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 2, true));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Doctor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        jLabel1.setText("Select Hospital :");

        hospitalJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        hospitalJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        hospitalJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConsult.setBackground(new java.awt.Color(255, 104, 107));
        btnConsult.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnConsult.setText("Consult");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        jLabel2.setText("Add Symptom :");

        btnAdd.setBackground(new java.awt.Color(255, 104, 107));
        btnAdd.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblSuggestion.setBackground(new java.awt.Color(241, 250, 238));
        tblSuggestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 2, true));
        tblSuggestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Suggested Test", "Remarks", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSuggestion);

        btnRefresh.setBackground(new java.awt.Color(255, 104, 107));
        btnRefresh.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsult))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnRefresh))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(69, 123, 157));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        jLabel3.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consult A Doctor");

        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(201, 201, 201)
                .addComponent(jLabel3)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 910, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        Hospital hospital = (Hospital)hospitalJComboBox.getSelectedItem();
        ConsultDoctorRequest request = new ConsultDoctorRequest();
        for(String s:symptoms){
            request.addSymptoms(s);
        }
        request.setCustomer(customer);
        request.setHospital(hospital);
        request.setMessage("Suggest test");
        request.setStatus("Sent to doctor");
        request.setSender(useraccount);
        useraccount.getWorkQueue().getWorkRequestList3().add(request);
        hospital.getWorkQueue().getWorkRequestList3().add(request);
        populateSuggestionTable();
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        symptoms.add(txtSymptoms.getText());
        DefaultTableModel model = (DefaultTableModel) tblSymptoms.getModel();
        Object row[] = new Object[1];
        row[0] = txtSymptoms.getText();
        model.addRow(row);
        txtSymptoms.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel hentadjp = (CustomerWorkAreaJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateSuggestionTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblSuggestion;
    private javax.swing.JTable tblSymptoms;
    private javax.swing.JTextField txtSymptoms;
    // End of variables declaration//GEN-END:variables
}
