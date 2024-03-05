import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordPuzzle {

    public static void main(String[] args) {
        try {
            // Read puzzle and word list from files
            char[][] puzzle = readPuzzle("puzzleinput.txt");
            List<String> wordList = readWordList("wordlist.txt");

            // Find words in the puzzle
            List<String> foundWords = findWords(puzzle, wordList);

            // Print the found words
            System.out.println("Found words:");
            for (String word : foundWords) {
                System.out.println(word);
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    private static char[][] readPuzzle(String filename) throws IOException {
        List<char[]> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.toCharArray());
            }
        }

        char[][] puzzle = new char[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            puzzle[i] = lines.get(i);
        }

        return puzzle;
    }

    private static List<String> readWordList(String filename) throws IOException {
        List<String> wordList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
        }

        return wordList;
    }

    private static List<String> findWords(char[][] puzzle, List<String> wordList) {
        List<String> foundWords = new ArrayList<>();

        for (String word : wordList) {
            if (searchWord(puzzle, word)) {
                foundWords.add(word);
            }
        }

        return foundWords;
    }

    private static boolean searchWord(char[][] puzzle, String word) {
        // Add code to search for the word in the puzzle (horizontal, vertical, diagonal)
        // Return true if the word is found, false otherwise
        return false;
    }
}
