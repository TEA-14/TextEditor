import javax.swing.*;
import java.io.*;

public class FileOperations {
    private JFrame frame;
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public FileOperations(JFrame frame, JTextArea textArea) {
        this.frame = frame;
        this.textArea = textArea;
        fileChooser = new JFileChooser();
    }

    public void openFile() {
        int option = fileChooser.showOpenDialog(frame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                textArea.read(reader, null);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void saveFile() {
        int option = fileChooser.showSaveDialog(frame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                textArea.write(writer);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void cutText() {
        textArea.cut();
    }

    public void copyText() {
        textArea.copy();
    }

    public void pasteText() {
        textArea.paste();
    }
}
