package hack;
//This class reads a file wordlist.txt and stores them in arraylist. it also gets
//jumbled words as input and stores them in a different arraylist. both the arraylists 
//are passed on to arrayMatch() function in WordMatcher class.


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WordHack {

   public static void main(String args[])
	  {
		 ArrayList<String> wordlist = new ArrayList<String> ();
		 try{
			  FileInputStream fstream = new FileInputStream("/home/vijaiya/Desktop/hack/wordlist.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  //Read File Line By Line
			  while ((strLine = br.readLine()) != null)   {
				  wordlist.add(strLine);
			  }
			  in.close();
			}catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
	 		ArrayList<String> name = new ArrayList<String>();
	 		Scanner in = new Scanner(System.in);
	 		String str;
			WordMatcher wrd = new WordMatcher();
		    while((str=in.next()).length()>0)
		    {	
		  	str.trim();
		    	name.add(str);
			if(name.size() == 1)
			{
				wrd.arrayMatch(wordlist, name);
			}
		    } 
		    in.close();  
		  }
}
