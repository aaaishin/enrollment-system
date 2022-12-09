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
        nextTuitionFee = new javax.swing.JButton();
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
        getContentPane().add(subjectInfoEnrollment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        subjectEnrollBG.setBackground(new java.awt.Color(0, 18, 83, 150));
        subjectEnrollBG.setForeground(new java.awt.Color(0, 18, 83));
        subjectEnrollBG.setOpaque(true);
        getContentPane().add(subjectEnrollBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 570, 60));

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
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(subjectsTitle)
                .addGap(422, 422, 422))
        );
        subjectTitleBGLayout.setVerticalGroup(
            subjectTitleBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subjectsTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(subjectTitleBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1000, 40));

        subjectTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/subjects.png"))); // NOI18N
        getContentPane().add(subjectTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 340));

        prevParentInfo.setBackground(new java.awt.Color(0, 18, 83));
        prevParentInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prevParentInfo.setForeground(new java.awt.Color(255, 255, 255));
        prevParentInfo.setText("PREVIOUS");
        prevParentInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prevParentInfo.setFocusable(false);
        prevParentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevParentInfoActionPerformed(evt);
            }
        });
        getContentPane().add(prevParentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 140, 40));

        nextTuitionFee.setBackground(new java.awt.Color(0, 18, 83));
        nextTuitionFee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextTuitionFee.setForeground(new java.awt.Color(255, 255, 255));
        nextTuitionFee.setText("NEXT");
        nextTuitionFee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextTuitionFee.setFocusable(false);
        nextTuitionFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTuitionFeeActionPerformed(evt);
            }
        });
        getContentPane().add(nextTuitionFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 140, 40));

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

    private void nextTuitionFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTuitionFeeActionPerformed
        
        TuitionFee tuitionFee = new TuitionFee();
        tuitionFee.show();

        dispose();
        
    }//GEN-LAST:event_nextTuitionFeeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nextTuitionFee;
    private javax.swing.JButton prevParentInfo;
    private javax.swing.JLabel subjectBackground;
    private javax.swing.JLabel subjectEnrollBG;
    private javax.swing.JLabel subjectInfoEnrollment;
    private javax.swing.JLabel subjectTable;
    private javax.swing.JPanel subjectTitleBG;
    private javax.swing.JLabel subjectsTitle;
    // End of variables declaration//GEN-END:variables
}
