import javax.swing.*;
import java.awt.*;

public class HelpWindow extends JFrame {

    public HelpWindow() {
        setTitle("RULES & INFO");

        String rulesMessage = "Welcome to BoGamble!";

        String boRed = "#CD001A";
        String boYellow = "#FFDE21";

        Color boYellowColor = Color.decode(boYellow);
        Color boRedColor = Color.decode(boRed);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(boYellowColor);

        JLabel titleLabel = new JLabel("Rules & Info!");
        titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 42));
        titleLabel.setForeground(boRedColor);

        JLabel welcomeLabel = new JLabel(rulesMessage);
        welcomeLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setForeground(boRedColor);

        JLabel title = new JLabel("Rules and info placeholder message", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 20));
        title.setForeground(boRedColor);
        add(title, BorderLayout.CENTER);
        
        JButton menuButton = new JButton("Back to Main Menu");
        menuButton.addActionListener(e -> {
            dispose();
            new gui();
        });

        JPanel south = new JPanel();
        south.setBackground(boYellowColor);
        south.add(menuButton);
        add(south, BorderLayout.SOUTH);

        setVisible(true);
    }
}
