import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class gui extends JFrame {

    private static final Random RAND = new Random();

    public gui() {
        setTitle("BOGAMBLE");

        String boRed = "#CD001A";
        String boYellow = "#FFDE21";
        String welcomeMessage = "Welcome to BoGamble!";
        String clickMessage = "Click on the button to start playing!";

        Color boYellowColor = Color.decode(boYellow);
        Color boRedColor = Color.decode(boRed);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(boYellowColor);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBackground(boYellowColor);

        JLabel titleLabel = new JLabel("BoGamble");
        titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 42));
        titleLabel.setForeground(boRedColor);

        JLabel welcomeLabel = new JLabel(welcomeMessage);
        welcomeLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setForeground(boRedColor);

        JLabel clickLabel = new JLabel(clickMessage);
        clickLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        clickLabel.setFont(new Font("Serif", Font.BOLD, 20));
        clickLabel.setForeground(boRedColor);

        topPanel.add(titleLabel);
        topPanel.add(welcomeLabel);
        topPanel.add(clickLabel);

        add(topPanel, BorderLayout.NORTH);

        JLabel diceLabel = new JLabel("⚀", JLabel.CENTER);
        diceLabel.setFont(new Font("SansSerif", Font.BOLD, 120));
        diceLabel.setForeground(boRedColor);

        String[] faces = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
        Timer rollTimer = new Timer(100, e -> diceLabel.setText(faces[RAND.nextInt(faces.length)]));
        rollTimer.start();

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
        buttonsPanel.setBackground(boYellowColor);

        JButton topButton = new JButton("Lets Gamble!");
        topButton.setAlignmentX(JButton.CENTER_ALIGNMENT);

        JButton rulesButton = new JButton("Help");
        rulesButton.setAlignmentX(JButton.CENTER_ALIGNMENT);

        buttonsPanel.add(topButton);
        buttonsPanel.add(Box.createVerticalStrut(12));
        buttonsPanel.add(rulesButton);

        rulesButton.addActionListener(e -> {
            rollTimer.stop();      // IMPORTANT: stop timer before switching windows
            dispose();             // closes THIS window
            new HelpWindow();      // opens new window
        });

        JPanel mainCenter = new JPanel();
        mainCenter.setLayout(new BoxLayout(mainCenter, BoxLayout.Y_AXIS));
        mainCenter.setBackground(boYellowColor);

        mainCenter.add(Box.createVerticalGlue());
        mainCenter.add(diceLabel);
        mainCenter.add(Box.createVerticalStrut(30));
        mainCenter.add(buttonsPanel);
        mainCenter.add(Box.createVerticalGlue());

        diceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        diceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        diceLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE,
        diceLabel.getPreferredSize().height));
        diceLabel.setBorder(BorderFactory.createEmptyBorder(0, -15, 25, 0));


        add(mainCenter, BorderLayout.CENTER);

        setVisible(true);
    }
}
