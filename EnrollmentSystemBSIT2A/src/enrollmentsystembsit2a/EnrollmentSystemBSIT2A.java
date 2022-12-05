package enrollmentsystembsit2a;
import javax.swing.*;

public class EnrollmentSystemBSIT2A {

    public static void main(String[] args) {
        
        //Frames
        JFrame container = new JFrame();
        
        //Labels
        JLabel label = new JLabel();
        
        //Images
        ImageIcon logo = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\circle_crop_background.png");
        ImageIcon logoApp = new ImageIcon("D:\\Programming\\git\\enrollment-system\\EnrollmentSystemBSIT2A\\src\\assets\\enrollment_system_transparent_logo_circle.png");
        
        //Icon Logo of the Application
        container.setIconImage(logo.getImage());
        
        //Title of the Application
        container.setTitle("St. Anne's Catholic School Enrollment System");
        
        //Function of the Application
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setSize(500, 500);
        container.setVisible(true);
        
        //Interface of the Applicaiton
        label.setIcon(logoApp);
        label.setText("St. Anne's Catholic School Enrollment System");
        
        //Changes Text Position
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        
        //Changes Alignments of Objects
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        container.add(label);
        
    }
    
}
