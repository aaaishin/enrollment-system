package enrollmentsystembsit2a;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Registration extends javax.swing.JFrame {
    public Registration() {
        initComponents();
    }
    
    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationSchoolName = new javax.swing.JLabel();
        registrationSchoolNameShadow = new javax.swing.JLabel();
        schoolNameBackground = new javax.swing.JLabel();
        full_name = new javax.swing.JLabel();
        full_name1 = new javax.swing.JLabel();
        registrationEmail = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        email_address1 = new javax.swing.JLabel();
        registrationFullName = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        registrationPassword = new javax.swing.JPasswordField();
        registrationBackground = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        schoolBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(logo.getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationSchoolName.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        registrationSchoolName.setForeground(new java.awt.Color(255, 255, 255));
        registrationSchoolName.setText("SAINT ANNE'S CATHOLIC SCHOOL");
        getContentPane().add(registrationSchoolName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 780, 60));

        registrationSchoolNameShadow.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        registrationSchoolNameShadow.setForeground(new java.awt.Color(0, 0, 0));
        registrationSchoolNameShadow.setText("SAINT ANNE'S CATHOLIC SCHOOL");
        getContentPane().add(registrationSchoolNameShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 790, 90));

        schoolNameBackground.setBackground(new java.awt.Color(0, 18, 83, 150));
        schoolNameBackground.setForeground(new java.awt.Color(0, 18, 83));
        schoolNameBackground.setOpaque(true);
        getContentPane().add(schoolNameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 820, 80));

        full_name.setBackground(new java.awt.Color(255, 255, 255));
        full_name.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        full_name.setForeground(new java.awt.Color(255, 255, 255));
        full_name.setText("FULL NAME");
        getContentPane().add(full_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 30));

        full_name1.setBackground(new java.awt.Color(0, 0, 0));
        full_name1.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        full_name1.setForeground(new java.awt.Color(0, 0, 0));
        full_name1.setText("FULL NAME");
        getContentPane().add(full_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 60));

        registrationEmail.setBackground(new java.awt.Color(255, 255, 255));
        registrationEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registrationEmail.setForeground(new java.awt.Color(0, 18, 83));
        registrationEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationEmail.setPreferredSize(new java.awt.Dimension(65, 25));
        registrationEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationEmailActionPerformed(evt);
            }
        });
        getContentPane().add(registrationEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 330, 30));

        email_address.setBackground(new java.awt.Color(0, 18, 83));
        email_address.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        email_address.setForeground(new java.awt.Color(255, 255, 255));
        email_address.setText("EMAIL");
        getContentPane().add(email_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, 40));

        email_address1.setBackground(new java.awt.Color(0, 18, 83));
        email_address1.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        email_address1.setForeground(new java.awt.Color(0, 0, 0));
        email_address1.setText("EMAIL");
        getContentPane().add(email_address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, 70));

        registrationFullName.setBackground(new java.awt.Color(255, 255, 255));
        registrationFullName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registrationFullName.setForeground(new java.awt.Color(0, 18, 83));
        registrationFullName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationFullName.setMargin(new java.awt.Insets(5, 10, 5, 10));
        registrationFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFullNameActionPerformed(evt);
            }
        });
        getContentPane().add(registrationFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 330, 30));

        password.setBackground(new java.awt.Color(0, 18, 83));
        password.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("PASSWORD");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, 40));

        password1.setBackground(new java.awt.Color(0, 18, 83));
        password1.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        password1.setForeground(new java.awt.Color(0, 0, 0));
        password1.setText("PASSWORD");
        getContentPane().add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 90));

        registrationPassword.setBackground(new java.awt.Color(255, 255, 255));
        registrationPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registrationPassword.setForeground(new java.awt.Color(0, 18, 83));
        registrationPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(registrationPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 330, 30));

        registrationBackground.setBackground(new java.awt.Color(0, 18, 83, 100));
        registrationBackground.setForeground(new java.awt.Color(0, 18, 83));
        registrationBackground.setOpaque(true);
        getContentPane().add(registrationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 450, 270));

        loginButton.setBackground(new java.awt.Color(0, 0, 51));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log In");
        loginButton.setActionCommand("Sign In");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 200, 50));

        signUpButton.setBackground(new java.awt.Color(0, 0, 51));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.setActionCommand("Sign In");
        signUpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 200, 50));

        schoolBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/school_background.png"))); // NOI18N
        schoolBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 18, 83), 10, true));
        schoolBackground.setMaximumSize(new java.awt.Dimension(1020, 520));
        getContentPane().add(schoolBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrationEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationEmailActionPerformed
        registrationEmail.getText();
        
        
    }//GEN-LAST:event_registrationEmailActionPerformed

    private void registrationFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationFullNameActionPerformed
        registrationFullName.getText();
    }//GEN-LAST:event_registrationFullNameActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed

    }//GEN-LAST:event_signUpButtonActionPerformed

    private void registrationPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationPasswordActionPerformed
        registrationPassword.getText();
    }//GEN-LAST:event_registrationPasswordActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Login login = new Login();
        login.show();
        
        dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

        private void proceedInfoActionPerformed(java.awt.event.ActionEvent evt) {                                            

        Login login = new Login();
        login.show();
        
        dispose();
        
    }  
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email_address;
    private javax.swing.JLabel email_address1;
    private javax.swing.JLabel full_name;
    private javax.swing.JLabel full_name1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel registrationBackground;
    public javax.swing.JTextField registrationEmail;
    public javax.swing.JTextField registrationFullName;
    public javax.swing.JPasswordField registrationPassword;
    private javax.swing.JLabel registrationSchoolName;
    private javax.swing.JLabel registrationSchoolNameShadow;
    private javax.swing.JLabel schoolBackground;
    private javax.swing.JLabel schoolNameBackground;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
}
