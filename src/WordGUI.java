import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class WordGUI implements ActionListener
{
    private JTextArea middleFrame;
    private JTextField wordEntryField;
    private JTextArea wordDef;
    private WordsNetworking client;
    private boolean isRunning;
    private int exampleChoice;
    private int definitionChoice;
    private String input;

    public WordGUI()
    {
        middleFrame = new JTextArea(10, 25);
        middleFrame.setEditable(false);
        middleFrame.setOpaque(false);
        wordEntryField = new JTextField();
        wordDef = new JTextArea();
        client = new WordsNetworking();
        isRunning = false;
        exampleChoice = 0;
        definitionChoice = 0;
        input = "";
        setupGUI();
    }

    private void setupGUI()
    {
        JFrame frame = new JFrame("Dictionary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ImageIcon image = new ImageIcon("");
//        Image imageData = new image.getImage();
//        Image scaledImage = imageData.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
//        image = new ImageIcon(scaledImage);
//        JLabel pictureLabel = new JLabel(image);
        JLabel welcomeLabel = new JLabel("   DICTIONARY");
        welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        welcomeLabel.setForeground(Color.blue);

        JPanel logoWelcomePanel = new JPanel();
//        logoWelcomePanel.add(pictureLabel);
        logoWelcomePanel.add(welcomeLabel);

        JPanel wordMainPanel = new JPanel();
        middleFrame.setText("               Welcome to Word Search!");
        middleFrame.setFont(new Font("Helvetica", Font.PLAIN, 24));
        middleFrame.setWrapStyleWord(true);
        middleFrame.setLineWrap(true);
        wordMainPanel.add(middleFrame);

        JPanel entryPanel = new JPanel();
        JLabel wordLabel = new JLabel("Enter a word: ");
        wordEntryField = new JTextField(10);
        JButton searchButton = new JButton("Search");
        JButton resetButton = new JButton("Reset");
        JButton nextDefinitionButton = new JButton("Next Definition");
        JButton nextExampleButton = new JButton("Next Example");
        entryPanel.add(wordLabel);
        entryPanel.add(wordEntryField);
        entryPanel.add(searchButton);
        entryPanel.add(resetButton);
        entryPanel.add(nextDefinitionButton);
        entryPanel.add(nextExampleButton);

        frame.add(logoWelcomePanel, BorderLayout.NORTH);
        frame.add(entryPanel, BorderLayout.SOUTH);
        frame.add(wordMainPanel, BorderLayout.CENTER);

        searchButton.addActionListener(this);
        resetButton.addActionListener(this);
        nextDefinitionButton.addActionListener(this);
        nextExampleButton.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }

    private void loadWordInfo()
    {
        Current w = client.getCurrent();
        String info = "Word: " + w.getWord() +
                "\nDefinition: " + w.getDefinition() +
                "\nExamples: " + w.getExample();
        middleFrame.setText(info);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) (e.getSource());
        String text = button.getText();
        if (text.equals("Search"))
        {
            if (!isRunning)
            {
                input = wordEntryField.getText();
                String json = client.makeApiCallForWord(input);
                client.parseInfo(json);
                isRunning = true;
                loadWordInfo();
            }
        }
        else if(text.equals("Next Definition"))
        {
            if(isRunning && client.getLengthOfResults() > 0)
            {
                int max = client.getLengthOfResults();
                if (definitionChoice >= max) {
                  definitionChoice = 0;
                }
                String json = client.makeApiCallForWord(input);
                client.parseInfo(json, definitionChoice);
                definitionChoice++;
            }
        }
        else if(text.equals("Next Example"))
        {
            if(isRunning && client.getLengthOfExamples() > 0)
            {
                int max = client.getLengthOfExamples();
                if (exampleChoice >= max) {
                    exampleChoice = 0;
                }
                client.parseExamples(exampleChoice);
                exampleChoice++;

            }
        }
        else if (text.equals("Reset"))
        {
            wordEntryField.setText("");
            middleFrame.setText("               Welcome to Word Search!");
            middleFrame.setFont(new Font("Helvetica", Font.PLAIN, 24));
            middleFrame.setWrapStyleWord(true);
            middleFrame.setLineWrap(true);
            isRunning = false;
        }
    }
}

