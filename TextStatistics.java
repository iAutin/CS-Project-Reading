import java.io.File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextStatistics implements TextStatisticsInterface{
	
	private File currentFile;
	private static final String DELIMITERS = "[\\W\\d_]+";
	private int lineCounter = 0;
	private int tokenCounter = 0;
	private int lineWriter = 0;
	private int tokenWriter = 0;
	
	TextStatistics (File fileName) {
		currentFile = fileName;
		
		
		try {
			Scanner firstTextScan = new Scanner(fileName);
		
			while(firstTextScan.hasNextLine())
			{
				String textLine = firstTextScan.nextLine();
				//firstTextScan.useDelimiter(DELIMITERS);
				lineCounter++;
				
				while(firstTextScan.hasNext()) {
					String token = firstTextScan.next();
					tokenCounter++;
				}	
			}
			firstTextScan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		String[] lineArray = new String[lineCounter];
		String[] tokenArray = new String[tokenCounter];
		System.out.println("line Counter " + lineCounter);
		System.out.println("token Counter " + tokenCounter);
		
		try {
			Scanner secondTextScan = new Scanner(fileName);
		
			while(secondTextScan.hasNextLine())
				{	
					lineWriter++;
					//secondTextScan.useDelimiter(DELIMITERS);
					String textLine = secondTextScan.nextLine();
					//lineArray[lineWriter] = textLine;
					
		
				}
			
				while(secondTextScan.hasNext()) {
					tokenWriter++;
					String token = secondTextScan.next();
					tokenArray[tokenWriter] = token;
					
				}
			secondTextScan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		System.out.println("The length of the Line array is " + lineArray.length);
		
		for (int i = 0; i< lineArray.length;i++) {
			System.out.println(" i = " + i + " " + lineArray[i]);
		}
		
		System.out.println("The length of the Token array is " + tokenArray.length);
		
		for (int i = 0; i< tokenArray.length;i++) {
			System.out.println(" i = " + i + " " + tokenArray[i]);
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
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @return the number of words in the text file
	 */
	public int getWordCount() {
		// TODO Auto-generated method stub
		return 0;
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
