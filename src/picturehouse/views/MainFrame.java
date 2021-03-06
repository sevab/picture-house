/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturehouse.views;

import java.awt.CardLayout;
import picturehouse.PictureHouse;
import picturehouse.models.Movie;

/**
 *
 * @author sevabaskin
 */
public class MainFrame extends javax.swing.JFrame {

    // fix encapsulation
    public PictureHouse app;
    /**
     * Creates new form MainJFrame
     */
    public MainFrame() {
        this.app = new PictureHouse();
        initComponents();
    }
    
    
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        homePagePanel1 = new picturehouse.views.HomePagePanel(app, this);
        createAccountPanel1 = new picturehouse.views.CreateAccountPanel(app, this);
        signInPanel1 = new picturehouse.views.SignInPanel(app, this);
        newsletterPanel1 = new picturehouse.views.NewsletterPanel(this);
        browseMoviesPanel1 = new picturehouse.views.BrowseMoviesPanel(app, this);
        writeReviewPanel1 = new picturehouse.views.WriteReviewPanel(app, this);
        screeningsPanel1 = new picturehouse.views.ScreeningsPanel(app, this);
        bookingConfirmationPanel1 = new picturehouse.views.BookingConfirmationPanel(app, this);
        printTicketsPanel1 = new picturehouse.views.PrintTicketsPanel(app, this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 900));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        mainPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(homePagePanel1, "homePageCard");
        mainPanel.add(createAccountPanel1, "createAccountCard");
        mainPanel.add(signInPanel1, "signInCard");
        mainPanel.add(newsletterPanel1, "newsletterCard");
        mainPanel.add(browseMoviesPanel1, "browseMoviesCard");
        mainPanel.add(writeReviewPanel1, "writeReviewCard");
        mainPanel.add(screeningsPanel1, "screeningsCard");
        mainPanel.add(bookingConfirmationPanel1, "bookingConfirmationCard");
        mainPanel.add(printTicketsPanel1, "printTicketsCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private picturehouse.views.BookingConfirmationPanel bookingConfirmationPanel1;
    private picturehouse.views.BrowseMoviesPanel browseMoviesPanel1;
    private picturehouse.views.CreateAccountPanel createAccountPanel1;
    private picturehouse.views.HomePagePanel homePagePanel1;
    private javax.swing.JPanel mainPanel;
    private picturehouse.views.NewsletterPanel newsletterPanel1;
    private picturehouse.views.PrintTicketsPanel printTicketsPanel1;
    private picturehouse.views.ScreeningsPanel screeningsPanel1;
    private picturehouse.views.SignInPanel signInPanel1;
    private picturehouse.views.WriteReviewPanel writeReviewPanel1;
    // End of variables declaration//GEN-END:variables

    
    public void showCard(String cardName) {
        updateCard(cardName);
        CardLayout card = (CardLayout)this.mainPanel.getLayout();
        card.show(this.mainPanel, cardName);
    }
       
    void updateCard(String cardName) {
        // implement a better version if more cards need view updates
        if (cardName == "homePageCard") {
            this.homePagePanel1.updateView();
            return;
        }
        if (cardName == "browseMoviesCard") {
            this.browseMoviesPanel1.updateView();
            return;
        }
        if (cardName == "writeReviewCard") {
            this.writeReviewPanel1.updateView();
            return;
        }
        if (cardName == "screeningsCard") {
            this.screeningsPanel1.updateView();
            return;
        }
        if (cardName == "printTicketsCard") {
            this.printTicketsPanel1.updateView();
            return;
        }
            
    }

    public Movie getCurrentlySelectedMovie() {
        return this.browseMoviesPanel1.getCurrentlySelectedMovie();
    }
    public void notifyThatTicketsHaveBeenPrinted() {
//        this.browseMoviesPanel1.
    }
}
