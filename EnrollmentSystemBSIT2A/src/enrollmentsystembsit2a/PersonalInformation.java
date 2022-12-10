package enrollmentsystembsit2a;

import javax.swing.*;
import java.awt.*;
import java.util.*;

    public class PersonalInformation extends javax.swing.JFrame {
        public PersonalInformation() {
        initComponents();
    }
    
    ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoEnrollment = new javax.swing.JLabel();
        enrollInfoBG = new javax.swing.JLabel();
        persoInfoBG = new javax.swing.JPanel();
        persoInfo = new javax.swing.JLabel();
        relField = new javax.swing.JTextField();
        pobField = new javax.swing.JTextField();
        firstField = new javax.swing.JTextField();
        provField = new javax.swing.JTextField();
        extField = new javax.swing.JTextField();
        lastField = new javax.swing.JTextField();
        middleField = new javax.swing.JTextField();
        brgyField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        homeField = new javax.swing.JTextField();
        genderBox = new javax.swing.JComboBox<>();
        telField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        prevGrade = new javax.swing.JButton();
        nextParent = new javax.swing.JButton();
        extName = new javax.swing.JLabel();
        placeholderProvince = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        middleName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        religion = new javax.swing.JLabel();
        placeholderHome = new javax.swing.JLabel();
        placeholderBrgy = new javax.swing.JLabel();
        placeholderCity = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        persoTelNo = new javax.swing.JLabel();
        placeBirth = new javax.swing.JLabel();
        dateBirth = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        persoEmail = new javax.swing.JLabel();
        persoContact = new javax.swing.JLabel();
        infoBG = new javax.swing.JLabel();
        persoSchoolBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("St. Anne's Catholic School Enrollment System");
        setIconImage(logo.getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoEnrollment.setBackground(new java.awt.Color(0, 18, 83));
        infoEnrollment.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        infoEnrollment.setForeground(new java.awt.Color(255, 255, 255));
        infoEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoEnrollment.setText("ENROLLMENT SYSTEM");
        getContentPane().add(infoEnrollment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        enrollInfoBG.setBackground(new java.awt.Color(0, 18, 83, 150));
        enrollInfoBG.setForeground(new java.awt.Color(0, 18, 83));
        enrollInfoBG.setOpaque(true);
        getContentPane().add(enrollInfoBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 570, 60));

        persoInfoBG.setBackground(new java.awt.Color(0, 18, 83));

        persoInfo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        persoInfo.setForeground(new java.awt.Color(255, 255, 255));
        persoInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        persoInfo.setText("PERSONAL INFORMATION");

        javax.swing.GroupLayout persoInfoBGLayout = new javax.swing.GroupLayout(persoInfoBG);
        persoInfoBG.setLayout(persoInfoBGLayout);
        persoInfoBGLayout.setHorizontalGroup(
            persoInfoBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, persoInfoBGLayout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(persoInfo)
                .addGap(308, 308, 308))
        );
        persoInfoBGLayout.setVerticalGroup(
            persoInfoBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, persoInfoBGLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(persoInfo))
        );

        getContentPane().add(persoInfoBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1000, 40));

        relField.setBackground(new java.awt.Color(255, 255, 255));
        relField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        relField.setForeground(new java.awt.Color(0, 18, 83));
        relField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        relField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        relField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relFieldActionPerformed(evt);
            }
        });
        getContentPane().add(relField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 180, 30));

        pobField.setBackground(new java.awt.Color(255, 255, 255));
        pobField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pobField.setForeground(new java.awt.Color(0, 18, 83));
        pobField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pobField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pobFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 380, 30));

        firstField.setBackground(new java.awt.Color(255, 255, 255));
        firstField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        firstField.setForeground(new java.awt.Color(0, 18, 83));
        firstField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        firstField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 210, 30));

        provField.setBackground(new java.awt.Color(255, 255, 255));
        provField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        provField.setForeground(new java.awt.Color(0, 18, 83));
        provField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        provField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        provField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provFieldActionPerformed(evt);
            }
        });
        getContentPane().add(provField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 150, 30));

        extField.setBackground(new java.awt.Color(255, 255, 255));
        extField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        extField.setForeground(new java.awt.Color(0, 18, 83));
        extField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        extField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        extField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extFieldActionPerformed(evt);
            }
        });
        getContentPane().add(extField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 110, 30));

        lastField.setBackground(new java.awt.Color(255, 255, 255));
        lastField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastField.setForeground(new java.awt.Color(0, 18, 83));
        lastField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lastField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lastField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        middleField.setBackground(new java.awt.Color(255, 255, 255));
        middleField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        middleField.setForeground(new java.awt.Color(0, 18, 83));
        middleField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        middleField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        middleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleFieldActionPerformed(evt);
            }
        });
        getContentPane().add(middleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 190, 30));

        brgyField.setBackground(new java.awt.Color(255, 255, 255));
        brgyField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        brgyField.setForeground(new java.awt.Color(0, 18, 83));
        brgyField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        brgyField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brgyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgyFieldActionPerformed(evt);
            }
        });
        getContentPane().add(brgyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 190, 30));

        cityField.setBackground(new java.awt.Color(255, 255, 255));
        cityField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cityField.setForeground(new java.awt.Color(0, 18, 83));
        cityField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cityField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 160, 30));

        homeField.setBackground(new java.awt.Color(255, 255, 255));
        homeField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        homeField.setForeground(new java.awt.Color(0, 18, 83));
        homeField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        homeField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(homeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 420, 30));

        genderBox.setBackground(new java.awt.Color(255, 255, 255));
        genderBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        genderBox.setForeground(new java.awt.Color(0, 18, 83));
        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderBox.setFocusable(false);
        getContentPane().add(genderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 200, 30));

        telField.setBackground(new java.awt.Color(255, 255, 255));
        telField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        telField.setForeground(new java.awt.Color(0, 18, 83));
        telField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });
        getContentPane().add(telField, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 230, 30));

        dobField.setBackground(new java.awt.Color(255, 255, 255));
        dobField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dobField.setForeground(new java.awt.Color(0, 18, 83));
        dobField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 330, 30));

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(0, 18, 83));
        emailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 440, 30));

        prevGrade.setBackground(new java.awt.Color(0, 18, 83));
        prevGrade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prevGrade.setForeground(new java.awt.Color(255, 255, 255));
        prevGrade.setText("PREVIOUS");
        prevGrade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prevGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevGrade.setFocusable(false);
        prevGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevGradeActionPerformed(evt);
            }
        });
        getContentPane().add(prevGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, 40));

        nextParent.setBackground(new java.awt.Color(0, 18, 83));
        nextParent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextParent.setForeground(new java.awt.Color(255, 255, 255));
        nextParent.setText("NEXT");
        nextParent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextParent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextParent.setFocusable(false);
        nextParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextParentActionPerformed(evt);
            }
        });
        getContentPane().add(nextParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 140, 40));

        extName.setBackground(new java.awt.Color(0, 0, 102));
        extName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        extName.setForeground(new java.awt.Color(255, 255, 255));
        extName.setText("Extension Name");
        getContentPane().add(extName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        placeholderProvince.setBackground(new java.awt.Color(102, 102, 102));
        placeholderProvince.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        placeholderProvince.setForeground(new java.awt.Color(255, 255, 255));
        placeholderProvince.setText("(Province*)");
        getContentPane().add(placeholderProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 70, -1));

        firstName.setBackground(new java.awt.Color(0, 0, 102));
        firstName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setText("First Name*");
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        gender.setBackground(new java.awt.Color(0, 0, 102));
        gender.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender*");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        middleName.setBackground(new java.awt.Color(0, 0, 102));
        middleName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        middleName.setForeground(new java.awt.Color(255, 255, 255));
        middleName.setText("Middle Name");
        getContentPane().add(middleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        lastName.setBackground(new java.awt.Color(0, 0, 102));
        lastName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setText("Last Name*");
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        religion.setBackground(new java.awt.Color(0, 0, 102));
        religion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        religion.setForeground(new java.awt.Color(255, 255, 255));
        religion.setText("Religion*");
        getContentPane().add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 60, -1));

        placeholderHome.setBackground(new java.awt.Color(102, 102, 102));
        placeholderHome.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        placeholderHome.setForeground(new java.awt.Color(255, 255, 255));
        placeholderHome.setText("(Home / Street No*)");
        getContentPane().add(placeholderHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        placeholderBrgy.setBackground(new java.awt.Color(102, 102, 102));
        placeholderBrgy.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        placeholderBrgy.setForeground(new java.awt.Color(255, 255, 255));
        placeholderBrgy.setText("(Barangay*)");
        getContentPane().add(placeholderBrgy, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 90, -1));

        placeholderCity.setBackground(new java.awt.Color(102, 102, 102));
        placeholderCity.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        placeholderCity.setForeground(new java.awt.Color(255, 255, 255));
        placeholderCity.setText("(City/Municipality*)");
        getContentPane().add(placeholderCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 120, -1));

        address.setBackground(new java.awt.Color(0, 0, 102));
        address.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Address*");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        persoTelNo.setBackground(new java.awt.Color(0, 0, 102));
        persoTelNo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        persoTelNo.setForeground(new java.awt.Color(255, 255, 255));
        persoTelNo.setText("Telephone Number*");
        getContentPane().add(persoTelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 130, -1));

        placeBirth.setBackground(new java.awt.Color(0, 0, 102));
        placeBirth.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        placeBirth.setForeground(new java.awt.Color(255, 255, 255));
        placeBirth.setText("Place of Birth*");
        getContentPane().add(placeBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        dateBirth.setBackground(new java.awt.Color(0, 0, 102));
        dateBirth.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dateBirth.setForeground(new java.awt.Color(255, 255, 255));
        dateBirth.setText("Date of Birth*");
        getContentPane().add(dateBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        contactField.setBackground(new java.awt.Color(255, 255, 255));
        contactField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        contactField.setForeground(new java.awt.Color(0, 18, 83));
        contactField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contactField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 260, 30));

        persoEmail.setBackground(new java.awt.Color(0, 0, 102));
        persoEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        persoEmail.setForeground(new java.awt.Color(255, 255, 255));
        persoEmail.setText("Email Address*");
        getContentPane().add(persoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        persoContact.setBackground(new java.awt.Color(0, 0, 102));
        persoContact.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        persoContact.setForeground(new java.awt.Color(255, 255, 255));
        persoContact.setText("Contact Number*");
        getContentPane().add(persoContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 130, -1));

        infoBG.setBackground(new java.awt.Color(0, 18, 83, 150));
        infoBG.setForeground(new java.awt.Color(0, 18, 83));
        infoBG.setOpaque(true);
        getContentPane().add(infoBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 980, 350));

        persoSchoolBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/school_background.png"))); // NOI18N
        persoSchoolBG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 83), 10));
        getContentPane().add(persoSchoolBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void relFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relFieldActionPerformed

    private void provFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provFieldActionPerformed

    private void extFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extFieldActionPerformed

    private void pobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pobFieldActionPerformed

    private void firstFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstFieldActionPerformed

    private void lastFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastFieldActionPerformed

    private void middleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleFieldActionPerformed

    private void brgyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brgyFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void homeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeFieldActionPerformed

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void prevGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevGradeActionPerformed

        GradeLevel grade = new GradeLevel();
        grade.show();

        dispose();
    }//GEN-LAST:event_prevGradeActionPerformed

    private void nextParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextParentActionPerformed
        ParentInformation parInfo = new ParentInformation();
        parInfo.show();

        dispose();
    }//GEN-LAST:event_nextParentActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField brgyField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactField;
    private javax.swing.JLabel dateBirth;
    private javax.swing.JTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel enrollInfoBG;
    private javax.swing.JTextField extField;
    private javax.swing.JLabel extName;
    private javax.swing.JTextField firstField;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JTextField homeField;
    private javax.swing.JLabel infoBG;
    private javax.swing.JLabel infoEnrollment;
    private javax.swing.JTextField lastField;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField middleField;
    private javax.swing.JLabel middleName;
    private javax.swing.JButton nextParent;
    private javax.swing.JLabel persoContact;
    private javax.swing.JLabel persoEmail;
    private javax.swing.JLabel persoInfo;
    private javax.swing.JPanel persoInfoBG;
    private javax.swing.JLabel persoSchoolBG;
    private javax.swing.JLabel persoTelNo;
    private javax.swing.JLabel placeBirth;
    private javax.swing.JLabel placeholderBrgy;
    private javax.swing.JLabel placeholderCity;
    private javax.swing.JLabel placeholderHome;
    private javax.swing.JLabel placeholderProvince;
    private javax.swing.JTextField pobField;
    private javax.swing.JButton prevGrade;
    private javax.swing.JTextField provField;
    private javax.swing.JTextField relField;
    private javax.swing.JLabel religion;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables
}
