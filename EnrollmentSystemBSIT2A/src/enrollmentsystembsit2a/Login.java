package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    
    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    Registration register = new Registration();
    
    int tries = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginSchoolName = new javax.swing.JLabel();
        loginSchoolNameShadow = new javax.swing.JLabel();
        loginSchoolNameBackground = new javax.swing.JLabel();
        loginUserName = new javax.swing.JTextField();
        userName = new javax.swing.JLabel();
        userNameShadow = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        passwordShadow = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        registrationBackground = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginSchoolBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(logo.getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginSchoolName.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        loginSchoolName.setForeground(new java.awt.Color(255, 255, 255));
        loginSchoolName.setText("SAINT ANNE'S CATHOLIC SCHOOL");
        getContentPane().add(loginSchoolName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 780, 60));

        loginSchoolNameShadow.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        loginSchoolNameShadow.setForeground(new java.awt.Color(0, 0, 0));
        loginSchoolNameShadow.setText("SAINT ANNE'S CATHOLIC SCHOOL");
        getContentPane().add(loginSchoolNameShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 790, 90));

        loginSchoolNameBackground.setBackground(new java.awt.Color(0, 18, 83, 150));
        loginSchoolNameBackground.setForeground(new java.awt.Color(0, 18, 83));
        loginSchoolNameBackground.setOpaque(true);
        getContentPane().add(loginSchoolNameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 820, 80));

        loginUserName.setBackground(new java.awt.Color(255, 255, 255));
        loginUserName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginUserName.setForeground(new java.awt.Color(0, 18, 83));
        loginUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginUserName.setPreferredSize(new java.awt.Dimension(65, 25));
        loginUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserNameActionPerformed(evt);
            }
        });
        loginUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginUserNameKeyTyped(evt);
            }
        });
        getContentPane().add(loginUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 330, 30));

        userName.setBackground(new java.awt.Color(0, 18, 83));
        userName.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("USERNAME:");
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, 40));

        userNameShadow.setBackground(new java.awt.Color(0, 18, 83));
        userNameShadow.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        userNameShadow.setForeground(new java.awt.Color(0, 0, 0));
        userNameShadow.setText("USERNAME:");
        getContentPane().add(userNameShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 70));

        password.setBackground(new java.awt.Color(0, 18, 83));
        password.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("PASSWORD:");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, 40));

        passwordShadow.setBackground(new java.awt.Color(0, 18, 83));
        passwordShadow.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        passwordShadow.setForeground(new java.awt.Color(0, 0, 0));
        passwordShadow.setText("PASSWORD:");
        getContentPane().add(passwordShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, 90));

        loginPassword.setBackground(new java.awt.Color(255, 255, 255));
        loginPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginPassword.setForeground(new java.awt.Color(0, 18, 83));
        loginPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordActionPerformed(evt);
            }
        });
        loginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 330, 30));

        registrationBackground.setBackground(new java.awt.Color(0, 18, 83, 100));
        registrationBackground.setForeground(new java.awt.Color(0, 18, 83));
        registrationBackground.setOpaque(true);
        getContentPane().add(registrationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 450, 240));

        loginButton.setBackground(new java.awt.Color(0, 18, 83));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log In");
        loginButton.setActionCommand("Sign In");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 200, 50));

        loginSchoolBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/school_background.png"))); // NOI18N
        loginSchoolBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 18, 83), 10, true));
        loginSchoolBackground.setMaximumSize(new java.awt.Dimension(1020, 520));
        getContentPane().add(loginSchoolBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserNameActionPerformed

    }//GEN-LAST:event_loginUserNameActionPerformed

    private void loginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordActionPerformed

    }//GEN-LAST:event_loginPasswordActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String userName = loginUserName.getText();
        String passWord = loginPassword.getText();
        
        if(userName.contains("Aishin") && (passWord.contains("justin"))){
            loginUserName.setText("");
            loginPassword.setText("");
            
            GradeLevel gradeLevel = new GradeLevel();
            gradeLevel.show();

            dispose();
            
        }
        else if(!(userName.contains("one") && passWord.contains("one"))){
            JOptionPane.showMessageDialog(null, "Invalid Login Details.", "St. Anne's Catholic School Log In", JOptionPane.ERROR_MESSAGE);
            loginUserName.setText(null);
            loginPassword.setText(null);
            loginUserName.grabFocus();
            loginPassword.grabFocus();
            tries += 1;
            
            if(tries == 3){
                System.exit(0);
            }
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUserNameKeyTyped
        if(loginUserName.getText().length() >= 6){
            evt.consume();
        }
    }//GEN-LAST:event_loginUserNameKeyTyped

    private void loginPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordKeyTyped

    }//GEN-LAST:event_loginPasswordKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    public javax.swing.JPasswordField loginPassword;
    private javax.swing.JLabel loginSchoolBackground;
    private javax.swing.JLabel loginSchoolName;
    private javax.swing.JLabel loginSchoolNameBackground;
    private javax.swing.JLabel loginSchoolNameShadow;
    public javax.swing.JTextField loginUserName;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordShadow;
    private javax.swing.JLabel registrationBackground;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userNameShadow;
    // End of variables declaration//GEN-END:variables
}
