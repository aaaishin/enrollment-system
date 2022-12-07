package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;

public class StartEnrollmentSystem extends javax.swing.JFrame {

    public StartEnrollmentSystem() {
        initComponents();
    }
    
    public class JPanelWithBackground extends JPanel {

        private Image backgroundImage;

        public JPanelWithBackground(String fileName) throws IOException {
          backgroundImage = ImageIO.read(new File("heaven.jpg"));
        }

        public void paintComponent(Graphics g) {
          super.paintComponent(g);

          // Draw the background image.
          g.drawImage(backgroundImage, 0, 0, this);
        }
    }

    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoStart = new javax.swing.JLabel();
        welcomeText1 = new javax.swing.JLabel();
        welcomeText = new javax.swing.JLabel();
        proceedInfo = new javax.swing.JButton();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setBackground(new java.awt.Color(200, 200, 200));
        setIconImage(logo.getImage()
        );
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enrollment_system_transparent_logo_circle.png"))); // NOI18N
        getContentPane().add(logoStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 390, 390));

        welcomeText1.setFont(new java.awt.Font("Vladimir Script", 2, 100)); // NOI18N
        welcomeText1.setForeground(new java.awt.Color(255, 212, 17));
        welcomeText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText1.setText("Welcome");
        getContentPane().add(welcomeText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 340, 90));

        welcomeText.setFont(new java.awt.Font("Vladimir Script", 2, 100)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(191, 155, 48));
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome");
        getContentPane().add(welcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 350, 90));

        proceedInfo.setBackground(new java.awt.Color(95, 157, 247));
        proceedInfo.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        proceedInfo.setForeground(new java.awt.Color(0, 18, 83));
        proceedInfo.setText("Proceed");
        proceedInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proceedInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceedInfo.setFocusable(false);
        proceedInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proceedInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedInfoActionPerformed(evt);
            }
        });
        getContentPane().add(proceedInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 440, 30));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heaven.jpg"))); // NOI18N
        imageBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 18, 83), 10, true));
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proceedInfoActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartEnrollmentSystem().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel logoStart;
    private javax.swing.JButton proceedInfo;
    private javax.swing.JLabel welcomeText;
    private javax.swing.JLabel welcomeText1;
    // End of variables declaration//GEN-END:variables

}
