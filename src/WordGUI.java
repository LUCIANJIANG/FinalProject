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

    public WordGUI()
    {
        middleFrame = new JTextArea(20, 35);
        wordEntryField = new JTextField();
        wordDef = new JTextArea();

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
        middleFrame.setText("Welcome to Word Search!");
        middleFrame.setFont(new Font("Helvetica", Font.PLAIN, 24));
        middleFrame.setWrapStyleWord(true);
        middleFrame.setLineWrap(true);
        wordMainPanel.add(middleFrame);

        JPanel entryPanel = new JPanel();
        JLabel wordLabel = new JLabel("Enter a word: ");
        wordEntryField = new JTextField(10);
        JButton searchButton = new JButton("Search");
        JButton resetButton = new JButton("Reset");
        JButton nextButton = new JButton("Next");
        entryPanel.add(wordLabel);
        entryPanel.add(wordEntryField);
        entryPanel.add(searchButton);
        entryPanel.add(resetButton);
        entryPanel.add(nextButton);

        frame.add(logoWelcomePanel, BorderLayout.NORTH);
        frame.add(entryPanel, BorderLayout.SOUTH);

        searchButton.addActionListener(this);
        resetButton.addActionListener(this);
        nextButton.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }

    private void loadWordInfo(Current word)
    {
        Current w = client.
        String info = "Word: " + word.getWord(); +
                "\nDefinition: " + word.getDefinition() +
                "\nExamples: " + word.getExample();
        middleFrame.setText(info);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) (e.getSource());
        String text = button.getText();
        if (text.equals("Search"))
        {

        }
        else if(text.equals("Next"))
        {

        }
        else if (text.equals("Reset"))
        {
            wordEntryField.setText("");

        }
    }
}

