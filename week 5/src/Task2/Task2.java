package Task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        int wordCount = 0;
        String fileName="src/Lincoln.txt";
        FileReader fileReader=new FileReader(fileName);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\s+");
            wordCount += words.length;
        }
        bufferedReader.close();
        fileReader.close();



        File file = new File(fileName);
        FileWriter fileWriter =new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
        bufferedWriter.write("\n" + wordCount);
        bufferedWriter.close();
    }
}
