import javax.swing.*;

public class Main extends JFrame {
    private JTextArea textArea;
    private MenuBar menuBar;
    private FileOperations fileOperations;

    public Main() {
        // Set up the frame
        setTitle("Simple Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 560, 300);
        add(scrollPane);

        // Initialize file operations
        fileOperations = new FileOperations(this, textArea);

        // Initialize menu bar
        menuBar = new MenuBar(fileOperations);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
