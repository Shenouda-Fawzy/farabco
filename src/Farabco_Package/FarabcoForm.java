/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farabco_Package;

import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.beans.Visibility;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amazing
 */
public class FarabcoForm extends javax.swing.JFrame {

    /**
     * Creates new form FarabcoForm
     * @throws java.net.URISyntaxException
     */
    
    public FarabcoForm() throws URISyntaxException {
        initComponents();
        buttonGroup1.add(jRadioFranco);
        buttonGroup1.add(jRadioArabic);
        aboutMe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        uri = new URI("https://eg.linkedin.com/in/shenoudafawzy");
        
        buttonGroup1.setSelected(jRadioArabic.getModel(), true);
        
        jPanel1.setVisible(false); // hide the output text
        farabco = new Farabco();
        
    }
    
    private void goToMyAccount(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToMyAccount
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException e) { /* TODO: error handling */ }
        } else { /* TODO: error handling */ }
    }//GEN-LAST:event_goToMyAccount

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioFranco = new javax.swing.JRadioButton();
        jRadioArabic = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTxt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outText = new javax.swing.JTextArea();
        convertInput = new javax.swing.JButton();
        aboutMe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farabco [Beta Version]");
        setResizable(false);

        jLabel1.setText("حول الى:");

        jRadioFranco.setText("Franco");
        jRadioFranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFrancoActionPerformed(evt);
            }
        });

        jRadioArabic.setText("عربى");
        jRadioArabic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioArabicActionPerformed(evt);
            }
        });

        inputTxt.setColumns(20);
        inputTxt.setRows(5);
        jScrollPane1.setViewportView(inputTxt);

        outText.setEditable(false);
        outText.setColumns(20);
        outText.setRows(5);
        jScrollPane2.setViewportView(outText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        convertInput.setText("حول | Translate");
        convertInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertInputActionPerformed(evt);
            }
        });

        aboutMe.setForeground(new java.awt.Color(0, 0, 204));
        aboutMe.setText("عني | About The Developer");
        aboutMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRadioFranco)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioArabic))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(aboutMe))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(convertInput)))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioFranco)
                    .addComponent(jRadioArabic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aboutMe)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertInputActionPerformed
        
        if(jRadioArabic.isSelected()== true){ // Converting from Franco to Arabic
            outText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            farabco.setFrancoStatment(inputTxt.getText());
            String convertedToFranco = farabco.getArabicStatment(); // converting to arabic
            outText.setText(convertedToFranco);
            jPanel1.setVisible(true);
        }
        else { // Converting form Arabic To Franco (jRadioFranco is enabled)
            
            outText.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            farabco.setArabicStatment(inputTxt.getText());
            String convertedToArabic = farabco.getFrancoStatment(); // converting to arabic
            outText.setText(convertedToArabic);
            jPanel1.setVisible(true);
            
        }
    }//GEN-LAST:event_convertInputActionPerformed

    private void jRadioArabicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioArabicActionPerformed
        inputTxt.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    }//GEN-LAST:event_jRadioArabicActionPerformed

    private void jRadioFrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFrancoActionPerformed
        inputTxt.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }//GEN-LAST:event_jRadioFrancoActionPerformed

    private void aboutMeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMeMouseClicked
        goToMyAccount(evt);
    }//GEN-LAST:event_aboutMeMouseClicked

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
            java.util.logging.Logger.getLogger(FarabcoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FarabcoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FarabcoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FarabcoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new FarabcoForm().setVisible(true);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(FarabcoForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Farabco farabco;
    private URI uri ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutMe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton convertInput;
    private javax.swing.JTextArea inputTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioArabic;
    private javax.swing.JRadioButton jRadioFranco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outText;
    // End of variables declaration//GEN-END:variables
}
