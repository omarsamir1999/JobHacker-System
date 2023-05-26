import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordDictionaryTask {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, ArrayList<String>> wordMap = new HashMap<>();

        System.out.print("Enter number of words: ");
        int numberOfWords = input.nextInt();
        input.nextLine();

        // call method addWordsToDictionary
        addWordsToDictionary(numberOfWords,wordMap);

        // call method printAll
        printAll(wordMap);

        System.out.print("Enter a letter to print  words: ");
        char letter = input.nextLine().toLowerCase().charAt(0);

        // call method printWordsOfLetter
        printWordsOfLetter(letter,wordMap);

    }

    // add words to dictionary
    public static void addWordsToDictionary(int numberOfWords,HashMap<Character,ArrayList<String>> wordMap){
        for (int i = 1; i <= numberOfWords; i++) {
            System.out.print("Enter word " + i + ": ");
            String word = input.nextLine();
            char firstLetter = Character.toLowerCase(word.charAt(0));
            if (Character.isLetter(firstLetter)) {
                if (!wordMap.containsKey(firstLetter)) {
                    wordMap.put(firstLetter, new ArrayList<>());
                }
                wordMap.get(firstLetter).add(word);

            }
        }
    }
    // Print all the letters and corresponding words
    public static void printAll(HashMap<Character,ArrayList<String>> wordMap){
        for (char firstLetter : wordMap.keySet()) {
            System.out.println(firstLetter + ": " + wordMap.get(firstLetter));
        }
    }
    // Print the words of a given letter
    public static void printWordsOfLetter(Character letter,HashMap<Character,ArrayList<String>> wordMap){

        if (wordMap.containsKey(letter)) {
            System.out.println(wordMap.get(letter));
        } else {
            System.out.println("No words found for the letter " + letter);
        }

    }
}

