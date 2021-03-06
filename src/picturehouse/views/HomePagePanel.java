/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturehouse.views;


import javax.swing.JOptionPane;
import picturehouse.PictureHouse;

/**
 *
 * @author sevabaskin
 */
public class HomePagePanel extends javax.swing.JPanel {

    private PictureHouse app;
    // TODO: alternatively store the reference in the PictureHouse app, so each child doesn't have to store reference to parent
    //       maybe not, since not the most logical thing to do.
    private MainFrame parentFrame;
    
    /**
     * Creates new form HomePagePanel
     */
    public HomePagePanel() {
        initComponents();
    }
    public HomePagePanel(PictureHouse app, MainFrame parentFrame) {
        initComponents();
        this.app = app;
        this.parentFrame = parentFrame;
        updateView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browseMoviesButton = new javax.swing.JButton();
        readNewsletterButton = new javax.swing.JButton();
        printTicketButton = new javax.swing.JButton();
        authorizationButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        browseMoviesButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        browseMoviesButton.setText("Browse Movies");
        browseMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseMoviesButtonActionPerformed(evt);
            }
        });

        readNewsletterButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        readNewsletterButton.setText("Read Newsletter");
        readNewsletterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readNewsletterButtonActionPerformed(evt);
            }
        });

        printTicketButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        printTicketButton.setText("Print Tickets");
        printTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketButtonActionPerformed(evt);
            }
        });

        authorizationButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        authorizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorizationButtonActionPerformed(evt);
            }
        });

        createAccountButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel1.setText("Press one of the buttons to start");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(browseMoviesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(readNewsletterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(printTicketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(authorizationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addComponent(createAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {authorizationButton, browseMoviesButton, printTicketButton, readNewsletterButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseMoviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readNewsletterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorizationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        this.parentFrame.showCard("createAccountCard");
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void authorizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorizationButtonActionPerformed
        if (this.app.isCurrentUserAuthorized()) {
            this.app.flushCurrentUserData();
            this.updateView();
            JOptionPane.showMessageDialog(this, "You have successfully logged out!");
        } else {
            this.parentFrame.showCard("signInCard");
        }
    }//GEN-LAST:event_authorizationButtonActionPerformed

    private void readNewsletterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readNewsletterButtonActionPerformed
        this.parentFrame.showCard("newsletterCard");
    }//GEN-LAST:event_readNewsletterButtonActionPerformed

    private void browseMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseMoviesButtonActionPerformed
        this.parentFrame.showCard("browseMoviesCard");
    }//GEN-LAST:event_browseMoviesButtonActionPerformed

    private void printTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketButtonActionPerformed
        if (this.app.isCurrentUserAuthorized()) {
            this.parentFrame.showCard("printTicketsCard");
        } else {
            JOptionPane.showMessageDialog(this, "Please log in before proceeding.");
        }
    }//GEN-LAST:event_printTicketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorizationButton;
    private javax.swing.JButton browseMoviesButton;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton printTicketButton;
    private javax.swing.JButton readNewsletterButton;
    // End of variables declaration//GEN-END:variables

    public void updateView() {
        if (this.app.isCurrentUserAuthorized()) {
            this.authorizationButton.setText("Log Out");
            this.createAccountButton.setVisible(false);
        } else {
            this.createAccountButton.setVisible(true);
            this.authorizationButton.setText("Log In");
        }
    }
    
//    public void notifyThatTicketsHaveBeenPrinted() {
//        
//    }

}
