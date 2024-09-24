import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("hello.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.write("Hello Worlds");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
