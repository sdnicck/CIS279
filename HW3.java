// Satya Dulam
//CIS279: Homework 3
//Sept 29, 2024
package stringPractice;

//importing files to help run program
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;  

//starting main program 
public class HW3 {
    public static void main(String[] args) throws Exception {
    	//creating a try block to prevent the program from crashing if files are uploaded correctly
    	try {
    		// importing files as new objects 
    		
    		//for deleting all blank lines I wasn't sure if that meant just the blank lines or all of the empty spaces so below I copied the paths for different formats
    		//for no blank lines(default in code): "C:\\Users\\sdotd\\Downloads\\index1(noemptylines).html"
    		//for no blank front spaces or blank lines : "C:\\Users\\sdotd\\Downloads\\index1(nofrontspace).html"
    		//for just a block of code: "C:\\Users\\sdotd\\Downloads\\index1(textblock).html"
	        File index1 =new File("C:\\Users\\sdotd\\Downloads\\index1(noemptylines).html");
	        // this was the only format where all of the code would print properly in the program
	        //but all three formats show up correctly in an html file 
	        
	        File index2 = new File("C:\\Users\\sdotd\\Downloads\\index2.html\\");
	    	//creating a new file editor for index2 
	        FileWriter index2Writer = new FileWriter("C:\\Users\\sdotd\\Downloads\\index2.html\\");

	        //creating new scanner objects for each file 
	        Scanner scan =new Scanner(index1);
	    	Scanner scan2 = new Scanner(index2);

	    	//creating new string objects for each file 
	    	String str = new String();
	        String str2 = new String();
	        
	        //scanning the first file (index1) line by line and setting it as a string
	        // .hasNextLine() will show if there another line in the file to read
	        System.out.println("Index1 (old file)");
	        while(scan.hasNextLine()) {
	        	// while there is characters in the file it will converted into a string 
	        	str= scan.nextLine();
	        	System.out.println(str);
	        	
	        	// that string will then be written into index 2 replacing all of the lower case 'html' with uppercase
	        	index2Writer.write(str.replace("html","HTML")+"\n");
	        }
	        
	      // after the loop for scanning index1 is done, it will begin scanning index2 the same way it did for index1
	        System.out.println("\n\n\nIndex2 (new file)");
	        while (scan2.hasNextLine()){
	        	str2 = scan2.nextLine();
	        	System.out.println(str2);
	        	}
	        // the file writer, and the scanners for both files are closed 
	        index2Writer.close();
	        scan.close();  
	        scan2.close();
	        
	        // a catch statement is used if the files are not able to be read 
    		} catch (IOException e) {
    			System.out.println("An error has occurred");
    			e.printStackTrace();
    		}
        }
}

