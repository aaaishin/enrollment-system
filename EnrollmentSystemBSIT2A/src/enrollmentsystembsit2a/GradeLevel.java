package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GradeLevel extends javax.swing.JFrame {
    public GradeLevel() {
        initComponents();
    }

    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gradeLevelLogo = new javax.swing.JLabel();
        nextInformation = new javax.swing.JButton();
        gradeLevel = new javax.swing.JComboBox<>();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setBackground(new java.awt.Color(0, 0, 51));
        setIconImage(logo.getImage());
        setMaximumSize(new java.awt.Dimension(1015, 586));
        setMinimumSize(new java.awt.Dimension(1015, 586));
        setPreferredSize(new java.awt.Dimension(1014, 586));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 18, 83));
        jLabel1.setText("Select your");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 250, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 18, 83));
        jLabel2.setText("Grade Level:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 280, 50));

        gradeLevelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enrollment_system_transparent_logo_circle.png"))); // NOI18N
        gradeLevelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(gradeLevelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 400, 390));

        nextInformation.setBackground(new java.awt.Color(0, 18, 83));
        nextInformation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextInformation.setForeground(new java.awt.Color(255, 255, 255));
        nextInformation.setText("NEXT");
        nextInformation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextInformation.setFocusable(false);
        nextInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextInformationActionPerformed(evt);
            }
        });
        getContentPane().add(nextInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 200, 40));

        gradeLevel.setBackground(new java.awt.Color(255, 255, 255));
        gradeLevel.setEditable(true);
        gradeLevel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        gradeLevel.setForeground(new java.awt.Color(0, 18, 83));
        gradeLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRADE 7", "GRADE 8", "GRADE 9", "GRADE 10" }));
        gradeLevel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradeLevel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gradeLevel.setFocusable(false);
        getContentPane().add(gradeLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 200, 40));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heaven.jpg"))); // NOI18N
        imageBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 83), 10));
        imageBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imageBackground.setFocusable(false);
        imageBackground.setMaximumSize(new java.awt.Dimension(1020, 570));
        imageBackground.setMinimumSize(new java.awt.Dimension(1020, 570));
        imageBackground.setPreferredSize(new java.awt.Dimension(1020, 570));
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextInformationActionPerformed
        PersonalInformation perInfo = new PersonalInformation();
        perInfo.show();

        dispose();    }//GEN-LAST:event_nextInformationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradeLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeLevel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> gradeLevel;
    private javax.swing.JLabel gradeLevelLogo;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextInformation;
    // End of variables declaration//GEN-END:variables
}
