import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;


public class gui extends JFrame {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test");
            String boRed = "#CD001A";
            String boYellow = "#FFDE21";
            

            // window
            frame.setSize(500, 500); // width, height
            frame.setLocationRelativeTo(null); // center on screen
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            // label
            JLabel label = new JLabel("BoJangles");
            label.setHorizontalAlignment(JLabel.CENTER);
            frame.getContentPane().add(label, BorderLayout.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 42));

            
            // window color and label
            Color boYellowColor = Color.decode(boYellow);
            Color boRedColor = Color.decode(boRed);
            frame.getContentPane().setBackground(boYellowColor);
            label.setForeground(boRedColor);
            

            frame.setVisible(true);
        });
    }
    
    
}
