package Task3;

import java.io.*;
import java.net.URL;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String urlName = "http://liveexample.pearsoncmg.com/data/Scores.txt";
        File file = new File("src/Task3/Score.txt");
        readFromWebToFile(urlName, file);

        // write Sum And Average in File
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Sum = " + getSum(file) + "\n" + "Average = " + getAverage(file));
        bufferedWriter.close();
    }

    static public void readFromWebToFile(String urlName, File file) throws IOException {
        URL url = new URL(urlName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line + "\n");
            bufferedWriter.close();

        }

    }
    static public int getSum(File file) throws IOException {
        int sum = 0;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] numbers = line.split("\s+");
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
    static public int getAverage(File file) throws IOException {
        int average ;
        int sum = getSum(file);
        int count = 0;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] numbers = line.split("\s+");
            count += numbers.length;
        }
        average = sum / count;

        return average;
    }


}
