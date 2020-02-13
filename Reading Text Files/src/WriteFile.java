import java.io.FileWriter; //FileWriter allows you to specify overwriting everything or starting at the end of the text
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {

    private String path;
    private boolean startAtEnd = false;

    //Overwrite constructor
    public WriteFile(String filePath) {
        path = filePath;
    }

    //Starting at end of text constructor
    public WriteFile(String filePath, boolean appendValue) {
        path = filePath;
        startAtEnd = appendValue;

    }

    public void writeToFile(String textLine) throws IOException {
        //If a file of the name you pass over does not exist, the FileWriter creates one for you.
        FileWriter write = new FileWriter(path, startAtEnd);
        PrintWriter printLine = new PrintWriter(write);

        printLine.printf("%s" + "%n", textLine);

        printLine.close();

    }
}
