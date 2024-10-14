import javax.swing.*;

public class AboutDialog extends JDialog {
    public AboutDialog(JFrame parent) {
        super(parent, "About Simple Notepad", true);
        setSize(300, 200);
        setLocationRelativeTo(parent);
        setLayout(null);

        JLabel label = new JLabel("<html><h2>Simple Notepad</h2><p>A simple text editor built with Java Swing.</p><p>Version 1.0</p></html>");
        label.setBounds(20, 20, 260, 100);
        add(label);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(100, 130, 100, 30);
        closeButton.addActionListener(e -> dispose());
        add(closeButton);
    }
}
