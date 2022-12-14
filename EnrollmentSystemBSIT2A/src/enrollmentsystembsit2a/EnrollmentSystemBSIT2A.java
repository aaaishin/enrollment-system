package enrollmentsystembsit2a;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class EnrollmentSystemBSIT2A {

    public static void main(String[] args) {
        
        //Images
        ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
        ImageIcon startBackground = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\heaven.jpg");
        Icon logoApp = new ImageIcon("src/assets/enrollment_system_transparent_logo_circle.png");
        
        Image img = startBackground.getImage();
        Image temp = img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
        startBackground = new ImageIcon(temp);
        
        //Borders
        Border border = BorderFactory.createLineBorder(new Color(0x413861), 10);
        
        //Frames (Layout of the Application)
        JFrame layout = new JFrame("St. Anne's Catholic School Enrollment System");
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setSize(500, 500);
        
        //Logo & Title
        layout.setIconImage(logo.getImage());
        
        //Labels
        JLabel label = new JLabel();
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        
        JLabel back=new JLabel(startBackground);
        back.setLayout(null);
        back.setBounds(0,0,500,600);
        
        label.setIcon(logoApp);
        label.setText("St. Anne's Catholic School Enrollment System");
        
        //Panels (Container for the GUI)
        JPanel startPanel = new JPanel();
        startPanel.add(label);
        startPanel.setBorder(border);
        startPanel.setBackground(new Color(200, 200, 200));
        
        
        //Displaying GUI to Application
        layout.setVisible(true);
        layout.add(startPanel);
        
        
    }
    
}
