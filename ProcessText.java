import java.io.File;
import java.util.Scanner;

public class ProcessText {
	
	public static void main(String[] args) {
	Scanner fileScan = new Scanner(System.in);
	System.out.println("Please enter file name that you would like to get Statistics for. ");
	String fileString = fileScan.nextLine();
	System.out.println("You have entered file " + fileString + ".");
	File fileName = new File(fileString);
	
	if (fileName.exists() && fileName.isFile())
	{
		System.out.println(fileString + " has been detected as a valid file.");
	} else
	{
		System.out.println("Not a valid file: " + fileString);
	}
		
	TextStatistics ts = new TextStatistics(fileName);
	fileScan.close();

	long testLength = ts.getFileLength();
	System.out.println("length is " + testLength + " bytes");

	int wordCount = ts.getWordCount();
	System.out.println("Word count is " + wordCount);

	int charCount = ts.getCharCount();
	System.out.println("Char count is " + charCount);
	
	int lineCount = ts.getLineCount();
	System.out.println("This text file has  " + lineCount + " lines.");
	//ts.readFile();
	}

	
}
