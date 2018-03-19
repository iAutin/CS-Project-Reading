import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TextStatistics implements TextStatisticsInterface{
	
	private File currentFile;
	private static final String DELIMITERS = "[\\W\\d_]+";
	private static final String DELIMITERS2 = "";
	private ArrayList<String> wordList = new ArrayList<String>();
	private ArrayList<String> charList = new ArrayList<String>();
	
	TextStatistics (File fileName) {
		currentFile = fileName;
		try {
			Scanner firstTextScan = new Scanner(fileName);
			while(firstTextScan.hasNextLine())
			{	
				System.out.println("This is a line prob");
				
				while(firstTextScan.hasNext()) {
					
					firstTextScan.useDelimiter(DELIMITERS);
					String token = firstTextScan.next();
					wordList.add(token);
				}	
			}
			firstTextScan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

		try {
			Scanner SecondTextScan = new Scanner(fileName);
			while(SecondTextScan.hasNextLine())
			{	
				System.out.println("This is a line prob");
				while(SecondTextScan.hasNext()) {
					SecondTextScan.useDelimiter(DELIMITERS2);
					String token = SecondTextScan.next();
					charList.add(token);
				}	
			}
			SecondTextScan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
	
	/**
	 * @return long that lists the files length.
	 * @author igorautin
	 */
	
	public long getFileLength() {
		long fileLength = currentFile.length();
		
		return fileLength;
	}
	/**
	 * @return the number of characters in the text file
	 */
	public int getCharCount() {
		int charCountResult = charList.size();
		return charCountResult;
	}
	/**
	 * @return the number of words in the text file
	 */
	public int getWordCount() {
		int wordCountResult = wordList.size();
		return wordCountResult;
	}

	public void readFile() {
		int i = 0;
		System.out.println("Reading File");
		while(wordList.size() > i){
			System.out.println(wordList.get(i));
			i++;
		};
	}
	/**
	 * @return the number of lines in the text file
	 */
	public int getLineCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @return the letterCount array with locations [0]..[25] for 'a' through 'z'
	 */
	public int[] getLetterCount() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the wordLengthCount array with locations [0]..[23] with location [i]
	 * storing the number of words of length i in the text file. Location [0] is not used.
	 * Location [23] holds the count of words of length 23 and higher.
	 */
	public int[] getWordLengthCount() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the average word length in the text file
	 */
	public double getAverageWordLength() {
		// TODO Auto-generated method stub
		return 0;
	}


}
