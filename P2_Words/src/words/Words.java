package words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
 * Any redistribution or reproduction of part or all of the contents in any form is 
 * prohibited without the express consent of CyberTek.
 */

public class Words {
	
	ArrayList<String> wordList;	//All the words
	Iterator<String> iter;		// iterator for the wordlist
	int numberOfWords;	// number of words in the file
	
	String[] words;		// this array holds your words
	
	
	public Words(){
		wordList = new ArrayList<>();
		//iter = wordList.iterator();
	}
	/**
	 * This method loads the words from a given file
	 * @param fileName	input file name
	 */
	private void loadWords(String fileName){	
		wordList.clear();
		numberOfWords = 0;
		// This will reference one line at a time
        String line = null;
        int count = 0;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
            	wordList.add(line.toLowerCase());
                count++;
            }   

            // Always close files.
            bufferedReader.close(); 
            numberOfWords = count;
            iter = wordList.iterator();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'"); 
        }
	}
	
	public String getWord(int index){
		if(index < 0 || index >= numberOfWords){
			return null;
		}
		return words[index];
	}

	/**
	 * This method adds all the words to an array called words
	 * 
	 * variable numberOfWords is already declared and has value and contains number of words
	 * 
	 * @param fileName: input file name
	 */	
	public void addWordsToArray(String fileName){
		loadWords(fileName);	//DO NOT CHANGE
		
		//variable numberOfWords has the number of words 
		
		
		//TODO 
			// String[] words has been declared. Now instantiate the array to the words
			// array size is equal to the number of words
		
		words = new String[numberOfWords];//TO DO
		
		/**
		 * Calling iter.next() will return the next word in the file.
		 * For examples
		 * String w = iter.next();
		 * iter.next() always gives a next word 
		*/
		
		//TO DO
			//Add all word into the array  words
		for(int i=0; i<words.length; i++) {
			words[i]=wordList.get(i);
		}
		
		
	}
	
	/**
	 * 
	 * @param word: input
	 * @return true if the given word exits in the words array. False otherwise
	 */
	public boolean contains(String word){
		for(int i=0; i<=words.length-1; i++) {
		if(words[i].contains(word)) {
			return true;
			}
		}
			return false;
	}
	
	/*
	 * 
	 * @param sentence: input sentence
	 * @return true if every word in the sentence exists in your words array. 
	 * False otherwise.
	 */
	public boolean containsSentence(String sentence){
		String[]arr=sentence.split(" ");
		for(int i=0; i<words.length; i++) {
			
		}
		
		return false;
	}
	
	/**
	 * 	reverse a sentence
	 * 
	 * @param sentence: input sentence
	 * @return reversed sentence.
	 * For example: 
	 * 	input: "i love you"
	 *  return: "you love i" (hint: trim leading and trailing spaces")
	 */
	public String reverseSentence(String sentence){
		String arr[]=sentence.split(" ");
		String reverse="";
		for(int i=arr.length-1; i>=0; i--) {
			
			reverse+=arr[i];
		}
		
		return reverse;
	}
	
	
	/**
	 * 
	 * @param word: input word
	 * @return the number of occurrences of the word . If the word does not exist, return 0 
	 */
	public int count(String word){
		
		
		return 0;
	}
	
	

	/**
	 * 
	 * @param word1: input word
	 * @param word2: input word 
	 * @return true if all letters from word1 exist in word2, and all letters from word2 
	 * exist in word1. 
	 */
	public boolean anagram(String word1, String word2){
		
		return false;
	}
	
	
	
	
	/**
	 
	 * 
	 * @param word: input word
	 * @param fileName: input file name
	 * 
	 * PRINT all words that are the anagrams to the word input within words array
	 * 
	 */
	public void findAnagram(String word, String fileName){
		addWordsToArray(fileName);	//DO NOT CHANGE
		
		
		
	}
	
	
}
