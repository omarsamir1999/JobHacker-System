public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26];
        for (char c : sentence.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
