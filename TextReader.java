/* Read text from a file and count the number of words and letters
 * 
 */

import java.util.Scanner;
import java.io.*;
public class TextReader{
    public static void main(String[] args){
        TextReader tr1 = new TextReader();
        tr1.run();
    }
    
    public void run(){
        Scanner reader = null;
        try{
            reader = new Scanner(new FileReader("week1.txt"));
            int counter=0;
            while (reader.hasNext()){
                String line = reader.nextLine();
                int words = countWords(line);
                int letters = countLetters(line);
                String lastWord = last(line);
                counter++;
                System.out.println("There are " + words + " words and " + letters + " letters with last word: " + lastWord + " on line " + counter);
            }
        }
        catch(Exception e){
            System.out.println("Exception occurred " + e);
        }
    }
    
    public int countWords(String line){
        String[] words = line.split(" ");
        return words.length;
    }
    
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
    
    public String last(String line){
        String[] words = line.split(" ");
        return words[words.length-1];
    }
}