import javax.swing.*; // yeah im using .* cry about it
import java.awt.*;

// add button to start bogamble sort
// add timer to count how much time it takes to sort using bogamble sort
// add entry button to gamble how much time it would take (you win if you get close within the seconds???)
// add different length sizes to sort
//from brady

public class GUI extends JFrame {

    private JButton button;
    private JLabel label;
    
    public GUI() {
        setTitle("BoGamble Sort");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.ORANGE); // change later maybe
        setLayout(null);                              // change later maybe

        button = new JButton("Sort");
        button.setBounds(100, 100, 100, 100);
        add(button);

        Font titleFont = new Font("Serif", Font.BOLD, 24);
        label = new JLabel("Welcome to BoGamble Sort!");
        label.setBounds(50, 50, 1000, 17);
        label.setFont(titleFont);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
    
}
