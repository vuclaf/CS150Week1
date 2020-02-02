import java.util.Scanner;
import java.io.*;

/**
 * Read text from a file and count the number of words and letters
 * 
 * @author: Evan Vu
 * @version: Feb 1
 */
public class TextReader{
    public static void main(String[] args){
        TextReader tr1 = new TextReader();
        tr1.run();
    }
    
    public void run(){
        Scanner reader = null;
        PrintWriter writer = null;
        try{
            //Creating a file writer to write ouputs on to a file
            writer = new PrintWriter(new File("output.txt"));
            reader = new Scanner(new FileReader("input.txt"));
            int counter=0;
            while (reader.hasNext()){
                String line = reader.nextLine();
                int words = countWords(line);
                int letters = countLetters(line);
                String lastWord = last(line);
                counter++;
                writer.println("There are " + words + " words and " + letters + " letters with last word: " + lastWord + " on line " + counter);
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println("Exception occurred " + e);
        }
    }
    
    /** 
     * A method to get the number of words in a line
     * 
     * @param Words in a line as a string
     * @return The number of words in that line
     */
    public int countWords(String line){
        String[] words = line.split(" ");
        return words.length;
    }
    
    /**
     * A method to get the number of letters in a line
     * 
     * @param Words in a line as a string
     * @return The number of words in that line
     */
    public int countLetters(String line){
        char[] letters = line.toCharArray();
        int spaceCounter = 0;
        for (int i=0;i<letters.length;i++){
            if (letters[i]==' '){
                spaceCounter++;
        }
    }
    return letters.length - spaceCounter;
    }
    
    /**
     * A method to get the last word in a line
     * 
     * @param Words in a line as a string
     * @return The last word in the line as a string
     */
    public String last(String line){
        String[] words = line.split(" ");
        return words[words.length-1];
    }
}