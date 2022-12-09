package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

public class TuitionFee extends javax.swing.JFrame {

    public TuitionFee() {
        initComponents();
    }

    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    double tuitionFee = 10000.00;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balance = new javax.swing.JLabel();
        balTitle = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        paymentTitle = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        semester = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        tuitionPaymentlBG = new javax.swing.JLabel();
        tutiontInfoEnrollment = new javax.swing.JLabel();
        tuitionEnrollBG = new javax.swing.JLabel();
        tuitionTitleBG = new javax.swing.JPanel();
        tuitionTitle = new javax.swing.JLabel();
        tuitionLogo = new javax.swing.JLabel();
        tuitionBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setIconImage(logo.getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        balance.setForeground(new java.awt.Color(255, 255, 255));
        balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 380, 40));

        balTitle.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        balTitle.setForeground(new java.awt.Color(255, 255, 255));
        balTitle.setText("Balance:");
        getContentPane().add(balTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 160, -1));

        paymentField.setBackground(new java.awt.Color(255, 255, 255));
        paymentField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        paymentField.setForeground(new java.awt.Color(0, 18, 83));
        paymentField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paymentField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentFieldActionPerformed(evt);
            }
        });
        paymentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paymentFieldKeyPressed(evt);
            }
        });
        getContentPane().add(paymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 380, 40));

        paymentTitle.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        paymentTitle.setForeground(new java.awt.Color(255, 255, 255));
        paymentTitle.setText("Payment:");
        getContentPane().add(paymentTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 160, -1));

        year.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("₱10,000/yr)");
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 110, -1));

        semester.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        semester.setForeground(new java.awt.Color(255, 255, 255));
        semester.setText("₱5,000/sem,");
        getContentPane().add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 120, -1));

        month.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setText("(₱1,000/mo,");
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 120, -1));

        exitButton.setBackground(new java.awt.Color(0, 18, 83));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 200, 40));

        doneButton.setBackground(new java.awt.Color(0, 18, 83));
        doneButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setText("Done");
        doneButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doneButton.setFocusable(false);
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 200, 40));

        tuitionPaymentlBG.setBackground(new java.awt.Color(0, 18, 83, 150));
        tuitionPaymentlBG.setForeground(new java.awt.Color(0, 18, 83));
        tuitionPaymentlBG.setOpaque(true);
        getContentPane().add(tuitionPaymentlBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 430, 370));

        tutiontInfoEnrollment.setBackground(new java.awt.Color(0, 18, 83));
        tutiontInfoEnrollment.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        tutiontInfoEnrollment.setForeground(new java.awt.Color(255, 255, 255));
        tutiontInfoEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tutiontInfoEnrollment.setText("ENROLLMENT SYSTEM");
        getContentPane().add(tutiontInfoEnrollment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        tuitionEnrollBG.setBackground(new java.awt.Color(0, 18, 83));
        tuitionEnrollBG.setForeground(new java.awt.Color(0, 18, 83));
        tuitionEnrollBG.setOpaque(true);
        getContentPane().add(tuitionEnrollBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 570, 60));

        tuitionTitleBG.setBackground(new java.awt.Color(0, 18, 83));

        tuitionTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        tuitionTitle.setForeground(new java.awt.Color(255, 255, 255));
        tuitionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuitionTitle.setText("TUITION FEE");

        javax.swing.GroupLayout tuitionTitleBGLayout = new javax.swing.GroupLayout(tuitionTitleBG);
        tuitionTitleBG.setLayout(tuitionTitleBGLayout);
        tuitionTitleBGLayout.setHorizontalGroup(
            tuitionTitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tuitionTitleBGLayout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(tuitionTitle)
                .addGap(407, 407, 407))
        );
        tuitionTitleBGLayout.setVerticalGroup(
            tuitionTitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tuitionTitleBGLayout.createSequentialGroup()
                .addComponent(tuitionTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(tuitionTitleBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1000, -1));

        tuitionLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enrollment_system_transparent_logo_circle.png"))); // NOI18N
        tuitionLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tuitionLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 390, 390));

        tuitionBackground.setForeground(new java.awt.Color(0, 18, 83));
        tuitionBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heaven.jpg"))); // NOI18N
        tuitionBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 83), 10));
        getContentPane().add(tuitionBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "St. Anne's Catholic School Enrollment System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void paymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentFieldActionPerformed

    private void paymentFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentFieldKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           double payment = Double.parseDouble(paymentField.getText());
           
           double totalBalance = tuitionFee - payment;
           balance.setText("₱" + totalBalance);
           
       }
    }//GEN-LAST:event_paymentFieldKeyPressed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        JOptionPane.showMessageDialog(null,"You are successfully enrolled.");
    }//GEN-LAST:event_doneButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuitionFee().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balTitle;
    private javax.swing.JLabel balance;
    private javax.swing.JButton doneButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel month;
    private javax.swing.JTextField paymentField;
    private javax.swing.JLabel paymentTitle;
    private javax.swing.JLabel semester;
    private javax.swing.JLabel tuitionBackground;
    private javax.swing.JLabel tuitionEnrollBG;
    private javax.swing.JLabel tuitionLogo;
    private javax.swing.JLabel tuitionPaymentlBG;
    private javax.swing.JLabel tuitionTitle;
    private javax.swing.JPanel tuitionTitleBG;
    private javax.swing.JLabel tutiontInfoEnrollment;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
