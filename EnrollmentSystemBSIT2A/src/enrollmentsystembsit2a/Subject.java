package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Subject extends javax.swing.JFrame {

    static void AddRowToTable(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void AddRowToSubject(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Subject() {
        initComponents();
    }

    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subjectInfoEnrollment = new javax.swing.JLabel();
        subjectEnrollBG = new javax.swing.JLabel();
        subjectTitleBG = new javax.swing.JPanel();
        subjectsTitle = new javax.swing.JLabel();
        subjectTable = new javax.swing.JLabel();
        prevParentInfo = new javax.swing.JButton();
        nextRequirements = new javax.swing.JButton();
        subjectBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setIconImage(logo.getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subjectInfoEnrollment.setBackground(new java.awt.Color(0, 18, 83));
        subjectInfoEnrollment.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        subjectInfoEnrollment.setForeground(new java.awt.Color(255, 255, 255));
        subjectInfoEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subjectInfoEnrollment.setText("ENROLLMENT SYSTEM");
        getContentPane().add(subjectInfoEnrollment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        subjectEnrollBG.setBackground(new java.awt.Color(0, 18, 83));
        subjectEnrollBG.setForeground(new java.awt.Color(0, 18, 83));
        subjectEnrollBG.setOpaque(true);
        getContentPane().add(subjectEnrollBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 570, 70));

        subjectTitleBG.setBackground(new java.awt.Color(0, 18, 83));

        subjectsTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        subjectsTitle.setForeground(new java.awt.Color(255, 255, 255));
        subjectsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subjectsTitle.setText("SUBJECTS");

        javax.swing.GroupLayout subjectTitleBGLayout = new javax.swing.GroupLayout(subjectTitleBG);
        subjectTitleBG.setLayout(subjectTitleBGLayout);
        subjectTitleBGLayout.setHorizontalGroup(
            subjectTitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectTitleBGLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(subjectsTitle)
                .addGap(412, 412, 412))
        );
        subjectTitleBGLayout.setVerticalGroup(
            subjectTitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subjectsTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(subjectTitleBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1000, 40));

        subjectTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/subjects.png"))); // NOI18N
        getContentPane().add(subjectTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 340));

        prevParentInfo.setBackground(new java.awt.Color(0, 18, 83));
        prevParentInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prevParentInfo.setForeground(new java.awt.Color(255, 255, 255));
        prevParentInfo.setText("PREVIOUS");
        prevParentInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prevParentInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevParentInfo.setFocusable(false);
        prevParentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevParentInfoActionPerformed(evt);
            }
        });
        getContentPane().add(prevParentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 140, 40));

        nextRequirements.setBackground(new java.awt.Color(0, 18, 83));
        nextRequirements.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextRequirements.setForeground(new java.awt.Color(255, 255, 255));
        nextRequirements.setText("NEXT");
        nextRequirements.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextRequirements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextRequirements.setFocusable(false);
        nextRequirements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRequirementsActionPerformed(evt);
            }
        });
        getContentPane().add(nextRequirements, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 140, 40));

        subjectBackground.setForeground(new java.awt.Color(0, 18, 83));
        subjectBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heaven.jpg"))); // NOI18N
        subjectBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 83), 10));
        getContentPane().add(subjectBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevParentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevParentInfoActionPerformed

        ParentInformation parentInfo = new ParentInformation();
        parentInfo.show();

        dispose();
    }//GEN-LAST:event_prevParentInfoActionPerformed

    private void nextRequirementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRequirementsActionPerformed
        
        Requirements req = new Requirements();
        req.show();

        dispose();
        
    }//GEN-LAST:event_nextRequirementsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nextRequirements;
    private javax.swing.JButton prevParentInfo;
    private javax.swing.JLabel subjectBackground;
    private javax.swing.JLabel subjectEnrollBG;
    private javax.swing.JLabel subjectInfoEnrollment;
    private javax.swing.JLabel subjectTable;
    private javax.swing.JPanel subjectTitleBG;
    private javax.swing.JLabel subjectsTitle;
    // End of variables declaration//GEN-END:variables
}
