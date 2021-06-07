/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ApproveDoctor;

import Business.WorkQueue.TestRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JPanel;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class DoctorApproveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorApproveJPanel
     */
    
    private JPanel userProcessContainer;
    private TestRequest request; 
     
    public DoctorApproveJPanel(JPanel userProcessContainer,TestRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMessage = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        brnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(216, 243, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 280, 66));

        btnSubmit.setBackground(new java.awt.Color(116, 198, 157));
        btnSubmit.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 100, 40));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Comments:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 174, -1, -1));

        jPanel1.setBackground(new java.awt.Color(116, 198, 157));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 239, 239), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lab Test Approving Doctor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 500, 50));

        brnBack.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        brnBack.setText("<<Back");
        brnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBackActionPerformed(evt);
            }
        });
        jPanel1.add(brnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        request.setRemarks(txtMessage.getText());
        request.setStatus("Completed");
        String email = request.getCustomer().getEmailID();
        
//        String fromEmail = "pulipatirajsimha@gmail.com";
//        String pass = "Spring_2021";
//        String subject = "You have test results waiting";
//        
//        Properties properties =  new Properties();
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.startls.enable", "true");
//        properties.put("mail.smtp.host", "smpt.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        
//        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication(){
//                return new PasswordAuthentication(fromEmail, pass);
//            }
//        });
//        try{
//            MimeMessage message1 = new MimeMessage(session);
//            message1.setFrom(new InternetAddress(fromEmail));
//            message1.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
//            message1.setSubject(subject);
//            message1.setText("Your tests are approved by the doctor. Please check your results on our app");
//            Transport.send(message1);
//        }
//        catch (Exception ex){
//            System.out.println(""+ex);
//        }
        
    
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void brnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ApproveDoctorJPanel hentadjp = (ApproveDoctorJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_brnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
