import java.io.IOException;

public class FileData {

    public static void main(String[] args) throws IOException {

        String fileName = "E:/Callum/Documents/test.txt";

        try {
            ReadFile file = new ReadFile(fileName);
            String[] arrayLines = file.OpenFile();

            for (int i = 0; i < arrayLines.length; i++) {
                System.out.println(arrayLines[i]);
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        //Write to a file
        WriteFile data = new WriteFile(fileName, true);
        data.writeToFile("This is another line of text");
        System.out.println("Text written to");

    }

}
