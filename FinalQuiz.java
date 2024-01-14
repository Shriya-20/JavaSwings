package javaSwings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class FinalQuiz extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createAccountButton;
    private HashMap<String, String> userAccounts;

    public FinalQuiz() {
        Color c = new Color(50, 50, 90);// defining frequently used colors
        Color c1 = new Color(25, 250, 25);
        // Initialize user accounts HashMap to store username-password pairs
        userAccounts = new HashMap<>();
        // Dummy user account
        userAccounts.put("user", "password");

        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(c);
        setSize(500, 300);
        setLocationRelativeTo(null); // Center the window
        setLayout(null);// Absolute positioning

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 100, 25);
        usernameLabel.setForeground(c1); // Set label text color
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 25);
        usernameField.setBackground(Color.LIGHT_GRAY); // Set text field background color
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 25);
        passwordLabel.setForeground(c1); // et label text color
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 25);
        passwordField.setBackground(Color.LIGHT_GRAY); // Set text field background color
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 80, 30);
        loginButton.setBackground(Color.GREEN); // Set button background color
        loginButton.setForeground(c); // Set button text color
        add(loginButton);

        createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(240, 150, 150, 30);
        createAccountButton.setBackground(c1); // Set button background color
        createAccountButton.setForeground(c); // Set button text color
        add(createAccountButton);
        

        // Action listeners for the Login and Create Account buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Check if username and password match in the userAccounts HashMap
                if (userAccounts.containsKey(username) && userAccounts.get(username).equals(password)) {
                    openMCQPage(); // Open MCQ page on successful login
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter both username and password");
                } else if (userAccounts.containsKey(username)) {
                    JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.");
                } else {
                    // Add new user account to the userAccounts HashMap
                    userAccounts.put(username, password);
                    JOptionPane.showMessageDialog(null, "Account created successfully");
                }
            }
        });

        setVisible(true);
    }


    public void openMCQPage() {
        // Questions
        String[] questions = {
                "Which player has hit the most number of sixes?",
                "Which stadium witnessed AFG VS AUS featuring Maxwell's OUTRAGEOUS 201* (128) & 1/55 ?",
                "Which player is the top wicket taker as of today?",
                "Most runs were scored in total by teams in which match?",
                "Which bowler has the Best Bowling Figures in this World Cup?"
        };

        // Creating new frame for MCQ page
        JFrame mcqFrame = new JFrame("MCQs");
        mcqFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mcqFrame.setSize(900, 900);
        mcqFrame.getContentPane().setBackground(new Color(0, 50, 50));
        mcqFrame.setLocationRelativeTo(null); // Center the window

        // Add MCQs (dummy MCQs for demonstration)
        JPanel mcqPanel = new JPanel();
        mcqPanel.setLayout(new BoxLayout(mcqPanel, BoxLayout.Y_AXIS));
        mcqPanel.setBackground(new Color(0, 50, 50));
        mcqPanel.setLayout(null); // Set layout to null for absolute positioning
        //Font font = new Font("Arial", Font.BOLD, 14);
        Font font2 = new Font("MV Boli", Font.BOLD, 20);
        Color c = new Color(50, 50, 90);

        // Heading
        JTextField textField = new JTextField();
        textField.setBounds(50, 10, 800, 50);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 25));
        textField.setFont(new Font("MV Boli", Font.BOLD, 30));
        textField.setText("ICC Cricket World Cup 2023 QUIZ");
        textField.setHorizontalAlignment(JTextField.CENTER);
        mcqFrame.add(textField);

        // Question 1
        JLabel question1 = new JLabel();
        question1.setText("1. " + questions[0]);
        question1.setBounds(15, 58, 900, 60);
        question1.setForeground(new Color(40, 250, 15));
        question1.setFont(new Font("MV Boli", Font.BOLD, 15));
        mcqPanel.add(question1);

        ButtonGroup group1 = new ButtonGroup();
        JRadioButton option1 = new JRadioButton("Rohit Sharma");
        JRadioButton option2 = new JRadioButton("Glen Maxwell");
        JRadioButton option3 = new JRadioButton("Q de Kock");
        option1.setFont(new Font("MV Boli", Font.BOLD, 14));
        option1.setForeground(new Color(255, 255, 255)); // Set text color
        option1.setBackground(c);
        option2.setFont(new Font("MV Boli", Font.BOLD, 14));
        option2.setForeground(new Color(255, 255, 255)); // Set text color
        option2.setBackground(c);
        option3.setFont(new Font("MV Boli", Font.BOLD, 14));
        option3.setForeground(new Color(255, 255, 255)); // Set text color
        option3.setBackground(c);
        option1.setBounds(25, 100, 250, 25);
        option2.setBounds(25, 130, 250, 25);
        option3.setBounds(25, 160, 250, 25);

        group1.add(option1);
        group1.add(option2);
        group1.add(option3);
        mcqPanel.add(option1);
        mcqPanel.add(option2);
        mcqPanel.add(option3);

        // Question 2
        JLabel question2 = new JLabel();
        question2.setText("2. " + questions[1]);
        question2.setBounds(15, 200, 900, 60);
        question2.setForeground(new Color(40, 250, 15));
        question2.setFont(new Font("MV Boli", Font.BOLD, 15));
        mcqPanel.add(question2);

        ButtonGroup group2 = new ButtonGroup();
        JRadioButton option4 = new JRadioButton("Ahmedabad");
        JRadioButton option5 = new JRadioButton("Eden Gardens");
        JRadioButton option6 = new JRadioButton("Wankhede");
        option4.setFont(new Font("MV Boli", Font.BOLD, 14));
        option4.setForeground(new Color(255, 255, 255)); // Set text color
        option4.setBackground(c);
        option5.setFont(new Font("MV Boli", Font.BOLD, 14));
        option5.setForeground(new Color(255, 255, 255)); // Set text color
        option5.setBackground(c);
        option6.setFont(new Font("MV Boli", Font.BOLD, 14));
        option6.setForeground(new Color(255, 255, 255)); // Set text color
        option6.setBackground(c);
        option4.setBounds(25, 250, 250, 25);
        option5.setBounds(25, 280, 250, 25);
        option6.setBounds(25, 310, 250, 25);
        group2.add(option4);
        group2.add(option5);
        group2.add(option6);
        mcqPanel.add(option4);
        mcqPanel.add(option5);
        mcqPanel.add(option6);

        // Question 3
        JLabel question3 = new JLabel();
        question3.setText("3. " + questions[2]);
        question3.setBounds(15, 330, 900, 60);
        question3.setForeground(new Color(40, 250, 15));
        question3.setFont(new Font("MV Boli", Font.BOLD, 15));
        mcqPanel.add(question3);

        ButtonGroup group3 = new ButtonGroup();
        JRadioButton option7 = new JRadioButton("Dilshan Madushanka");
        JRadioButton option8 = new JRadioButton("Adam Zampa");
        JRadioButton option9 = new JRadioButton("Gerald Coetzee");
        option7.setFont(new Font("MV Boli", Font.BOLD, 14));
        option7.setForeground(new Color(255, 255, 255)); // Set text color
        option7.setBackground(c);
        option8.setFont(new Font("MV Boli", Font.BOLD, 14));
        option8.setForeground(new Color(255, 255, 255)); // Set text color
        option8.setBackground(c);
        option9.setFont(new Font("MV Boli", Font.BOLD, 14));
        option9.setForeground(new Color(255, 255, 255)); // Set text color
        option9.setBackground(c);
        option7.setBounds(25, 380, 250, 25);
        option8.setBounds(25, 410, 250, 25);
        option9.setBounds(25, 440, 250, 25);
        group3.add(option7);
        group3.add(option8);
        group3.add(option9);
        mcqPanel.add(option7);
        mcqPanel.add(option8);
        mcqPanel.add(option9);

        // Question 1
        JLabel question4 = new JLabel();
        question4.setText("4. " + questions[3]);
        question4.setBounds(15, 470, 900, 60);
        question4.setForeground(new Color(40, 250, 15));
        question4.setFont(new Font("MV Boli", Font.BOLD, 15));
        mcqPanel.add(question4);
        ButtonGroup group4 = new ButtonGroup();
        JRadioButton opt7 = new JRadioButton("IND VS NED");
        JRadioButton opt8 = new JRadioButton("AUS VS NZ");
        JRadioButton opt9 = new JRadioButton("NZ VS PAK");
        opt7.setFont(new Font("MV Boli", Font.BOLD, 14));
        opt7.setForeground(new Color(255, 255, 255)); // Set text color
        opt7.setBackground(c);
        opt8.setFont(new Font("MV Boli", Font.BOLD, 14));
        opt8.setForeground(new Color(255, 255, 255)); // Set text color
        opt8.setBackground(c);
        opt9.setFont(new Font("MV Boli", Font.BOLD, 14));
        opt9.setForeground(new Color(255, 255, 255)); // Set text color
        opt9.setBackground(c);
        opt7.setBounds(25, 520, 250, 25);
        opt8.setBounds(25, 550, 250, 25);
        opt9.setBounds(25, 580, 250, 25);
        group4.add(opt7);
        group4.add(opt8);
        group4.add(opt9);
        mcqPanel.add(opt7);
        mcqPanel.add(opt8);
        mcqPanel.add(opt9);

        // Question 5
        JLabel question5 = new JLabel();
        question5.setText("5. " + questions[4]);
        question5.setBounds(15, 610, 900, 60);
        question5.setForeground(new Color(40, 250, 15));
        question5.setFont(new Font("MV Boli", Font.BOLD, 15));
        mcqPanel.add(question5);
        ButtonGroup group5 = new ButtonGroup();
        JRadioButton op7 = new JRadioButton("Marco Jansen");
        JRadioButton op8 = new JRadioButton("Adam Zampa");
        JRadioButton op9 = new JRadioButton("Mohammad Shami");
        op7.setFont(new Font("MV Boli", Font.BOLD, 14));
        op7.setForeground(new Color(255, 255, 255)); // Set text color
        op7.setBackground(c);
        op8.setFont(new Font("MV Boli", Font.BOLD, 14));
        op8.setForeground(new Color(255, 255, 255)); // Set text color
        op8.setBackground(c);
        op9.setFont(new Font("MV Boli", Font.BOLD, 14));
        op9.setForeground(new Color(255, 255, 255)); // Set text color
        op9.setBackground(c);
        op7.setBounds(25, 660, 250, 25);
        op8.setBounds(25, 690, 250, 25);
        op9.setBounds(25, 720, 250, 25);
        group5.add(op7);
        group5.add(op8);
        group5.add(op9);
        mcqPanel.add(op7);
        mcqPanel.add(op8);
        mcqPanel.add(op9);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 770, 250, 42);
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(new Color(25, 250, 25));
        submitButton.setFont(new Font("MV Boli", Font.BOLD, 30));
        mcqPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(270, 230);
                f.getContentPane().setBackground(c);
                f.setLocationRelativeTo(null); // Center the window
                f.setLayout(new FlowLayout());
                // Calculating number of correct answers
                int correctAnswers = 0;
                // Compare the selected options with the correct answers to calculate the score
                if (option1.isSelected()) {
                    correctAnswers++;
                }
                if (option6.isSelected()) {
                    correctAnswers++;
                }
                if (option8.isSelected()) {
                    correctAnswers++;
                }
                if (opt8.isSelected()) {
                    correctAnswers++;
                }
                if (op9.isSelected()) {
                    correctAnswers++;
                }
                // Display name
                double perc = ((double) correctAnswers * 100) / 5;
                String username = usernameField.getText();
                JLabel field1 = new JLabel("⭐ Name: " + username+", ⭐");
                field1.setFont(font2);
                field1.setHorizontalAlignment(JTextField.CENTER);
                field1.setBackground(c);
                field1.setForeground(Color.GREEN);
                f.add(field1);

                // Display score
                JTextField field = new JTextField("Your Score is: " + correctAnswers + " / 5");
                field.setFont(font2);
                field.setHorizontalAlignment(JTextField.CENTER);
                field.setBackground(c);
                field.setForeground(Color.WHITE);
                f.add(field);
                f.setVisible(true);

                // Display Percentage
                JLabel fiel = new JLabel("Percentage: " + perc + " %");
                fiel.setFont(font2);
                fiel.setHorizontalAlignment(JLabel.CENTER);
                fiel.setBackground(c);
                fiel.setForeground(Color.GREEN);
                f.add(fiel);

                JButton EButton = new JButton("EXIT");
                EButton.setBackground(Color.GREEN); // Set button background color
                EButton.setForeground(c); // Set button text color
                EButton.setFont(font2);
                f.add(EButton);
                EButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);//EXIT completely
                        //openMCQPage();
                    }
                });
                f.setVisible(true);
            }
        });

        // Add MCQ panel to the frame
        mcqFrame.add(mcqPanel);
        mcqFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new FinalQuiz();
    }
}
