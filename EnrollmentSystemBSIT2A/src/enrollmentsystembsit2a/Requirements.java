package enrollmentsystembsit2a;

import javax.swing.ImageIcon;

public class Requirements extends javax.swing.JFrame {

    public Requirements() {
        initComponents();
    }
    
    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reqEnrollTitle = new javax.swing.JLabel();
        reqTitleBG = new javax.swing.JLabel();
        reqName = new javax.swing.JLabel();
        prevSubject = new javax.swing.JButton();
        nextTuitionFee = new javax.swing.JButton();
        requirements = new javax.swing.JLabel();
        agree = new javax.swing.JCheckBox();
        reqNameBG = new javax.swing.JLabel();
        agreement2 = new javax.swing.JLabel();
        agreement = new javax.swing.JLabel();
        reqBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(logo.getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reqEnrollTitle.setBackground(new java.awt.Color(0, 18, 83));
        reqEnrollTitle.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        reqEnrollTitle.setForeground(new java.awt.Color(255, 255, 255));
        reqEnrollTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reqEnrollTitle.setText("ENROLLMENT SYSTEM");
        getContentPane().add(reqEnrollTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        reqTitleBG.setBackground(new java.awt.Color(0, 18, 83));
        reqTitleBG.setForeground(new java.awt.Color(0, 18, 83));
        reqTitleBG.setOpaque(true);
        getContentPane().add(reqTitleBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 570, 70));

        reqName.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        reqName.setForeground(new java.awt.Color(255, 255, 255));
        reqName.setText("REQUIREMENTS");
        getContentPane().add(reqName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 20));

        prevSubject.setBackground(new java.awt.Color(0, 18, 83));
        prevSubject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prevSubject.setForeground(new java.awt.Color(255, 255, 255));
        prevSubject.setText("PREVIOUS");
        prevSubject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prevSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevSubject.setFocusable(false);
        prevSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevSubjectActionPerformed(evt);
            }
        });
        getContentPane().add(prevSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 140, 40));

        nextTuitionFee.setBackground(new java.awt.Color(0, 18, 83));
        nextTuitionFee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextTuitionFee.setForeground(new java.awt.Color(255, 255, 255));
        nextTuitionFee.setText("NEXT");
        nextTuitionFee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextTuitionFee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextTuitionFee.setFocusable(false);
        nextTuitionFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTuitionFeeActionPerformed(evt);
            }
        });
        getContentPane().add(nextTuitionFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 140, 40));

        requirements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/req.png"))); // NOI18N
        getContentPane().add(requirements, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        agree.setBackground(new java.awt.Color(95,157,247, 255));
        agree.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        agree.setForeground(new java.awt.Color(0, 18, 83));
        agree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agree.setMargin(new java.awt.Insets(0, 0, 0, 0));
        agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeActionPerformed(evt);
            }
        });
        getContentPane().add(agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 30, 30));

        reqNameBG.setBackground(new java.awt.Color(0, 18, 83));
        reqNameBG.setForeground(new java.awt.Color(0, 18, 83));
        reqNameBG.setOpaque(true);
        getContentPane().add(reqNameBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 40));

        agreement2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        agreement2.setForeground(new java.awt.Color(0, 18, 83));
        agreement2.setText("the first quarter of the school year my application will be forfeited.");
        getContentPane().add(agreement2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 420, -1));

        agreement.setBackground(new java.awt.Color(0, 0, 0));
        agreement.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        agreement.setForeground(new java.awt.Color(0, 18, 83));
        agreement.setText("I agree that if I do not submit the hardcopy of my requirements within");
        getContentPane().add(agreement, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        reqBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heaven.jpg"))); // NOI18N
        reqBG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 83), 10));
        getContentPane().add(reqBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevSubjectActionPerformed

        Subject sub = new Subject();
        sub.show();

        dispose();
    }//GEN-LAST:event_prevSubjectActionPerformed

    private void nextTuitionFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTuitionFeeActionPerformed

        TuitionFee tuitionFee = new TuitionFee();
        tuitionFee.show();

        dispose();

    }//GEN-LAST:event_nextTuitionFeeActionPerformed

    private void agreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeActionPerformed

    }//GEN-LAST:event_agreeActionPerformed

    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requirements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agree;
    private javax.swing.JLabel agreement;
    private javax.swing.JLabel agreement2;
    private javax.swing.JButton nextTuitionFee;
    private javax.swing.JButton prevSubject;
    private javax.swing.JLabel reqBG;
    private javax.swing.JLabel reqEnrollTitle;
    private javax.swing.JLabel reqName;
    private javax.swing.JLabel reqNameBG;
    private javax.swing.JLabel reqTitleBG;
    private javax.swing.JLabel requirements;
    // End of variables declaration//GEN-END:variables
}
