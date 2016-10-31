
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  create scanner for input
        
        Scanner input = new Scanner(System.in);
        
        // scan in a word 
        String word = input.nextLine();
        word = word.toLowerCase();
        // makes some changes
        String letters = "Hello";
        
        String changeWord = word.replace("a", "@");
        int lPosition = changeWord.indexOf("l");
        
        // found an l at the end
        if(lPosition !=-1){
            // breaking the string apart
            // starts at the beggining and goes up to the l
            String beginning = changeWord.substring(0, lPosition);
            // start at the l, take everything after it
            String ending = changeWord.substring(lPosition);
            // reassemble
            changeWord = ending + beginning + "ay";
        }
        
        // check if word typed out is "hello"
        
        if(word.equals("hello"));{
            System.out.println("Hi There!");
        }
        // gets the length of the word
        int length = word.length();
        // walk through the characters using a loop
        int count = 0;
        for(int i = 0; 1 < length; i++){
            // look at the character
            // is the charactter an l
            if(word.charAt(i) == 'l'){
                // count it! 
                count = count + 1;
                
            }
        }
            
        
        System.out.println("The word is " + changeWord);
        System.out.println("The l is at postion " + lPosition);
        System.out.println("There are " + count + "Ls");

        
        
    }
}
