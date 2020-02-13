import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {

    private String path;

    public ReadFile(String filePath) {
        path = filePath;
        //path = E:/Callum/Documents/test.txt
    }

    public String[] OpenFile() throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }

    //Method which reads how many lines are in a text file
    int readLines() throws IOException {

        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);

        String line;
        int numberOfLines = 0;

        //Will keep reading lines until there are none left
        while ((line = bf.readLine()) != null) {
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }

}
