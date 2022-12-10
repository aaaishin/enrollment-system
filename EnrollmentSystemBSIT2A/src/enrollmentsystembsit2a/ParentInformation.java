package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.util.*;

    public class ParentInformation extends javax.swing.JFrame {
        public ParentInformation() {
        initComponents();
    }
        
    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoEnrollment = new javax.swing.JLabel();
        parentEnrollBG = new javax.swing.JLabel();
        famBG = new javax.swing.JPanel();
        famBackground = new javax.swing.JLabel();
        faField = new javax.swing.JTextField();
        fatherAddress = new javax.swing.JLabel();
        fcField = new javax.swing.JTextField();
        fatherContact = new javax.swing.JLabel();
        motherName = new javax.swing.JLabel();
        mnField = new javax.swing.JTextField();
        motherAddress = new javax.swing.JLabel();
        maField = new javax.swing.JTextField();
        guardianName = new javax.swing.JLabel();
        gnField = new javax.swing.JTextField();
        guardianAddress = new javax.swing.JLabel();
        gaField = new javax.swing.JTextField();
        fnField = new javax.swing.JTextField();
        foField = new javax.swing.JTextField();
        fatherName = new javax.swing.JLabel();
        fatherOcc = new javax.swing.JLabel();
        moField = new javax.swing.JTextField();
        mcField = new javax.swing.JTextField();
        goField = new javax.swing.JTextField();
        gcField = new javax.swing.JTextField();
        motherOcc = new javax.swing.JLabel();
        motherContact = new javax.swing.JLabel();
        guardianOcc = new javax.swing.JLabel();
        guardianContact = new javax.swing.JLabel();
        prevPersoInfo = new javax.swing.JButton();
        nextSub = new javax.swing.JButton();
        parentEnrollInfoBG = new javax.swing.JLabel();
        parentSchoolBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(logo.getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoEnrollment.setBackground(new java.awt.Color(0, 18, 83));
        infoEnrollment.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        infoEnrollment.setForeground(new java.awt.Color(255, 255, 255));
        infoEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoEnrollment.setText("ENROLLMENT SYSTEM");
        getContentPane().add(infoEnrollment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        parentEnrollBG.setBackground(new java.awt.Color(0, 18, 83, 150));
        parentEnrollBG.setForeground(new java.awt.Color(0, 18, 83));
        parentEnrollBG.setOpaque(true);
        getContentPane().add(parentEnrollBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 570, 60));

        famBG.setBackground(new java.awt.Color(0, 18, 83));

        famBackground.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        famBackground.setForeground(new java.awt.Color(255, 255, 255));
        famBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        famBackground.setText("FAMILY BACKGROUND");

        javax.swing.GroupLayout famBGLayout = new javax.swing.GroupLayout(famBG);
        famBG.setLayout(famBGLayout);
        famBGLayout.setHorizontalGroup(
            famBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, famBGLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(famBackground)
                .addGap(330, 330, 330))
        );
        famBGLayout.setVerticalGroup(
            famBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(famBGLayout.createSequentialGroup()
                .addComponent(famBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(famBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 40));

        faField.setBackground(new java.awt.Color(255, 255, 255));
        faField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        faField.setForeground(new java.awt.Color(0, 18, 83));
        faField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faFieldActionPerformed(evt);
            }
        });
        getContentPane().add(faField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 690, 30));

        fatherAddress.setBackground(new java.awt.Color(0, 0, 102));
        fatherAddress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fatherAddress.setForeground(new java.awt.Color(255, 255, 255));
        fatherAddress.setText("Address*");
        getContentPane().add(fatherAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        fcField.setBackground(new java.awt.Color(255, 255, 255));
        fcField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fcField.setForeground(new java.awt.Color(0, 18, 83));
        fcField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcFieldActionPerformed(evt);
            }
        });
        getContentPane().add(fcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 240, 30));

        fatherContact.setBackground(new java.awt.Color(0, 0, 102));
        fatherContact.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fatherContact.setForeground(new java.awt.Color(255, 255, 255));
        fatherContact.setText("Contact Number*");
        getContentPane().add(fatherContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        motherName.setBackground(new java.awt.Color(0, 0, 102));
        motherName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        motherName.setForeground(new java.awt.Color(255, 255, 255));
        motherName.setText("Mother's Name*");
        getContentPane().add(motherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        mnField.setBackground(new java.awt.Color(255, 255, 255));
        mnField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        mnField.setForeground(new java.awt.Color(0, 18, 83));
        mnField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 570, 30));

        motherAddress.setBackground(new java.awt.Color(0, 0, 102));
        motherAddress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        motherAddress.setForeground(new java.awt.Color(255, 255, 255));
        motherAddress.setText("Address*");
        getContentPane().add(motherAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        maField.setBackground(new java.awt.Color(255, 255, 255));
        maField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        maField.setForeground(new java.awt.Color(0, 18, 83));
        maField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        maField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maFieldActionPerformed(evt);
            }
        });
        getContentPane().add(maField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 690, 30));

        guardianName.setBackground(new java.awt.Color(0, 0, 102));
        guardianName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        guardianName.setForeground(new java.awt.Color(255, 255, 255));
        guardianName.setText("Guardian's Name*");
        getContentPane().add(guardianName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        gnField.setBackground(new java.awt.Color(255, 255, 255));
        gnField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        gnField.setForeground(new java.awt.Color(0, 18, 83));
        gnField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnFieldActionPerformed(evt);
            }
        });
        getContentPane().add(gnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 570, 30));

        guardianAddress.setBackground(new java.awt.Color(0, 0, 102));
        guardianAddress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        guardianAddress.setForeground(new java.awt.Color(255, 255, 255));
        guardianAddress.setText("Address*");
        getContentPane().add(guardianAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        gaField.setBackground(new java.awt.Color(255, 255, 255));
        gaField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        gaField.setForeground(new java.awt.Color(0, 18, 83));
        gaField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(gaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 690, 30));

        fnField.setBackground(new java.awt.Color(255, 255, 255));
        fnField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fnField.setForeground(new java.awt.Color(0, 18, 83));
        fnField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnFieldActionPerformed(evt);
            }
        });
        getContentPane().add(fnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 570, 30));

        foField.setBackground(new java.awt.Color(255, 255, 255));
        foField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        foField.setForeground(new java.awt.Color(0, 18, 83));
        foField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        foField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foFieldActionPerformed(evt);
            }
        });
        getContentPane().add(foField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 340, 30));

        fatherName.setBackground(new java.awt.Color(0, 0, 102));
        fatherName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fatherName.setForeground(new java.awt.Color(255, 255, 255));
        fatherName.setText("Father's Name*");
        getContentPane().add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        fatherOcc.setBackground(new java.awt.Color(0, 0, 102));
        fatherOcc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fatherOcc.setForeground(new java.awt.Color(255, 255, 255));
        fatherOcc.setText("Occupation*");
        getContentPane().add(fatherOcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        moField.setBackground(new java.awt.Color(255, 255, 255));
        moField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        moField.setForeground(new java.awt.Color(0, 18, 83));
        moField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moFieldActionPerformed(evt);
            }
        });
        getContentPane().add(moField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 340, 30));

        mcField.setBackground(new java.awt.Color(255, 255, 255));
        mcField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        mcField.setForeground(new java.awt.Color(0, 18, 83));
        mcField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 240, 30));

        goField.setBackground(new java.awt.Color(255, 255, 255));
        goField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        goField.setForeground(new java.awt.Color(0, 18, 83));
        goField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        goField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goFieldActionPerformed(evt);
            }
        });
        getContentPane().add(goField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 340, 30));

        gcField.setBackground(new java.awt.Color(255, 255, 255));
        gcField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        gcField.setForeground(new java.awt.Color(0, 18, 83));
        gcField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcFieldActionPerformed(evt);
            }
        });
        getContentPane().add(gcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 240, 30));

        motherOcc.setBackground(new java.awt.Color(0, 0, 102));
        motherOcc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        motherOcc.setForeground(new java.awt.Color(255, 255, 255));
        motherOcc.setText("Occupation*");
        getContentPane().add(motherOcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        motherContact.setBackground(new java.awt.Color(0, 0, 102));
        motherContact.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        motherContact.setForeground(new java.awt.Color(255, 255, 255));
        motherContact.setText("Contact Number*");
        getContentPane().add(motherContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        guardianOcc.setBackground(new java.awt.Color(0, 0, 102));
        guardianOcc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        guardianOcc.setForeground(new java.awt.Color(255, 255, 255));
        guardianOcc.setText("Occupation*");
        getContentPane().add(guardianOcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        guardianContact.setBackground(new java.awt.Color(0, 0, 102));
        guardianContact.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        guardianContact.setForeground(new java.awt.Color(255, 255, 255));
        guardianContact.setText("Contact Number*");
        getContentPane().add(guardianContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 120, -1));

        prevPersoInfo.setBackground(new java.awt.Color(0, 18, 83));
        prevPersoInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prevPersoInfo.setForeground(new java.awt.Color(255, 255, 255));
        prevPersoInfo.setText("PREVIOUS");
        prevPersoInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prevPersoInfo.setFocusable(false);
        prevPersoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPersoInfoActionPerformed(evt);
            }
        });
        getContentPane().add(prevPersoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, 40));

        nextSub.setBackground(new java.awt.Color(0, 18, 83));
        nextSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextSub.setForeground(new java.awt.Color(255, 255, 255));
        nextSub.setText("NEXT");
        nextSub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextSub.setFocusable(false);
        nextSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSubActionPerformed(evt);
            }
        });
        getContentPane().add(nextSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 140, 40));

        parentEnrollInfoBG.setBackground(new java.awt.Color(0, 18, 83, 150));
        parentEnrollInfoBG.setForeground(new java.awt.Color(0, 18, 83));
        parentEnrollInfoBG.setOpaque(true);
        getContentPane().add(parentEnrollInfoBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 980, 380));

        parentSchoolBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/school_background.png"))); // NOI18N
        parentSchoolBG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 83), 10));
        getContentPane().add(parentSchoolBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void faFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faFieldActionPerformed

    private void fcFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcFieldActionPerformed

    private void mnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnFieldActionPerformed

    private void maFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maFieldActionPerformed

    private void gnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gnFieldActionPerformed

    private void gaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaFieldActionPerformed

    private void fnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnFieldActionPerformed

    private void foFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foFieldActionPerformed

    private void moFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moFieldActionPerformed

    private void mcFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcFieldActionPerformed

    private void goFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goFieldActionPerformed

    private void gcFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gcFieldActionPerformed

    private void prevPersoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPersoInfoActionPerformed

        PersonalInformation perInfo = new PersonalInformation();
        perInfo.show();

        dispose();
    }//GEN-LAST:event_prevPersoInfoActionPerformed

    private void nextSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextSubActionPerformed
        Subject sub = new Subject();
        sub.show();

        dispose();
    }//GEN-LAST:event_nextSubActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParentInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField faField;
    private javax.swing.JPanel famBG;
    private javax.swing.JLabel famBackground;
    private javax.swing.JLabel fatherAddress;
    private javax.swing.JLabel fatherContact;
    private javax.swing.JLabel fatherName;
    private javax.swing.JLabel fatherOcc;
    private javax.swing.JTextField fcField;
    private javax.swing.JTextField fnField;
    private javax.swing.JTextField foField;
    private javax.swing.JTextField gaField;
    private javax.swing.JTextField gcField;
    private javax.swing.JTextField gnField;
    private javax.swing.JTextField goField;
    private javax.swing.JLabel guardianAddress;
    private javax.swing.JLabel guardianContact;
    private javax.swing.JLabel guardianName;
    private javax.swing.JLabel guardianOcc;
    private javax.swing.JLabel infoEnrollment;
    private javax.swing.JTextField maField;
    private javax.swing.JTextField mcField;
    private javax.swing.JTextField mnField;
    private javax.swing.JTextField moField;
    private javax.swing.JLabel motherAddress;
    private javax.swing.JLabel motherContact;
    private javax.swing.JLabel motherName;
    private javax.swing.JLabel motherOcc;
    private javax.swing.JButton nextSub;
    private javax.swing.JLabel parentEnrollBG;
    private javax.swing.JLabel parentEnrollInfoBG;
    private javax.swing.JLabel parentSchoolBG;
    private javax.swing.JButton prevPersoInfo;
    // End of variables declaration//GEN-END:variables
}
