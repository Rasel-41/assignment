import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorldFile {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("C:/Users/DST/IdeaProjects/HelloWorldFile/hello.txt");

        try (PrintWriter out = new PrintWriter(outputFile)) {
            Scanner in = new Scanner(outputFile);
            String src = in.next();
            out.print(src);
        }

    }
}