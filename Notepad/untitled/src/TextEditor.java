import javax.swing.*;

public class TextEditor {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public TextEditor() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 560, 300);
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
