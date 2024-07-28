import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        // Create JFrame for user input
        JFrame inputFrame = new JFrame("Text Decorator");
        inputFrame.setLayout(new BoxLayout(inputFrame.getContentPane(), BoxLayout.Y_AXIS));

        // Create and add components for user input
        JLabel lblText = new JLabel("Enter text:");
        JTextField txtText = new JTextField();
        
        JLabel lblBold = new JLabel("Bold (yes/no):");
        JTextField txtBold = new JTextField();
        
        JLabel lblItalic = new JLabel("Italic (yes/no):");
        JTextField txtItalic = new JTextField();
        
        JLabel lblUnderline = new JLabel("Underline (yes/no):");
        JTextField txtUnderline = new JTextField();
        
        JButton btnSubmit = new JButton("Submit");

        inputFrame.add(lblText);
        inputFrame.add(txtText);
        inputFrame.add(lblBold);
        inputFrame.add(txtBold);
        inputFrame.add(lblItalic);
        inputFrame.add(txtItalic);
        inputFrame.add(lblUnderline);
        inputFrame.add(txtUnderline);
        inputFrame.add(btnSubmit);

        inputFrame.setSize(300, 300);
        inputFrame.setVisible(true);
        inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Action listener for the Submit button
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve inputs
                String content = txtText.getText();
                boolean isBold = "yes".equalsIgnoreCase(txtBold.getText());
                boolean isItalic = "yes".equalsIgnoreCase(txtItalic.getText());
                boolean isUnderline = "yes".equalsIgnoreCase(txtUnderline.getText());

                // Create text and apply decorators based on user input
                Text text = new ConcreteText(content);

                if (isBold) {
                    text = new BoldText(text);
                }
                if (isItalic) {
                    text = new ItalicText(text);
                }
                if (isUnderline) {
                    text = new UnderlineText(text);
                }

                // Close input frame
                inputFrame.dispose();

                // Create JFrame for displaying result
                JFrame resultFrame = new JFrame("Decorated Text");
                resultFrame.setLayout(new BorderLayout());

                JLabel lblResult = new JLabel("<html>" + text.getContent() + "</html>");
                resultFrame.add(lblResult, BorderLayout.CENTER);
                resultFrame.setSize(400, 200);
                resultFrame.setVisible(true);
                resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
