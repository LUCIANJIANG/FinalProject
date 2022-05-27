/*import javax.imageio.ImageIO;
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
    private JTextField wordEntryField;
    private JTextArea wordDef;

    public WordGUI()
    {
        wordEntryField = new JTextField();
        wordDef = new JTextArea();
    }

    private void setupGUI()
    {
        JFrame frame = new JFrame("Dictionary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("");
        Image imageData = new image.getImage();
        Image scaledImage = imageData.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
        JLabel pictureLabel = new JLabel(image);
        JLabel welcomeLabel = new JLabel("   DICTIONARY");
        welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        welcomeLabel.setForeground(Color.blue);

        JPanel logoWelcomePanel = new JPanel(); // the panel is not visible in output
        logoWelcomePanel.add(pictureLabel);
        logoWelcomePanel.add(welcomeLabel);


        JPanel entryPanel = new JPanel();
        JLabel wordLabel = new JLabel("Enter a word: ");
        wordEntryField = new JTextField(10);
        JButton searchButton = new JButton("Search");
        JButton resetButton = new JButton("Reset");
        entryPanel.add(wordLabel);
        entryPanel.add(wordEntryField);
        entryPanel.add(searchButton);
        entryPanel.add(resetButton);

    }
}
 */
