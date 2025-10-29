import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Button;

// add button to start bogamble sort
// add timer to count how much time it takes to sort using bogamble sort
// add entry button to gamble how much time it would take (you win if you get close within the seconds???)
// add different length sizes to sort

public class gui {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoGamble Sort!");
        frame.setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    

    
        
        JLabel label = new JLabel("Hello placeholder");
        frame.getContentPane().add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    
}
