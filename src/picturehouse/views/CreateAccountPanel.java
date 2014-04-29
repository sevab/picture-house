/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturehouse.views;

import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JOptionPane;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.validation.ValidationException;
import picturehouse.PictureHouse;
import picturehouse.controllers.CustomerController;
import picturehouse.models.Customer;

/**
 *
 * @author sevabaskin
 */
public class CreateAccountPanel extends javax.swing.JPanel {
    private PictureHouse app;
    private MainFrame parentFrame;
    
    /**
     * Creates new form CreateAccountJPanel
     */
    public CreateAccountPanel() {
        initComponents();
    }
    
    public CreateAccountPanel(PictureHouse app, MainFrame parentFrame) {
        initComponents();
        this.app = app;
        this.parentFrame = parentFrame;
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
        jLabel1 = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        creditCardLabel = new javax.swing.JLabel();
        creditCardField = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel1.setText("Create an account");

        customerNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        customerNameLabel.setText("Customer Name");

        customerNameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        creditCardLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        creditCardLabel.setText("Credit card number");

        creditCardField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        createAccountButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Return to Main Screen");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(creditCardField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(customerNameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(creditCardLabel)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createAccountButton, creditCardField, creditCardLabel, customerNameField, customerNameLabel, goBackButton, jLabel1, passwordField, passwordLabel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditCardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditCardField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        try {
            Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/picturehouse_development", "testuser", "testuserpassword");
            CustomerController controller = new CustomerController();
            controller.create(customerNameField.getText(), passwordField.getText(), creditCardField.getText());
            Base.close();
            // clear text field view
            customerNameField.setText("");
            passwordField.setText("");
            creditCardField.setText("");
            //       save authentication
            app.authorizeCurrentUser();
            this.app.setCurrentCustomer((Customer) Customer.findFirst("username = ?", customerNameField.getText()));
            this.parentFrame.showCard("homePageCard");
        } catch (ValidationException e) {
            Map<String, String> errors = e.errors();
            String errorMsgs = "You've got the following errors:\n";
            for (Map.Entry<String, String> entry : errors.entrySet()) {
                errorMsgs = errorMsgs + entry.getValue() + "\n";
            }

            JOptionPane.showMessageDialog(this, errorMsgs, "Validation Errors", JOptionPane.WARNING_MESSAGE);
            Base.close();
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.parentFrame.showCard("homePageCard");
    }//GEN-LAST:event_goBackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField creditCardField;
    private javax.swing.JLabel creditCardLabel;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
