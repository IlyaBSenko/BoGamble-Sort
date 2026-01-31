import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;


public class gui extends JFrame {


    /**
     * TODO:
     * 
     * add custom BoGamble font art to match font more closely
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test");
            String boRed = "#CD001A";
            String boYellow = "#FFDE21";


            // window
            frame.setSize(500, 500); // width, height
            frame.setLocationRelativeTo(null); // center on screen
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            // title label
            JLabel label = new JLabel("BoGamble");
            label.setHorizontalAlignment(JLabel.CENTER);
            frame.getContentPane().add(label, BorderLayout.NORTH);
            // bojangles font replication
            label.setFont(label.getFont().deriveFont(Font.BOLD, 42f));
            label.setFont(new Font("Serif", Font.BOLD, 42));
            // padding for label to not touch the top too tightly
            label.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 20, 0)); 

            
            // window color and label
            Color boYellowColor = Color.decode(boYellow);
            Color boRedColor = Color.decode(boRed);
            frame.getContentPane().setBackground(boYellowColor);
            label.setForeground(boRedColor);
            

            frame.setVisible(true);
        });
    }
    
    
}
